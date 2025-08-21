package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;

import java.io.*;
import java.sql.*;
import java.util.*;

public class MoviePresistor {
    public static void main(String[] args) {
        MoviePresistor mp = new MoviePresistor();
//        String fileName = "/home/nms-training/Downloads/MovieName.txt";
//        List<Movie> movies = mp.getMoviesFromFiles(fileName);
//        mp.setMovieDetailsToDb(movies);
//        Set<Movie> moviess = new HashSet<>();
//        moviess = mp.getMoviesFromDb();
//        mp.writeMoviesToFileFromDb(filename);
        String fileName1 = "/home/nms-training/Downloads/DBMovieName.txt";
        List<Movie> movie2 =  mp.getMoviesFromFiles1(fileName1);
        //System.out.println(movie2.size());
        for (Movie movie : movie2) {
            System.out.println(movie);
        }


    }

    private void writeMoviesToFileFromDb() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement preparedStatement = connection.prepareStatement("Select * from movies_details")) {
            ResultSet resultSet = preparedStatement.executeQuery();
            BufferedWriter bf = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/MoviesNames.txt"));
            String statment;
            int i = 1;
            while (resultSet.next()) {
                statment = i + "," + resultSet.getString(1) + "," + resultSet.getInt(2) + "," + resultSet.getString(3);
                System.out.println(statment);
                bf.write(statment);
                bf.flush();
                bf.newLine();
                i++;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Set<Movie> getMoviesFromDb() {
        Set<Movie> movies = new HashSet<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement preparedStatement = connection.prepareStatement("Select * from movies_details")) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Movie movie = new Movie();
                movie.setMovieName(resultSet.getString(1));
                movie.setYear(resultSet.getInt(2));
                movie.setGenre(resultSet.getString(3));
                movies.add(movie);
            }
            return movies;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void setMovieDetailsToDb(List<Movie> movies) {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training"); PreparedStatement
                preparedStatement = connection.prepareStatement("Insert into movies_details values(?,?,?)")) {

            for (Movie movie : movies) {
                preparedStatement.setString(1, movie.getMovieName());
                preparedStatement.setInt(2, movie.getYear());
                preparedStatement.setString(3, movie.getGenre());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private List<Movie> getMoviesFromFiles(String fileName) {
        List<Movie> movies = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            String rows;


            while ((rows = bufferedReader.readLine()) != null) {

                String[] movieDetails = movieDetails = rows.split(",");
                if (!movieDetails[0].equals("Movie")) {
                    Movie movie = new Movie();
                    System.out.println(Arrays.toString(movieDetails));
                    movie.setMovieName(movieDetails[0]);
                    movie.setYear(Integer.parseInt(movieDetails[1]));
                    movie.setGenre(movieDetails[2]);
                    movies.add(movie);

                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return movies;
    }

    private List<Movie> getMoviesFromFiles1(String fileName) {
        List<Movie> movies = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            String rows;


            while ((rows = bufferedReader.readLine()) != null) {

                String[] movieDetails = rows.split(", ");

                movieDetails[2] = movieDetails[2].substring(1,movieDetails[2].length()-1);
                //System.out.println(movieDetails[2]);
                if (!movieDetails[1].equals("Movie")) {
                    Movie movie = new Movie();
                    //System.out.println(Arrays.toString(movieDetails));
                    movie.setMovieName(movieDetails[1]);
                    movie.setYear(Integer.parseInt(movieDetails[2]));
                    movie.setGenre(movieDetails[3]);
                    movies.add(movie);

                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return movies;
    }


}
