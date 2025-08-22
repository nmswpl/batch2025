package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoviesPersistor {
    public static void main(String[] args) {

//        create an object
        MoviesPersistor mp = new MoviesPersistor();
//        give movies
        List<Movie> list1 = mp.getMoviesFromTheFile("/home/nms-training/Downloads/MovieName.txt");
        for (Movie s : list1) {
            System.out.println(s);
        }
//        save to DB
        Set<Movie> set1 = mp.saveToDb(list1);
        for (Movie s1 : set1) {
            System.out.println(s1);
        }

//        DB to file
        mp.dbToFileSave("/home/nms-training/Downloads/AllMoviesNames.txt");

    }

    private void dbToFileSave(String fileName) {

        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "nms-training";

        try (
                Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Movies");
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        ) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                bw.write(rsmd.getColumnName(i));
                if (i < columnCount) bw.write("\t");
            }
            bw.newLine();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    bw.write(rs.getString(i));
                    if (i < columnCount) bw.write("\t");
                }
                bw.newLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




    private Set<Movie> saveToDb(List<Movie> list) {

        Set<Movie> set1 = new HashSet<>();

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/training",
                "nms-training",
                "nms-training")) {

            // Insert movies
            String insertSQL = "INSERT INTO Movies (name, yearOfRelease, genre) VALUES (?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(insertSQL)) {
                for (Movie s : list) {
                    ps.setString(1, s.getMovieName());
                    ps.setInt(2, s.getYearOfRelease());
                    ps.setString(3, s.getGenre());
                    ps.executeUpdate();
                }
            }

            // Now query all movies
            String selectSQL = "SELECT * FROM Movies";
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery(selectSQL)) {

                while (rs.next()) {
                    Movie movie = new Movie(
                            rs.getString("name"),
                            rs.getInt("yearOfRelease"),
                            rs.getString("genre")
                    );
                    set1.add(movie);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return set1;

    }

    private List<Movie> getMoviesFromTheFile(String fileName) {


        List<Movie> storeMovies1 = new ArrayList<>();

        try (BufferedReader br = new BufferedReader((new FileReader(fileName)))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] splitFile = line.split(",");

                Movie movie1 = new Movie();

                movie1.setMovieName(splitFile[0]);
                movie1.setYearOfRelease(Integer.parseInt(splitFile[1]));
                movie1.setGenre(splitFile[2]);

                storeMovies1.add(movie1);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return storeMovies1;
    }
}
