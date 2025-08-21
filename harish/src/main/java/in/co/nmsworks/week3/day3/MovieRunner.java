package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week2.day4.Movie;

import java.sql.*;
import java.util.*;

public class MovieRunner {
    public static void main(String[] args) {
        MovieRunner mr = new MovieRunner();
        List<String[]> movieData = mr.getData();
        //mr.saveToDb(movieData);
        int[] year = {2007,2019,1995};

        String genre = "Action";
        Map<String,Integer> years= new HashMap();
        years =  mr.getMoviesFromYear(year);
        int givenYear = 1995;

        for (Map.Entry<String, Integer> movie : years.entrySet()) {
            if(movie.getValue() == givenYear){
                System.out.println("Movie name of the " + givenYear  + " Year : " + movie.getKey());
            }

        }
        Set<Movie> movies = mr.getMovieFromGenre("Action");
        //System.out.println(movies.size());
    }

    private Set<Movie> getMovieFromGenre(String genre) {
        Set<Movie> genreWiseMovies = new HashSet<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training")){
            PreparedStatement preparedStatement = connection.prepareStatement("select * from movies_details where genre = ?");
            preparedStatement.setString(1,genre);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()) {

                    //System.out.println(rs.getString(3));
                    Movie m = new Movie(rs.getString(1),rs.getInt(2),rs.getString(3));
                    genreWiseMovies.add(m);
                }
           //System.out.println(genreWiseMovies.size());
            } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return genreWiseMovies;


    }


    private Map<String,Integer> getMoviesFromYear(int[] year) {

        Map<String,Integer> yearWiseMovies = new HashMap<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training")){
            PreparedStatement preparedStatement = connection.prepareStatement("select * from movies_details where year_of_release = ?");
            for (int i : year) {

                preparedStatement.setInt(1,i);
                ResultSet rs = preparedStatement.executeQuery();
                while(rs.next()) {
                    yearWiseMovies.putIfAbsent(rs.getString(1), rs.getInt(2));
                }
            }
            return yearWiseMovies;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void saveToDb(List<String[]> movieData) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement preparedStatement = connection.prepareStatement("Insert into movies_details values(?,?,?)");
            for (String[] movieDatas : movieData) {
                preparedStatement.setString(1,movieDatas[0]);
                preparedStatement.setInt(2,Integer.parseInt(movieDatas[1]));
                preparedStatement.setString(3,movieDatas[2]);
                int rows = preparedStatement.executeUpdate();
            }
        }

        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String[]> getData() {
        List<String[]> movies = new ArrayList<>();
        String[] arr1 = {"Enthiran","2010","Sci-Fi"};
        String[] arr2 = {"Kabali","2016","Action"};
        String[] arr3 = {"SuperStar","2002","Drama"};
        String[] ar4 = {"Baasha","1995","Action"};
        String[] arr5 = {"Muthu","1995","Drama"};
        String[] arr6 = {"Shiavji-The Boss","2007","Action"};
        String[] arr7 = {"Petta","2019","Action"};
        String[] arr8 = {"Thalapathi","1991","Drama"};
        String[] arr9 = {"Shivaji","2007","Action"};
        String[] arr10  = {"Kaala","2018","Drama"};

        movies.add(arr1);
        movies.add(arr2);
        movies.add(arr3);
        movies.add(ar4);
        movies.add(arr5);
        movies.add(arr6);
        movies.add(arr7);
        movies.add(arr8);
        movies.add(arr9);
        movies.add(arr10);
        return  movies;

    }
}
