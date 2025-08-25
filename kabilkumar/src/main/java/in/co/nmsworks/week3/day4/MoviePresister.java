package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week3.day3.MovieRunner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoviePresister
{
    public static void main(String[] args) {
        MoviePresister mp = new MoviePresister();
        List<Movie> result  = mp.getMovieFilefromdb("/tmp/MovieName.txt");
     //   System.out.println(result);
        saveMovieToDataBase(result);

    }

    public List<Movie>  getMovieFilefromdb(String filename)
    {
        List<Movie> movies = new ArrayList<>();
       try (BufferedReader br = new BufferedReader(new FileReader(filename))){

           String line;
           br.readLine();
           while ((line = br.readLine()) != null)
           {
               String[] split = line.split(",");
               System.out.println(Arrays.toString(split));
               Movie m = new Movie(split[0],Integer.parseInt(split[1]) ,split[2]);
               movies.add(m);
           }
           
       } 
       catch (IOException e) 
       {
           throw new RuntimeException(e);
       }
       return movies;
    }
    public static void saveMovieToDataBase(List<Movie> saveDB)
    {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            PreparedStatement ps = con.prepareStatement("insert into Movies values(?,?,?)");
            {
                for (Movie movie : saveDB) {
                    ps.setString(1,movie.getMovie());
                    ps.setInt(2,movie.getYear());
                    ps.setString(3,movie.getGener());
                    ps.executeUpdate();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }






}
