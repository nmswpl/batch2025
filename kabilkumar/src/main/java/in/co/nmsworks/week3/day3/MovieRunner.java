package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.time.Year;
import java.util.*;

public class MovieRunner
{
    public static void main(String[] args)
    {
        MovieRunner mr = new MovieRunner();
        List<String[]> moviesData = getData();
        saveToDb(moviesData);
        getMovesFormDBOnYear(new  int[] {2007,2019,2010});

    }

    public static List<String[]> getData() {
        List<String[]> movieList = new ArrayList<>();
        String[] arr1 = {"Enthiran", "2010", "Sci-Fi"};
        String[] arr2 = {"Kabali", "2016", "Action"};
        String[] arr3 = {"Superstar", "2002", "drama"};
        String[] arr4 = {" Baasha", "1995", "Action"};
        String[] arr5 = {" Muthu", "1995", "Drama"};
        String[] arr6 = {"Sivaji:The Boss", "2007", "Action"};
        String[] arr7 = {" Petta", "2019", "Action"};
        String[] arr8 = {" Thalapathi", "1991", "Drama"};
        String[] arr9 = {"Shivaji", "2007", "Action"};
        String[] arr10 = {" Kaala", "2018", "Drama"};

        movieList.add(arr1);
        movieList.add(arr2);
        movieList.add(arr3);
        movieList.add(arr4);
        movieList.add(arr5);
        movieList.add(arr6);
        movieList.add(arr7);
        movieList.add(arr8);
        movieList.add(arr9);
        movieList.add(arr10);

        return movieList;

    }

    public static void saveToDb(List<String[]> saveDB) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps = con.prepareStatement("insert into Movies values(?,?,?)");


            for (String[] s : saveDB) {

                ps.setString(1,s[0]);
                ps.setInt(2,Integer.parseInt(s[1]));
                ps.setString(3,s[2]);
                ps.executeUpdate();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void getMovesFormDBOnYear(int[] year) {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps = con.prepareStatement("select * from Movies where YearOfRelease = ?");

            List<String> movie = new ArrayList<>();
            Map<Integer, List<String>> movieWithYear = new HashMap<>();

            try {

                for (int i : year) {
                    ps.setInt(1, i);
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        movie.add(rs.getString(1));

                    }
                    movieWithYear.put(i, movie);
                }
                System.out.println("movie with years "+movieWithYear.get(2019));
                System.out.println(movieWithYear.size());
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

