package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week2.day4.Movie;

import java.sql.*;
import java.util.*;

public class MovieRunner {
    public static void main(String[] args) {
        MovieRunner mr = new MovieRunner();
        List<String[]> movies = new ArrayList<>();
        mr.getData(movies);
//        mr.savetoDb(movies);
        int[] years = {1995,2007};
        mr.getMoviesForYear(years);
        System.out.println(mr.getGenreWiseMovies("Action"));

    }

    public List<String[]> getData( List<String[]> movies){
        movies.add(new String[]{"Endhiran","2010","Sci-fi"});
        movies.add(new String[]{"Kabali","2016","Action"});
        movies.add(new String[]{"Superstar","2002","Drama"});
        movies.add(new String[]{"Baasha","1995","Action"});
        movies.add(new String[]{"Muthu","1995","Drama"});
        movies.add(new String[]{"Shivaji: The Boss","2007","Action"});
        movies.add(new String[]{"Petta","2019","Action"});
        movies.add(new String[]{"Thalapathi","1991","Drama"});
        movies.add(new String[]{"Shivaji","2007","Action"});
        movies.add(new String[]{"Kaala","2018","Drama"});


        return movies;
    }

    public void savetoDb(List<String[]> movies){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training"); Statement stmt = con.createStatement()){

            PreparedStatement ps = con.prepareStatement("INSERT INTO Movie VALUES (?,?,?)");
            ResultSet rs = ps.executeQuery("SELECT * FROM Movie");
            for (String[] movie : movies) {
                ps.setString(1,movie[0]);
                ps.setInt(2, Integer.parseInt(movie[1]));
                ps.setString(3,movie[2]);
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getMoviesForYear(int[] years){
        Map<Integer,List<String>> yearWiseMovies = new HashMap<>();
        String sql = "SELECT name,yearOfRelease FROM Movie WHERE yearOfRelease IN (";
        for (int i = 0; i < years.length; i++) {
            sql += "?";
            if(i < years.length-1){
                sql += ",";
            }
        }
        sql+=")";

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training"); ){
            PreparedStatement ps = con.prepareStatement(sql);
            for (int i = 0; i < years.length; i++) {
                ps.setInt(i+1, years[i]);
            }
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    int year = rs.getInt(2);
                    String movieName = rs.getString(1);
                    if (!yearWiseMovies.containsKey(year)) {
                        yearWiseMovies.put(year, new ArrayList<>());
                    }
                    yearWiseMovies.get(year).add(movieName);
                }
            System.out.println(yearWiseMovies);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<Movie> getGenreWiseMovies(String genre){
        Set<Movie> movies = new HashSet<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement pstmt = con.prepareStatement("SELECT * from Movie where genre = (?)"))
        {
            pstmt.setString(1, genre);
            try(ResultSet rs = pstmt.executeQuery())
            {
                while (rs.next())
                {
                    Movie movie = new Movie();
                    movie.setName(rs.getString(1));
                    movie.setYearOfRelease(rs.getInt(2));
                    movie.setGenre(rs.getString(3));
                    movies.add(movie);
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return movies;
    }
}
