package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoviePersister
{
    public static void main(String[] args)
    {
        MoviePersister mp = new MoviePersister();

        /*String fileName = "/home/nms-training/Downloads/MovieName.txt";

        List<Movie> moviesFromFile = mp.getMoviesFromFile(fileName);

        mp.saveMoviesToDb(moviesFromFile);

        String query = "select * from movie_data";

        Set<Movie> moviesFromDb = mp.getAllMoviesFromDb(query);*/

        String newFileName = "/home/nms-training/Downloads/DBMovieName.txt";

        //mp.writeAllMoviesToFile(moviesFromDb, newFileName);

        List<Movie> movieCsvParsed = mp.parsingMovieCsvFile(newFileName);

        for (Movie movie : movieCsvParsed)
        {
            System.out.println(movie);
        }
    }

    private List<Movie> parsingMovieCsvFile(String newFileName)
    {
        List<Movie> moviesFromCsvFile = new ArrayList<>();

        try( BufferedReader br = new BufferedReader(new FileReader(newFileName)))
        {
            String line;

            while ((line = br.readLine()) != null)
            {
                String[] strArr = line.replace("\"", "").split(",");
                Movie movie = new Movie();
                movie.setMovieName(strArr[1].trim());
                movie.setYear(Integer.parseInt(strArr[2].trim()));
                movie.setGenre1(strArr[3].trim());
                moviesFromCsvFile.add(movie);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return moviesFromCsvFile;
    }

    private void writeAllMoviesToFile(Set<Movie> moviesFromDb,String newFileName)
    {
        try( BufferedWriter bw = new BufferedWriter(new FileWriter(newFileName)))
        {
            int id = 1;
            for (Movie movie : moviesFromDb)
            {
                String line = "\""+(id++) + "\", \"" + movie.getMovieName() + "\", \"" + movie.getYear() + "\", \"" + movie.getGenre1() + "\"";
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private Set<Movie> getAllMoviesFromDb(String query)
    {
        Set<Movie> moviesFromDb = new HashSet<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query))
        {
            while (rs.next())
            {
                String movieName = rs.getString(1);
                int movieYear = rs.getInt(2);
                String movieGenre = rs.getString(3);
                Movie movie = new Movie();
                movie.setMovieName(movieName);
                movie.setYear(movieYear);
                movie.setGenre1(movieGenre);
                moviesFromDb.add(movie);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return moviesFromDb;
    }

    private void saveMoviesToDb(List<Movie> moviesFromFile)
    {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement pstmt = con.prepareStatement("insert into movie_data values (?, ?, ?)") )
        {
            for (Movie movie : moviesFromFile)
            {
                pstmt.setString(1, movie.getMovieName());
                pstmt.setInt(2, movie.getYear());
                pstmt.setString(3, movie.getGenre1());
                pstmt.executeUpdate();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    private List<Movie> getMoviesFromFile(String fileName)
    {
        List<Movie> movies = new ArrayList<>();

        try( BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String content;
            br.readLine();
            while ( (content = br.readLine()) != null)
            {
                String[] strArr = content.split(",");
                Movie movie = new Movie();
                movie.setMovieName(strArr[0]);
                movie.setYear(Integer.parseInt(strArr[1]));
                movie.setGenre1(strArr[2]);
                movies.add(movie);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return movies;
    }
}
