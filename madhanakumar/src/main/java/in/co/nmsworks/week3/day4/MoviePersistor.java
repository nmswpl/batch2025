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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoviePersistor {
    public static void main(String[] args) {
        MoviePersistor moviePersistor = new MoviePersistor();
//        List<Movie> movieList = moviePersistor.getMoviesFromFile("/tmp/MovieName.txt");
//        moviePersistor.saveMovieToDB(movieList);
        Set<Movie> movieSet = moviePersistor.getAllMovies();
//        for (Movie movie : movieSet) {
//            System.out.println(movie);
//        }
        moviePersistor.writeMoviesIntoFile(movieSet,"/tmp/MovieNameUpdated.txt");
    }

    private void writeMoviesIntoFile(Set<Movie> movieSet, String filename) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(filename))){
            int i = 0;
            for (Movie movie : movieSet) {
                i++;
                String line = movie.getMovieName()+","+movie.getYearOfRelease()+","+movie.getGenere();
                br.write(i+","+line);
                br.newLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private Set<Movie> getAllMovies() {
        Set<Movie> movieSet = new HashSet<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
        PreparedStatement ps = con.prepareStatement("Select * from Movies")){
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                movieSet.add(new Movie(rs.getString(1),rs.getInt(2),rs.getString(3)));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return movieSet;
    }

//    private void saveMovieToDB(List<Movie> movieList) {
//        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
//            PreparedStatement ps = con.prepareStatement("INSERT INTO Movies VALUES (?,?,?)")) {
//            for (Movie movie : movieList) {
//                ps.setString(1, movie.getMovieName());
//                ps.setInt(2,movie.getYearOfRelease());
//                ps.setString(3,movie.getGenere());
//                int update = ps.executeUpdate();
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }

//    private List<Movie> getMoviesFromFile(String filename) {
//        List<Movie> movies = new ArrayList<>();
//        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
//            String line = br.readLine();
//            while ((line = br.readLine()) != null){
//                String[] movieString = line.split(",");
//               if(movieString.length >= 3){
//                   String movieName = movieString[0];
//                   int yearOfRelease = Integer.parseInt(movieString[1]);
//                   String genere = movieString[2];
//                   movies.add(new Movie(movieName,yearOfRelease,genere));
//               }
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return movies;
//    }
    
    
}
