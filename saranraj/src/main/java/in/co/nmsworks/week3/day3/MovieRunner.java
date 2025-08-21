package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week2.day4.Movie;

import java.sql.*;
import java.util.*;

public class MovieRunner {
    public static void main(String[] args) {

        MovieRunner mr = new MovieRunner();
        List<String[]> listOfMovies =  mr.getData();
        mr.saveDb(listOfMovies);
        System.out.println("Year wise Movie List");
        int[] year ={1995,2010};
        Map<Integer,List<String>> yearWiseMovieName =  mr.getMovieForYear(year);
        for (Map.Entry<Integer,List<String>> movie : yearWiseMovieName.entrySet()) {
            System.out.println("year : "+movie.getKey()+"->"+movie.getValue());
        }

        System.out.println("Genre Wise Movie List");
        String genre ="Sci-Fi";
        Set<Movie> genreWiseMovies =mr.getMovieForGenre(genre);
        System.out.println("Genre :"+genre +"->" +genreWiseMovies.toString());
    }

    private Set<Movie> getMovieForGenre(String genre) {
        String sqlQuery = "select * from movie where genre = ?";

        Set<Movie> genreWiseMovie = new HashSet<>();
        ;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = conn.prepareStatement(sqlQuery)) {

            ps.setString(1,genre);
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String movieName =rs.getString("movie_name");
                int year =rs.getInt("year");
                String genreType =rs.getString("genre");
                Movie movie = new Movie(movieName,year,genreType);
                genreWiseMovie.add(movie);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return genreWiseMovie;
    }

    private Map<Integer,List<String>> getMovieForYear(int[] year) {

        Map<Integer,List<String>> yearWiseMovieName = new HashMap<>();

        String sqlQuery = "select * from movie where year = ?";
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = conn.prepareStatement(sqlQuery)){

            for (int i: year) {
                ps.setInt(1, i);
                ResultSet rs = ps.executeQuery();

                List<String> listOfMovie = new ArrayList<>();
                while (rs.next()) {
                    String name = rs.getString("movie_name");
                    int movieyear = rs.getInt("year");
                    listOfMovie.add(name);
                }
                yearWiseMovieName.put(i,listOfMovie);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return yearWiseMovieName;
    }

    private void saveDb(List<String[]> listOfMovies) {
        String sqlQuery = "insert into movie values(?,?,?)";



        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = conn.prepareStatement(sqlQuery)){

            for (int i = 0; i < listOfMovies.size(); i++) {
                String[] value =listOfMovies.get(i);
                ps.setString(1,value[0]);
                ps.setInt(2,Integer.parseInt(value[1]));
                ps.setString(3,value[2]);

                ps.executeUpdate();
            }




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String[]> getData() {

        List<String[]> listOfStringArray = new ArrayList<>();

        String[] movie1 = new String[]{"Enthiran","2010","Sci-Fi"};
        String[] movie2 = new String[]{"Kabali","2016","Action"};
        String[] movie3 = new String[]{"SuperStar","2002","Drama"};
        String[] movie4 = new String[]{"Baasha","1995","Action"};
        String[] movie5 = new String[]{"Muthu","1995","Drama"};
        String[] movie6 = new String[]{"Sivaji: The Boss","2007","Action"};
        String[] movie7 = new String[]{"Petta","2019","Action"};
        String[] movie8 = new String[]{"Thalapathi","1991","Drama"};
        String[] movie9 = new String[]{"Shivaji","2007","Action"};
        String[] movie10 = new String[]{"Kaala","2018","Drama"};

        listOfStringArray.add(movie1);
        listOfStringArray.add(movie2);
        listOfStringArray.add(movie3);
        listOfStringArray.add(movie4);
        listOfStringArray.add(movie5);
        listOfStringArray.add(movie6);
        listOfStringArray.add(movie7);
        listOfStringArray.add(movie8);
        listOfStringArray.add(movie9);
        listOfStringArray.add(movie10);

      return listOfStringArray;
    }


}
