package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week2.day4.Movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MovieRunner
{
    public static void main(String[] args)
    {
        MovieRunner mr = new MovieRunner();

        List<String[]> movieData = mr.getData();

        //mr.saveToDb(movieData);

        System.out.println();

        List<String> movieNames = mr.getMoviesFromDbForYear(new int[]{1995, 2007});

        System.out.println("Movie Names for Given Years :");

        for (String name : movieNames)
        {
            System.out.println(name);
        }

        System.out.println();

        Set<Movie> movies = mr.getMoviesForGenre("Action");

        System.out.println("Movies of Action Genre :");

        for (Movie movie : movies)
        {
            System.out.println(movie);
        }

    }

    private Set<Movie> getMoviesForGenre(String genre)
    {
        Set<Movie> movies = new HashSet<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement pstmt = con.prepareStatement("select * from movie_data where genre = (?)"))
        {
            pstmt.setString(1, genre);
            try(ResultSet rs = pstmt.executeQuery())
            {
                while (rs.next())
                {
                    Movie movie = new Movie();
                    movie.setMovieName(rs.getString(1));
                    movie.setYear(rs.getInt(2));
                    movie.setGenre1(rs.getString(3));
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

    private List<String> getMoviesFromDbForYear(int[] year)
    {
        List<String> movieNames = new ArrayList<>();

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement pstmt = con.prepareStatement("select name from movie_data where year = (?)"))
        {

            for (int i : year)
            {
                pstmt.setInt(1, i);

               try(ResultSet rs = pstmt.executeQuery())
               {
                   while (rs.next())
                   {
                       movieNames.add(rs.getString(1));
                   }
               }
               catch (SQLException e)
               {
                   e.printStackTrace();
               }

            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return movieNames;
    }

    private void saveToDb(List<String[]> movieData)
    {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement pstmt = con.prepareStatement("insert into movie_data values (?, ?, ?)"))
        {
            for (String[] data : movieData)
            {
                pstmt.setString(1, data[0]);
                pstmt.setInt(2, Integer.parseInt(data[1]));
                pstmt.setString(3, data[2]);
                pstmt.executeUpdate();
                System.out.println("Movie " + data[0] + " has been inserted into the table");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    private List<String[]> getData()
    {
        List<String[]> movieData = new ArrayList<>();

        movieData.add(new String[]{"Enthiran", "2010", "Sci-Fi"});
        movieData.add(new String[]{"Kabali", "2016", "Action"});
        movieData.add(new String[]{"Superstar", "2002", "Drama"});
        movieData.add(new String[]{"Baasha", "1995", "Action"});
        movieData.add(new String[]{"Muthu", "1995", "Drama"});
        movieData.add(new String[]{"Sivaji: The Boss", "2007", "Action"});
        movieData.add(new String[]{"Petta", "2019", "Action"});
        movieData.add(new String[]{"Shivaji", "2007", "Action"});
        movieData.add(new String[]{"Kaala", "2018", "Drama"});

        return movieData;
    }
}
