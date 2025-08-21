package in.co.nmsworks.week3.day3;



import in.co.nmsworks.week2.day4.movie.Movie;

import java.sql.*;
import java.util.*;

public class MovieRunner {
    public static void main(String[] args) {
        MovieRunner mr = new MovieRunner();

        //mr.saveToDb(mr.getData());
        int[] year = {2016,2007};
        Map<Integer,List<String>> yearWiseMovies = mr.getMOviesFromDbForYear(year);
        System.out.println();
        for (Map.Entry<Integer, List<String>> movieEntry : yearWiseMovies.entrySet()) {
            System.out.println(movieEntry.getKey()+" Release movie List : "+movieEntry.getValue());
        }

        String genre = "Action";
        Set<Movie> movies = mr.getMoviesForGenre(genre);
        System.out.println();
        System.out.println("****************** "+genre + " Movies List ******************");
        System.out.println();
        for (Movie movie : movies) {
            System.out.println("Movie Name : "+movie.getMovieName()+" \t Year of Release : "+movie.getYear());
        }

    }

    private Set<Movie> getMoviesForGenre(String genre) {
        Set<Movie> movies = new HashSet<>();
        String query = "SELECT * FROM MOVIE WHERE GENRE = ?";
        ResultSet rs = null;

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareCall(query))
        {

            ps.setString(1,genre);
            rs = ps.executeQuery();
            while (rs.next()){
                Movie movie = new Movie(rs.getString("NAME"),rs.getInt("YEAR"),rs.getString("GENRE"));
                movies.add(movie);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return movies;
    }


    private Map<Integer,List<String>> getMOviesFromDbForYear(int[] years) {

        Map<Integer,List<String>> yearWiseMovies = new HashMap<>();

        String getQuery = "SELECT NAME FROM MOVIE WHERE YEAR = ?";
        ResultSet rs = null;

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             PreparedStatement ps = con.prepareStatement(getQuery))
        {
            for (int year : years) {
                ps.setInt(1,year);
                rs = ps.executeQuery();
                List<String> movies = new ArrayList<>();

                while (rs.next()){
                    movies.add(rs.getString("NAME"));
                }

                yearWiseMovies.put(year,movies);

            }
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return yearWiseMovies;
    }

    private void saveToDb(List<String[]> movies) {

        String insertQuery = "INSERT INTO MOVIE VALUES(?,?,?)";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             PreparedStatement ps = con.prepareStatement(insertQuery))
        {
            for (String[] movie : movies) {

                String name = movie[0];
                int year = Integer.parseInt(movie[1]);
                String genre = movie[2];
                ps.setString(1,name);
                ps.setInt(2,year);
                ps.setString(3,genre);
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private List getData() {
        List<String[]> movies = new ArrayList<>();

        movies.add(new String [] {"Enthiran","2010","Sci-Fi"});
        movies.add(new String [] {"Kabali","2016","Action"});
        movies.add(new String [] {"Superstar","2002","Drama"});
        movies.add(new String [] {"Baasha","1995","Action"});
        movies.add(new String [] {"Muthu","1995","Drama"});
        movies.add(new String [] {"Sivaji: The Boss","2007","Action"});
        movies.add(new String [] {"Petta","2019","Action"});
        movies.add(new String [] {"Thalapathi","1991","Drama"});
        movies.add(new String [] {"Shivaji","2007","Action"});
        movies.add(new String [] {"Kaala","2018","Drama"});

        return movies;

    }
}
