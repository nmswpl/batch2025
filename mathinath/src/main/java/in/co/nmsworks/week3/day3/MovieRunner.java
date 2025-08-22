package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week2.day4.Movie;

import java.sql.*;
import java.util.*;


class MovieRunner{
    public static void main(String[] args) {
        MovieRunner mr = new MovieRunner();
        List<String[]> listString =  mr.getdata();
//        try {
//            saveToDb(listString);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        int arr[]=new int[]{2010,2016,2002,1995};
        try {
            getMoviesFromDbForYear(arr);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//        try {
//            Set<Movie> movie = mr.getMovieForGenre("action");
//            for (Movie movie1 : movie) {
//                System.out.println(movie1);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

    }

    private Set<Movie> getMovieForGenre(String action) throws SQLException {
        Set<Movie> movieForGenre = new HashSet<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("select moviename , yearofrelease from movie where genre=?")) {

            ps.setString(1, action);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
//                movieForGenre.add(new Movie(rs.getString("moviename")));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return movieForGenre;
    }

    private static void getMoviesFromDbForYear(int[] arr) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
        PreparedStatement ps = con.prepareStatement("select yearofrelease,moviename from movie where yearofrelease=?");
        ResultSet rs;
        Map<Integer,List<String>> map1 = new HashMap<>();
        List<String> listOfString = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            ps.setInt(1, arr[i]);
            rs = ps.executeQuery();

            while (rs.next()) {
                int year = rs.getInt(1);
                String movie = rs.getString(2);
                listOfString.add(movie);
                map1.put(year, listOfString);
            }

        }
        System.out.println(map1);

    }

    private static void saveToDb(List<String[]> listString) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
        PreparedStatement ps = con.prepareStatement("insert into movie values(?,?,?)");

        for (String[] strings : listString) {
            ps.setString(1,strings[0]);
            ps.setInt(2, Integer.parseInt(strings[1]));
            ps.setString(3,strings[2]);
            ps.executeUpdate();

        }
    }

    private List<String[]> getdata() {
        List<String[]> list1 = new ArrayList<>();
        list1.add(new String[]{"enthiran","2010","Sci-fi"});
        list1.add(new String[]{"Kabali","2016","Action"});
        list1.add(new String[]{"Superstar","2002","drama"});
        list1.add(new String[]{"Basha","1995","action"});
        list1.add(new String[]{"muthu","1995","drama"});
        list1.add(new String[]{"Sivaji","2007","action"});
        list1.add(new String[]{"petta","2019","action"});
        list1.add(new String[]{"thalapathi","1991","drama"});
        list1.add(new String[]{"Shivaji","2007","Action"});
        list1.add(new String[]{"kaala","2018","Drama"});
        System.out.println(list1.size());
        return list1;
    }


}