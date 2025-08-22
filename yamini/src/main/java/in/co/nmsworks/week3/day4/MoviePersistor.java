package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoviePersistor {
    static List<Movie> movies = new ArrayList<>();
    static Set<Movie> setMovies = new HashSet<>();

    public static void main(String[] args) throws FileNotFoundException, SQLException {
        MoviePersistor mp = new MoviePersistor();
        //System.out.println(mp.getMoviesFromFile());
       //mp.saveToDb(movies);
        Set<Movie> resultSet;
       resultSet= mp.getAllMoviesFromDb();
        //System.out.println(resultSet);
        //mp.writeToNewFile(resultSet);
    }

    private List<Movie> getMoviesFromFile() throws FileNotFoundException {

        //Movie mv = null;
        try (BufferedReader br = new BufferedReader(new FileReader("/tmp/MovieName.txt"))) {
            String result;
            br.readLine();
            while ((result = br.readLine()) != null) {
                //  System.out.println(result);
                String[] arr = result.split(",");
                movies.add(new Movie(arr[0], Integer.parseInt(arr[1]), arr[2]));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;

    }

    private void saveToDb(List<Movie> movies) throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("Insert into Movies values(?,?,?)")) {
            System.out.println(movies);
            for (Movie movie : movies) {
                ps.setString(1, movie.getMovieName());
                ps.setInt(2, movie.getYear());
                ps.setString(3, movie.getGenre());
                int res = ps.executeUpdate();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private Set<Movie> getAllMoviesFromDb() throws SQLException {
        ResultSet rs;

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("Select * from Movies")) {

            rs = ps.executeQuery();
            while (rs.next()) {
                String name=rs.getString(1);
                int year=rs.getInt(2);
                String genre=rs.getString(3);
                setMovies.add(new Movie(name,year,genre));
            }

        }
return setMovies;
    }

    private void writeToNewFile(Set<Movie> setMovies){
        try(BufferedWriter bwr=new BufferedWriter(new FileWriter("/tmp/Movies.txt"))){
           // bwr.write("Hii");
            for (Movie movie : setMovies) {
                bwr.write("name: "+movie.getMovieName()+"Year: "+movie.getYear()+"Genre: "+movie.getGenre());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

