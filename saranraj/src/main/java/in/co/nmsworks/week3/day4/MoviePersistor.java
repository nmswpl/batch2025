package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class MoviePersistor {
    public static void main(String[] args) {
        MoviePersistor mp = new MoviePersistor();
        List<Movie> listOfMovies = getAllMoviesFromFile();
        System.out.println(listOfMovies);
//        mp.saveMoviesToDb(listOfMovies);
//        Set<Movie> movieSet = mp.getAllMovies();
//        mp.writeIntoNewMovie(movieSet);
        mp.getAllMovieFromFile1();


    }

    private void writeIntoNewMovie(Set<Movie> movieSet) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/NewMovie.txt"))) {

            String sentence = "";
            int count = 1;
            for (Movie movie : movieSet) {
                String words = movie.getMovieName() + " , " + movie.getYearOfRelease() + " , " + movie.getGenre();

                sentence += count + ", " + words + "\n";
                count++;
            }
            bw.write(sentence);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Set<Movie> getAllMovies() {

        Set<Movie> setOfMovie = new HashSet<>();
        String sqlQuery = "select * from movie";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = conn.prepareStatement(sqlQuery)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String movieName = rs.getString("movie_name");
                int year = rs.getInt("year");
                String genre = rs.getString("genre");
                setOfMovie.add(new Movie(movieName, year, genre));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return setOfMovie;
    }

    private void saveMoviesToDb(List<Movie> listOfMovies) {
        String sqlQuery = "insert into movie values(?,?,?)";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training",
                "nms-training", "nms-training");
             PreparedStatement ps = conn.prepareStatement(sqlQuery)) {
            for (Movie movies : listOfMovies) {
                ps.setString(1, movies.getMovieName());
                ps.setInt(2, movies.getYearOfRelease());
                ps.setString(3, movies.getGenre());
                ps.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Movie> getAllMoviesFromFile() {
        List<Movie> listOfMovies = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieName.txt"))) {


            String line = "";
            while ((line = bf.readLine()) != null) {
                String[] lineSeparator = line.split(",");
                if (lineSeparator[0].equals("Movie")) {
                    continue;
                }
                int year = Integer.parseInt(lineSeparator[1]);
                Movie movieObject = new Movie(lineSeparator[0], year, lineSeparator[2]);
                listOfMovies.add(movieObject);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listOfMovies;
    }

    private static List<Movie> getAllMovieFromFile1() {
        List<Movie> listOfMovies = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieName.txt"))) {
            String line;
            bf.readLine();
            while ((line = bf.readLine()) != null) {

                String[] lineSeparator = line.split(",");
                String movieName=lineSeparator[0].trim();
                int year = Integer.parseInt(lineSeparator[1].trim());
                Movie movieObject = new Movie(movieName, year, lineSeparator[2]);
                listOfMovies.add(movieObject);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listOfMovies;
    }


}
