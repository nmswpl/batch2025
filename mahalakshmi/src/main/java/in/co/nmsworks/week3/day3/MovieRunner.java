package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week2.day4.Movie;
import java.sql.*;
import java.util.*;

public class MovieRunner {

    public static void main(String[] args) throws SQLException {
        MovieRunner mr = new MovieRunner();
        List<String[]> movieData = mr.getData();
        mr.saveToDb(movieData);
        int[] year = {1995,2002};
        System.out.println(mr.getYearWiseMovie(year));
        String genre = "Action";
        Set<Movie> moviesSet = mr.getMoviesFromGenre(genre);
        for (Movie movie : moviesSet) {
            System.out.println(movie);
        }
    }

    private Set<Movie> getMoviesFromGenre(String genre) throws SQLException {
        Set<Movie> movieSet = new HashSet<>();
        ResultSet rs;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training","nms-training");
        try (PreparedStatement ps = con.prepareStatement("select * from Movie where genre = ?")) {
            ps.setString(1,genre);
            rs = ps.executeQuery();
            while(rs.next()) {
                movieSet.add(new Movie(rs.getString(1),rs.getInt(2),rs.getString(3)));
            }
            return movieSet;
        }
    }

    private Map<Integer,List<String>> getYearWiseMovie(int[] year) throws SQLException {
        Map<Integer,List<String>> movie = new HashMap<>();
        ResultSet rs;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training", "nms-training");
        try (PreparedStatement ps = con.prepareStatement("select name from Movie where yearOfRelease = ?")) {
            for (int i : year) {
                List<String> str = new ArrayList<>();
                ps.setInt(1,i);
                rs = ps.executeQuery();
                while(rs.next()) {
                    str.add(rs.getString(1));
                    movie.put(i,str);
                }
            }
            return movie;
        }
    }

    private void saveToDb(List<String[]> movieData) throws SQLException {
        int rows = 0;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training", "nms-training");
        try (PreparedStatement ps = con.prepareStatement("insert into Movie values (?,?,?)")) {
            for (String[] movieDatum : movieData) {
                ps.setString(1,movieDatum[0]);
                ps.setInt(2, Integer.parseInt(movieDatum[1]));
                ps.setString(3,movieDatum[2]);
                rows += ps.executeUpdate();
            }
        }
    }

    private List<String[]> getData() {
        List<String[]> movieData = new ArrayList<>();
        movieData.add(new String[]{"Enthiran","2010","Sci-fi"});
        movieData.add(new String[]{"Kabali","2016","Action"});
        movieData.add(new String[]{"Superstar","2002","Drama"});
        movieData.add(new String[]{"Baasha","1995","Action"});
        movieData.add(new String[]{"Muthu","1995","Drama"});
        movieData.add(new String[]{"Sivaji: The Boss","2007","Action"});
        movieData.add(new String[]{"Petta","2019","Action"});
        movieData.add(new String[]{"Thalapathi","1991","Drama"});
        movieData.add(new String[]{"Shivaji","2007","Action"});
        movieData.add(new String[]{"Kaala","2018","Drama"});
        return movieData;
    }
}
