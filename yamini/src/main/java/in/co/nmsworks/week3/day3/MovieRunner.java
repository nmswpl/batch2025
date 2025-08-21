package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.*;

public class MovieRunner {
    private String name;
    private int year;
    private String genre;

    public MovieRunner(String name, int year, String genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public MovieRunner() {
    }

    @Override
    public String toString() {
        return "MovieRunner{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }

    static List<String[]> moviesArray = new ArrayList<>();

    public static void main(String[] args) throws SQLException {
        MovieRunner mr = new MovieRunner();
        System.out.println(mr.getData().size());
       // saveToDb(moviesArray);
        System.out.println(getMoviesByYear(new int[]{2007, 2019, 1995}));
        System.out.println(getMoviesByGenre("Action"));
    }

    public List<String[]> getData() {

        moviesArray.add(0, new String[]{"Enthiran", "2010", "Sci-fi"});
        moviesArray.add(1, new String[]{"Kabali", "2016", "Action"});
        moviesArray.add(2, new String[]{"Superstar", "2002", "Drama"});
        moviesArray.add(3, new String[]{"Baasha", "1995", "Action"});
        moviesArray.add(4, new String[]{"Muthu", "1995", "Drama"});
        moviesArray.add(5, new String[]{"Sivaji:The Boss", "2007", "Action"});
        moviesArray.add(6, new String[]{"Petta", "2019", "Action"});
        moviesArray.add(7, new String[]{"Thalapathi", "1991", "Drama"});
        moviesArray.add(8, new String[]{"Shivaji", "2007", "Action"});
        moviesArray.add(9, new String[]{"Kala", "2018", "Drama"});

        return moviesArray;


    }

    public static void saveToDb(List<String[]> list) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("Insert into Movies values(?,?,?)");) {

            for (String[] movies : list) {
                ps.setString(1, movies[0]);
                ps.setString(2, movies[1]);
                ps.setString(3, movies[2]);
                int result = ps.executeUpdate();
                //System.out.println(result);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public static Map<String, Integer> getMoviesByYear(int[] year) throws SQLException {
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("Select year,movie_name from Movies where year=?")) {
            ResultSet rs = null;
            for (int i = 0; i < year.length; i++) {
                ps.setInt(1, year[i]);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int years = rs.getInt(1);
                    String movie = rs.getString(2);
                    resultMap.put(movie, years);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultMap;

    }
    public static Set<MovieRunner> getMoviesByGenre(String genre) throws SQLException {
        ResultSet rs = null;
        //MovieRunner movieRunner=new MovieRunner();
       Set<MovieRunner>mvr=new HashSet<>();
        MovieRunner result = null;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("Select * from Movies where genre=?")) {
            ps.setString(1, genre);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                int year = rs.getInt(2);
                String genres = rs.getString(3);
                mvr.add( new MovieRunner(name, year, genres));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return  mvr;
    }
}
