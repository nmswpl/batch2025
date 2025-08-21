package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoviePersistor {
    public static void main(String[] args) throws IOException, SQLException {
        MoviePersistor mp = new MoviePersistor();
        String fileName = "/home/nms-training/Downloads/MovieName.txt";
        List<Movie> movieList = mp.getMoviesFromFile(fileName);
        mp.saveMemoriesToDb(movieList);
        Set<Movie> movieSet = mp.getAllMoviesFromDb();
        System.out.println(movieSet);
        mp.writeAllMoviesToFile(movieSet);
    }

    private void writeAllMoviesToFile(Set<Movie> movieSet) throws IOException {
        int sno = 1;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/tmp/AppendedMovieList.txt",false))) {
            for (Movie movie : movieSet) {
                bw.write((sno++)+". "+movie.getName()+","+movie.getYearOfRelease()+","+movie.getGenre());
                bw.newLine();
                bw.flush();
            }
        }
    }

    private Set<Movie> getAllMoviesFromDb() throws SQLException {
        Set<Movie> movieSet = new HashSet<>();
        ResultSet rs;
        Connection con = DriverManager.getConnection("jdbc:mysql://localHost:3306/training","nms-training","nms-training");
        try (PreparedStatement ps = con.prepareStatement("select * from Movie")) {
            rs = ps.executeQuery();
            while (rs.next()) {
                movieSet.add(new Movie(rs.getString(1),rs.getInt(2),rs.getString(3)));
            }
        }
        return movieSet;
    }

    private void saveMemoriesToDb(List<Movie> movieList) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localHost:3306/training","nms-training","nms-training");
        try (PreparedStatement ps = con.prepareStatement("insert into Movie (name,yearOfRelease,genre) values(?,?,?)")) {
            for (Movie movie : movieList) {
                ps.setString(1, movie.getName());
                ps.setInt(2,movie.getYearOfRelease());
                ps.setString(3,movie.getGenre());
                ps.executeUpdate();
            }
        }
    }

    private List<Movie> getMoviesFromFile(String fileName) throws IOException {
        List<Movie> movieList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String ch;
            while((ch = br.readLine()) != null) {
                String[] strArr = ch.split(",");
                if(!strArr[1].equals("Year")) {
                    movieList.add(new Movie(strArr[0],Integer.parseInt(strArr[1]),strArr[2]));
                }
            }
        }
        return movieList;
    }
}
