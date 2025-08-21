package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week2.day4.Movie;

import java.sql.*;
import java.util.*;

public class MovieRunner {

    private static Map<Integer, List<String>> getMoviesFromDBBasedOnYear(int... yearArray) {
        Map<Integer, List<String>> moviesInYear = new HashMap<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            PreparedStatement ps = con.prepareStatement("Select movieName from Movies Where yearOfRelease = ?");

            for (int i : yearArray) {
                ps.setInt(1, i);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String value = rs.getString(1);
                    List<String> moviesList;
                    if (moviesInYear.containsKey(i)) {
                        moviesList = moviesInYear.get(i);
                    } else {
                        moviesList = new ArrayList<>();
                        moviesInYear.put(i, moviesList);
                    }
                    moviesList.add(value);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return moviesInYear;
    }

    private static void saveToDB(List<String[]> moviesData) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            PreparedStatement ps = con.prepareStatement("insert into Movies values(?,?,?)");

            for (String[] movieData : moviesData) {
                ps.setString(1, movieData[0]);
                ps.setInt(2, Integer.parseInt(movieData[1]));
                ps.setString(3, movieData[2]);
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private List<String[]> getData() {
        List<String[]> movieData = new ArrayList<>();
        movieData.add(new String[]{"Superstar", "2010", "SCIENCE_FICTION"});
        movieData.add(new String[]{"Kabali", "2016", "ACTION"});
        movieData.add(new String[]{"Enthiran", "2002", "Drama"});
        movieData.add(new String[]{"Baasha", "1995", "ACTION"});
        movieData.add(new String[]{"Muthu", "1995", "Drama"});
        movieData.add(new String[]{"Sivaji : The Boss", "2007", "Action"});
        movieData.add(new String[]{"Petta", "2019", " Action"});
        movieData.add(new String[]{"Thalapathi", "1991", "Drama"});
        movieData.add(new String[]{"Shivaji", "2007", "Action"});
        movieData.add(new String[]{"Kaala", "2018", "Drama"});

        return movieData;
    }


    private static Set<in.co.nmsworks.week2.day4.Movie> moviesFormDBForGenre(String genre) {
        Set<Movie> moviesBasedOnGenre = new HashSet<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            PreparedStatement ps = con.prepareStatement("Select * from Movies where Genre = ?;");

            ps.setString(1,genre);
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next())
            {
                DBToMovies(resultSet,moviesBasedOnGenre,genre);
            }

            System.out.println("gfska");
            System.out.println(moviesBasedOnGenre);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return moviesBasedOnGenre;

    }
    private static void DBToMovies(ResultSet resultSet, Set<Movie> movies, String genre) throws SQLException
    {
        while (resultSet.next())
        {
            try
            {
                if (resultSet.getString(3).toLowerCase().equals(genre.toLowerCase()))
                {
                    movies.add(new Movie(resultSet.getString(1), resultSet.getInt(2), resultSet.getString(3)));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {
        MovieRunner mr = new MovieRunner();
        List<String[]> movieData = new ArrayList<>();

        //movieData = mr.getData();

        //saveToDB(movieData);

        Map<Integer, List<String>> moviesInYear = new HashMap<>();
        moviesInYear = getMoviesFromDBBasedOnYear(1995, 2002);
        System.out.println();
        System.out.println(moviesInYear);

        Set<in.co.nmsworks.week2.day4.Movie> moviesBasedOnGenre = new HashSet<>();
        moviesBasedOnGenre = moviesFormDBForGenre("Drama");



        }



}


