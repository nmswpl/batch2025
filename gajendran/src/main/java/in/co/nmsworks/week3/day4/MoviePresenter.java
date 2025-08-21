package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;
import in.co.nmsworks.week2.day4.Report;

import java.io.*;
import java.sql.*;
import java.util.*;

public class MoviePresenter
{



    private void writeAllMoviesToFile(Set<Movie> movieInSet, String fileName)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)))
        {
            writer.write("Movie,Year,Genre");
            writer.newLine();
            int i = 1;
            for (Movie movie : movieInSet)
            {
                writer.write(i+" - "+movie.getMovieName()+","+movie.getYearOfRelease()+","+movie.getGenre_());
                i++;
                writer.flush();
                writer.newLine();
            }}
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

    private Set<Movie> getAllMoviesFromDB()
    {
        Set<Movie> moviesInSet = new HashSet<>();

        Statement stmt;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training"))
        {
            stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("Select * from Movies");

            while (resultSet.next()){
                moviesInSet.add(new Movie(resultSet.getString(1),resultSet.getInt(2),resultSet.getString(3)));
            }
            System.out.println("DB to File");
            System.out.println(moviesInSet);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




        return moviesInSet;
    }

    private void saveMovieToDB(List<Movie> movies)
    {
        //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training"))
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training"))
        {
            PreparedStatement pS = connection.prepareStatement("insert into Movies values(?,?,?);");

            for (Movie movie : movies)
            {
                pS.setString(1,movie.getMovieName());
                pS.setInt(2,movie.getYearOfRelease());
                pS.setString(3,movie.getGenre_());
                pS.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    private List<Movie> getMoviesFromFile(String fileName)
    {
        List<Movie> movies = new ArrayList<>();
        StringBuffer content = new StringBuffer();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String s = br.readLine();
            while((s = br.readLine()) != null){
                content.append(s);
                String[] movieData = s.split(",");
                movies.add(new Movie(movieData[0],Integer.parseInt(movieData[1]),movieData[2]));
            }

        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return movies;
    }



    private List<Movie> getMoviesFromCsvFile(String fileName) {

        List<Movie> movies = new ArrayList<>();
        StringBuffer content = new StringBuffer();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String s;
            while((s = br.readLine()) != null){
                content.append(s.replace("\"",""));
                String[] movieData = s.replace("\"","").split(",");
                movies.add(new Movie(movieData[1].trim(),Integer.parseInt(movieData[2].trim()),movieData[3].trim()));
            }

        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return movies;

    }


    public static void main(String[] args)
    {
        MoviePresenter moviePresenter = new MoviePresenter();
        List<Movie> movies = new ArrayList<>();
        String fileName = "/home/nms-training/Documents/MovieName.txt";
        movies = moviePresenter.getMoviesFromFile(fileName);

        System.out.println("File to object");
        System.out.println(movies);

        //moviePresenter.saveMovieToDB(movies);

        Set<Movie> movieInSet = moviePresenter.getAllMoviesFromDB();

        moviePresenter.writeAllMoviesToFile(movieInSet,"/home/nms-training/Documents/Movies_Saves_from_DB.txt");
        List<Movie> listOfMoviesFromCSV = new ArrayList<>();
        fileName = "/home/nms-training/Downloads/DBMovieName.txt";
        listOfMoviesFromCSV = moviePresenter.getMoviesFromCsvFile(fileName);

        int i = 1;
        for (Movie movie : listOfMoviesFromCSV) {
            System.out.print(i+ " - ");
            i++;
            System.out.println(movie.toString());
        }



    }

}