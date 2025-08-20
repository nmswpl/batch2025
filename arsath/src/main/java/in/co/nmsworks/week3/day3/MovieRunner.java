package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieRunner {
    public static void main(String[] args) {
        MovieRunner mr = new MovieRunner();
        List<String[]> movies = new ArrayList<>();
        mr.getData(movies);
        mr.savetoDb(movies);

    }

    public List<String[]> getData( List<String[]> movies){


        movies.add(new String[]{"Endhiran","2010","Sci-fi"});
        movies.add(new String[]{"Kabali","2016","Action"});
        movies.add(new String[]{"Superstar","2002","Drama"});
        movies.add(new String[]{"Baasha","1995","Action"});
        movies.add(new String[]{"Muthu","1995","Drama"});
        movies.add(new String[]{"Shivaji: The Boss","2007","Action"});
        movies.add(new String[]{"Petta","2019","Action"});
        movies.add(new String[]{"Thalapathi","1991","Drama"});
        movies.add(new String[]{"Shivaji","2007","Action"});
        movies.add(new String[]{"Kaala","2018","Drama"});


        return movies;
    }

    public void savetoDb(List<String[]> movies){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training"); Statement stmt = con.createStatement()){
            ResultSet rs = stmt.executeQuery("SELECT * FROM Movie");
            PreparedStatement ps = con.prepareStatement("INSERT INTO Movie VALUES (?,?,?)");
            for (String[] movie : movies) {
                ps.setString(1,movie[0]);
                ps.setInt(2, Integer.parseInt(movie[1]));
                ps.setString(3,movie[2]);
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getMoviesForYear(int[] year){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training"); Statement stmt = con.createStatement()){
            ResultSet rs = stmt.executeQuery("SELECT * FROM Movie");




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
