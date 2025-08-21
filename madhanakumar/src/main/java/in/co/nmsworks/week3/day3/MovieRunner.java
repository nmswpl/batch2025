package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week2.day4.Movie;

import java.sql.*;
import java.util.*;


public class MovieRunner {
    public static void main(String[] args) {
        MovieRunner movieRunner = new MovieRunner();
//        List<String[]> rajinimovie = movieRunner.getData();
//        movieRunner.saveToDb(rajinimovie);
        int[] year = {2007,2002,1995};
        try {
            Map<Integer, List<String>> moviesByYear = movieRunner.getMoviesForYear(year);
            movieRunner.yearWiseMovieName(moviesByYear);
            Set<Movie> moviesFilter = movieRunner.getMoviesForGenre("Action");
            for (Movie m : moviesFilter) {
                System.out.println(m);
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }

//    public List<String[]> getData(){
//        String [] moviesString1 = new String[]{"Enthiran","2010","Sci-fi"};
//        String [] moviesString2 = new String[]{"Kabali","2016","Action"};
//        String [] moviesString3 = new String[]{"Superstar","2002","Drama"};
//        String [] moviesString4 = new String[]{"Baasha","1995","Action"};
//        String [] moviesString5 = new String[]{"Muthu","1995","Drama"};
//        String [] moviesString6 = new String[]{"Sivaji: The Boss","2007","Action"};
//        String [] moviesString7 = new String[]{"Petta","2019","Action"};
//        String [] moviesString8 = new String[]{"Thalapathi","1991","Action"};
//        String [] moviesString9 = new String[]{"Shivaji","2007","Action"};
//        String [] moviesString10 = new String[]{"Kaala","2018","Drama"};
//        List<String[]> movies = new ArrayList<>();
//        movies.add(moviesString1);
//        movies.add(moviesString2);
//        movies.add(moviesString3);
//        movies.add(moviesString4);
//        movies.add(moviesString5);
//        movies.add(moviesString6);
//        movies.add(moviesString7);
//        movies.add(moviesString8);
//        movies.add(moviesString9);
//        movies.add(moviesString10);
//        return movies;
//
//    }

//    public void saveToDb(List<String[]> movies){
//        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
//            PreparedStatement stmt = con.prepareStatement("INSERT INTO Movies VALUES (?,?,?)")){
//            for (String[] movie : movies) {
//                stmt.setString(1, movie[0]);
//                stmt.setInt(2, Integer.parseInt(movie[1]));
//                stmt.setString(3, movie[2]);
//                int update = stmt.executeUpdate();
//            }
//            System.out.println("Completed!!!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public Map<Integer, List<String>> getMoviesForYear(int[] year) throws SQLException {
        Map<Integer, List<String>> groupByYear = new HashMap<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement stmt = con.prepareStatement("Select Movie from Movies where YearOfRelease = ?")) {
            ResultSet rs;
            for (int i = 0; i < year.length; i++) {
                stmt.setInt(1, year[i]);
                rs = stmt.executeQuery();
                List<String> movies = new ArrayList<>();
                while (rs.next()) {
    //                    System.out.println(rs.getString(1));
                	movies.add(rs.getString(1));
                }
                	groupByYear.put(year[i], movies);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return groupByYear;
    }

    public void yearWiseMovieName(Map<Integer, List<String>> yearFilter){
    	for(Map.Entry<Integer, List<String>> entry : yearFilter.entrySet()) {
    		System.out.println("Year : " + entry.getKey());
    		for(String movie : entry.getValue()) {
    			System.out.println(movie);
    		}
    	}

    }

    public Set<Movie> getMoviesForGenre(String s) {
        Set<Movie> moviesByGenre = new HashSet<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement stmt = con.prepareStatement("SELECT Movie, YearOfRelease, Genere FROM Movies WHERE Genere = ?")) {
            stmt.setString(1, s);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                moviesByGenre.add(new Movie(rs.getString("Movie"),rs.getInt("YearOfRelease"),rs.getString("Genere")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return moviesByGenre;
    }
}