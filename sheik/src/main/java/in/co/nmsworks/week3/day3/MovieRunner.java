package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.*;

public class MovieRunner
{
    public MovieRunner(String name, int year, String genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    private String name;
    private int year;
    private String genre;

    public MovieRunner() {

    }

    public static void main(String[] args) throws SQLException {
        MovieRunner mr = new MovieRunner();
        List<String[]> movieArr = new ArrayList<>();
        String[] arr1 = {"Enthiran" ,"2010","sci-fi"};
        String[] arr2 = {"Kabali" , "2016" , "Action"};
        String[] arr3 = {"Superstar" ,"2002", "Drama"};
        String[] arr4 = {"Basha" ,"1995","Action"};
        String[] arr5 = {"Muthu" , "1995","Drama"};
        String[] arr6 = {"sivaji" , "2007","Action"};
        String[] arr7 = {"Petta" ,"2019","Action"};
        String[] arr8= {"Thalapathy" ,"1991","Drama"};
        String[] arr9 = {"Shiviji" , "2007", "Action"};
        String[] arr10 = {"Kaaala", "2018" ,"Drama"};

        movieArr.add(arr1);
        movieArr.add(arr2);
        movieArr.add(arr3);
        movieArr.add(arr4);
        movieArr.add(arr5);
        movieArr.add(arr6);
        movieArr.add(arr7);
        movieArr.add(arr8);
        movieArr.add(arr9);
        movieArr.add(arr10);

        //System.out.println(movieArr.size());

        saveToDb(movieArr);
        //getData();
        System.out.println(getMoviesFromDbForYear(new int[] {1995,2007}));
        //Map<Integer,String[]> yearMovie = getMoviesFromDbForYear(new int[] {1995,2007});
        //System.out.println(yearMovie);
        //getMoviesByGenre("Action").toString();
        //System.out.println(getMoviesByGenre("Action").toString());

    }
    public static List<String []> getData(){
        return List.of();
    }


    public static void saveToDb(List<String []> movieArr) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training" ,"nms-training" ,"nms-training");
        PreparedStatement ps = con.prepareStatement("insert into movie values(?,?,?)")){
            for (String[] arr : movieArr) {
                ps.setString(1,arr[0]);
                ps.setString(2,arr[1]);
                ps.setString(3,arr[2]);

                int rs = ps.executeUpdate();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Map<String,Integer> getMoviesFromDbForYear(int[] year) throws  SQLException{
        /*Map<Integer,List<String[]>> moviesOfYear = new HashMap<>();
        String sql = "select movName,year from movie where year =?";
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training" ,"nms-training" ,"nms-training");
           PreparedStatement ps = con.prepareStatement(sql)){
            for (int i : year) {
                ps.setInt(1,i);
                try(ResultSet rs = ps.executeQuery()){
                    List<String> names = new ArrayList<>();
                    while(rs.next()){
                        names.add(rs.getString(1));
                    }
                    moviesOfYear.put(i,names);
                }
            }
        } catch (Exception e) {
             e.printStackTrace();
        }

         */




        ResultSet rs = null;
        Map<String ,Integer> mapping = new HashMap<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training" ,"nms-training" ,"nms-training");
            PreparedStatement ps = con.prepareStatement("Select movName,year from movie where year=?")){
            for (int i : year) {
                ps.setInt(1,i);
                rs = ps.executeQuery();
                while (rs.next()){
                    mapping.put(rs.getString(1),rs.getInt(2));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping;

    }
    public static Set<MovieRunner> getMoviesByGenre(String genre) throws SQLException {
        ResultSet rs = null;
        Set<MovieRunner> ls = new HashSet<>();
        MovieRunner mr = null;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("Select * from movie where genre=?")) {
            ps.setString(1, genre);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                int year = rs.getInt(2);
                String genres = rs.getString(3);
                mr = new MovieRunner(name, year, genres);
                ls.add(mr);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ls;
    }


    @Override
    public String toString() {
        return "MovieRunner{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }
}
