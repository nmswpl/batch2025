package in.co.nmsworks.week3.day4;

import java.sql.*;
import java.util.*;

public class MovieRunner {

    public List<String[]> getData() {
        List<String[]> movies = new ArrayList<>();
        movies.add(new String[]{"Enthiran", "2010", "Sci-Fi"});
        movies.add(new String[]{"Kabali", "2016", "Action"});
        movies.add(new String[]{"Superstar", "2002", "Drama"});
        movies.add(new String[]{"Baasha", "1995", "Action"});
        movies.add(new String[]{"Muthu", "1995", "Drama"});
        movies.add(new String[]{"Sivaji: The Boss", "2007", "Action"});
        movies.add(new String[]{"Petta", "2019", "Action"});
        movies.add(new String[]{"Thalapathi", "1991", "Drama"});
        movies.add(new String[]{"Shivaji", "2007", "Action"});
        movies.add(new String[]{"Kaala", "2018", "Drama"});
        return movies;
    }

    public void saveToDb(List<String[]> movies) {
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "nms-training";
        String query = "INSERT INTO movies (name, year_of_release, genre) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            for (String[] movie : movies) {
                stmt.setString(1, movie[0]);
                stmt.setInt(2, Integer.parseInt(movie[1]));
                stmt.setString(3, movie[2]);
                stmt.addBatch();
            }
            int[] results = stmt.executeBatch();
            System.out.println(results.length + " records inserted");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    public Map<Integer, List<String>> getMovieFromYear(Integer[] years) {
        Map<Integer, List<String>> movieMap = new HashMap<>();
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "nms-training";
        String query = "SELECT name FROM movies WHERE year_of_release = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = conn.prepareStatement(query)) {

            for (Integer year : years) {
                ps.setInt(1, year);
                try (ResultSet rs = ps.executeQuery()) {
                    List<String> movies = new ArrayList<>();
                    while (rs.next()) {
                        movies.add(rs.getString("name"));
                    }
                    movieMap.put(year, movies);
                }
            }
        } catch (SQLException e) {
            System.out.println("DB Error" + e.getMessage());
        }
        return movieMap;
    }


    public Set<String> getMovieForGenre(String genre) {
        Set<String> movieSet = new HashSet<>();
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "nms-training";
        String query = "SELECT name FROM movies WHERE genre = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, genre);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    movieSet.add(rs.getString("name"));
                }
            }

        } catch (SQLException e) {
            System.out.println("DB Error" + e.getMessage());
        }

        return movieSet;
    }

    public static void main(String[] args) {
        MovieRunner mr = new MovieRunner();


        List<String[]> movieList = mr.getData();
        mr.saveToDb(movieList);


        Integer[] years = {1995, 2007, 2018};
        Map<Integer, List<String>> results = mr.getMovieFromYear(years);

        for (Integer year : results.keySet()) {
            System.out.println("Movies released in " + year);
            List<String> movies = results.get(year);
            if (movies.isEmpty()) {
                System.out.println("No movies found");
            } else {
                for (String movie : movies) {
                    System.out.println(movie);
                }
            }
        }


        System.out.println("\n Movies in genre: Action");
        Set<String> actionMovies = mr.getMovieForGenre("Action");
        for (String movie : actionMovies) {
            System.out.println(movie);
        }
    }
}
