package in.co.nmsworks.week3.day4;

import in.co.nmsworks.weeks.day4.Movie;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MoviePersistor {

    public static void main(String[] args) {
        MoviePersistor persistor = new MoviePersistor();
        String inputFilePath = "/tmp/movieName.txt";
        String outputFilePath = "/tmp/movieOutput.txt";

        List<Movie> moviesFromFile = persistor.getMoviesFromFile(inputFilePath);

        System.out.println("Movies read from file:");
        for (Movie movie : moviesFromFile) {
            System.out.println(movie);
        }

        persistor.saveMovieToDb(moviesFromFile);

        List<Movie> moviesFromDb = persistor.getAllMovie();

        System.out.println("\nMovies fetched from database:");
        for (Movie movie : moviesFromDb) {
            System.out.println(movie);
        }

        persistor.writeMoviesToFile(outputFilePath, moviesFromDb);

        System.out.println("\nAll movies written to file" + outputFilePath);
    }

    public List<Movie> getMoviesFromFile(String filePath) {
        List<Movie> movieList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String name = parts[0].trim();
                    int year = Integer.parseInt(parts[1].trim());

                    StringBuilder genreBuilder = new StringBuilder();
                    for (int i = 2; i < parts.length; i++) {
                        genreBuilder.append(parts[i].trim());
                        if (i < parts.length - 1) genreBuilder.append(",");
                    }
                    String genre = genreBuilder.toString();

                    movieList.add(new Movie(name, year, genre));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file" + e.getMessage());
        }

        return movieList;
    }

    public void saveMovieToDb(List<Movie> movies) {
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "nms-training";

        String query = "INSERT INTO movies (name, year_of_release, genre) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            for (Movie movie : movies) {
                stmt.setString(1, movie.getName());
                stmt.setInt(2, movie.getYearOfRelease());
                stmt.setString(3, movie.getGenre());
                stmt.addBatch();
            }
            int[] result = stmt.executeBatch();
            System.out.println(result.length + " movies inserted into DB");

        } catch (SQLException e) {
            System.out.println("Database error" + e.getMessage());
        }
    }

    public List<Movie> getAllMovie() {
        List<Movie> movies = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "nms-training";

        String query = "SELECT name, year_of_release, genre FROM movies";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String name = rs.getString("name");
                int year = rs.getInt("year_of_release");
                String genre = rs.getString("genre");

                movies.add(new Movie(name, year, genre));
            }
        } catch (SQLException e) {
            System.out.println("Database error" + e.getMessage());
        }

        return movies;
    }

    public void writeMoviesToFile(String filePath, List<Movie> movies) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            writer.write("Movie,Year,Genre");
            writer.newLine();

            for (Movie movie : movies) {

                String line = movie.getName()+ movie.getYearOfRelease()+ movie.getGenre();
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Movies successfully written to file" + filePath);

        } catch (IOException e) {
            System.out.println("Error writing to file " + e.getMessage());
        }
    }
}
