package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MoviePersistor {
    public static void main(String[] args) {
//        List <Movie> movies=new ArrayList<>();
//        MoviePersistor moviePersistor=new MoviePersistor();
////        moviePersistor.getMoviesFromFile();
//        moviePersistor.saveToDb((List<Movie>) moviePersistor);
//        moviePersistor.getAllMoviesFromDb();
//        moviePersistor.writeAllMovies(moviePersistor);

    }

    private void writeAllMovies(MoviePersistor moviePersistor) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/MovieName.txt"));) {
            writeAllMovies(moviePersistor);
            bw.write("hello program");


        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("WRITE to file movie");
    }


    private Set<Movie> getAllMoviesFromDb(){

        List <Movie> movieset=new ArrayList<>();
        String sql="SELECT * FROM movies";
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");

            PreparedStatement ps= connection.prepareStatement(sql)){
            try(ResultSet resultSet= ps.executeQuery()){
                while (resultSet.next()){
                    movieset.add((Movie) movieset);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    private List<Movie> saveToDb(List<Movie> movies) {
        String sql="INSERT INTO movies values(?,?,?)";
       try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps= connection.prepareStatement(sql)){

                    for(Movie movie:movies) {
                        ps.setString(1,movie.getMoviename());
                        ps.setInt(2, movie.getYearOfRealice());
                        ps.setString(3, movie.getGenre());
                        ps.executeUpdate();
                    }

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

//    private List<Movie> getMoviesFromFile() {
//        List<Movie> movieList=new ArrayList<>();
//
//        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieName(1).txt"));) {
//            String lines;
//            String[] line=line.split(",");
//            while ((line = new String[]{br.readLine()}) != null) {
//                System.out.println(line);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("Save to database movie 1");
//        return null;
//    }

}
