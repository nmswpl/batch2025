package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week2.day1.day4.Movie;

import java.sql.*;
import java.util.*;

public class MovieRunner {

    public static void main(String[] args) {

        MovieRunner mr = new MovieRunner();

        List<String[]> setOfMovies= mr.getData();

        try {
            mr.saveToDB(setOfMovies);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        int [] arr=new int[]{1995,1997,2019};
        mr.getMoviesByYear(arr);

        Set<Movie> mov=new LinkedHashSet<>();
        mov=mr.getMovByGenre("Action");
        for (Movie movie : mov) {
            System.out.println(movie.getMovName());
        }

    }

    private Set<Movie> getMovByGenre(String action) {
        Set<Movie> mov;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps = con.prepareStatement("Select movie_name from Movie where Genre=?");
            ResultSet rs;
            mov = new LinkedHashSet<>();
            ps.setString(1, action);
            rs = ps.executeQuery();
            while (rs.next()) {
                String movie_name = rs.getString(1);
                mov.add(new Movie(movie_name));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return mov;
    }


    private void getMoviesByYear(int[] arr)
    {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps = con.prepareStatement("Select yearOfRelease,movie_name from Movie where yearOfRelease=? group by yearOfRelease,movie_name");
            ResultSet rs;
            Map<Integer,List<String>> yearAndMovie=new HashMap<>();
            List<String> movies = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ps.setInt(1,arr[i]);
                rs=ps.executeQuery();

                while(rs.next())
                {
                    int yearOfRelease = rs.getInt(1);
                    String movie_name = rs.getString(2);
                    yearAndMovie.computeIfAbsent(yearOfRelease, k -> new ArrayList<>()).add(movie_name);
                }

            }
            System.out.println(yearAndMovie);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void saveToDB(List<String[]> setOfMovies) throws SQLException {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps = con.prepareStatement("Insert into Movie Values(?,?,?)");

            for (String[] setOfMovie : setOfMovies) {

                ps.setString(1,setOfMovie[0]);
                ps.setInt(2,Integer.parseInt(setOfMovie[1]));
                ps.setString(3,setOfMovie[2]);
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private List<String[]> getData()
    {
        List<String[]> setOfMovies = new ArrayList<>();

        setOfMovies.add(new String[]{"Enthiran","2005","Sci-Fi"});
        setOfMovies.add(new String[]{"Kabali","2016","Action"});
        setOfMovies.add(new String[]{"SuperStar","2002","Drama"});
        setOfMovies.add(new String[]{"Baasha","1995","Action"});
        setOfMovies.add(new String[]{"Muthu","1995","Drama"});
        setOfMovies.add(new String[]{"Sivaji.The Boss","2007","Action"});
        setOfMovies.add(new String[]{"Petta","2019","Action"});
        setOfMovies.add(new String[]{"Thalapathy","1991","Drama"});
        setOfMovies.add(new String[]{"Sivaji","2007","Action"});
        setOfMovies.add(new String[]{"Kaala","2018","Drama"});

        System.out.println(setOfMovies);

    return setOfMovies;

    }

}
