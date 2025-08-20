package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week2.day4.Movie;

import java.sql.*;
import java.util.*;

public class MovieRunner {

    public static void main(String[] args) {

        MovieRunner mr = new MovieRunner();
        List<String[]> movieData = mr.getData();

        //mr.saveToDB(movieData);

        int[] movieYears = new int[]{1995,2008};
        Map<Integer,List<String>> movies = mr.getMoviesFromDbForYear(movieYears);
        for (Map.Entry<Integer, List<String>> movie : movies.entrySet()) {
            System.out.println(movie.getKey() + " Movies : " + movie.getValue());
        }

        String genre = "Action";
        Set<Movie> moviesGenre  = mr.getMoviesForGenre(genre);
        System.out.println(genre + " Movies : " + moviesGenre.toString());
    }

    private List<String[]> getData() {

        List<String[]> arrayList = new ArrayList<>();
        arrayList.add(new String[]{"Enthiran", "2010", "sci-fi"});
        arrayList.add(new String[]{"Kabali", "2016", "Action"});
        arrayList.add(new String[]{"Superstar", "2022", "Drama"});
        arrayList.add(new String[]{"Baasha", "1995", "Action"});
        arrayList.add(new String[]{"Muthu", "1995", "Drama"});
        arrayList.add(new String[]{"Sivaji:The Boss", "2007", "Action"});
        arrayList.add(new String[]{"Petta", "2019", "Action"});
        arrayList.add(new String[]{"Thalapathy", "1991", "Drama"});
        arrayList.add(new String[]{"Shivaji", "2007", "Action"});
        arrayList.add(new String[]{"Kaala", "2008", "Drama"});
        return arrayList;
    }

    private void saveToDB(List<String[]> movieData) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement("INSERT INTO Movies VALUES (?,?,?)")) {

            for (String[] movieDatum : movieData) {
                ps.setString(1,movieDatum[0]);
                ps.setInt(2, Integer.parseInt(movieDatum[1]));
                ps.setString(3,movieDatum[2]);
                ps.executeUpdate();
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Map<Integer, List<String>> getMoviesFromDbForYear(int[] year){

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement("SELECT moviename FROM Movies Where yearOfRelease = ?")){

            Map<Integer, List<String>> movies = new HashMap<>();
            for (int i : year) {
                ps.setInt(1,i);
                ResultSet rs = ps.executeQuery();
                List<String> movieList = new ArrayList<>();
                while(rs.next()){
                    movieList.add(rs.getString(1));
                }
                movies.put(i,movieList);
            }
            return movies;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Set<Movie> getMoviesForGenre(String genre) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Movies Where genre = ?")){

            ps.setString(1,genre);

            Set<Movie> movieOfGivenGenre = new HashSet<>();

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                movieOfGivenGenre.add(new Movie(rs.getString(1),rs.getInt(2),rs.getString(3)));
            }
            return movieOfGivenGenre;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
