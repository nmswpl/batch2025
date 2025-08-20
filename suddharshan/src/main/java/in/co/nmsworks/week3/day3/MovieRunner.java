package in.co.nmsworks.week3.day3;
/*
Enthiran	2010	Sci-Fi
Kabali	2016	Action
Superstar	2002	Drama
Baasha	1995	Action
Muthu	1995	Drama
Sivaji: The Boss	2007	Action
Petta	2019	Action
Thalapathi	1991	Drama
Shivaji	2007	Action
Kaala	2018	Drama
 */
import in.co.nmsworks.week2.day4.Movie;

import java.sql.*;
import java.util.*;

public class MovieRunner {
    public static void main(String[] args) {
        MovieRunner mr = new MovieRunner();
        List <String[]> data = mr.getData();
        //mr.saveToDb(data);
        System.out.println(mr.getMoviesFromDbForYears(new int[]{1995,2010}));
        System.out.println(mr.getMoviesForGenre("Drama"));
    }
    public List <String []> getData() {
        List<String []> movieList = new ArrayList<>();
        movieList.add(new String[]{"Enthiran","2010","Sci-Fi"});
        movieList.add(new String[]{"Kabali","2016","Action"});
        movieList.add(new String[]{"SuperStar","2002","Drama"});
        movieList.add(new String[]{"Baasha","1995","Action"});
        movieList.add(new String[]{"Muthu","1995","Drama"});
        movieList.add(new String[]{"SivajiTheBoss","2007","Action"});
        movieList.add(new String[]{"Petta","2019","Action"});
        movieList.add(new String[]{"Thalapathi","1991","Drama"});
        movieList.add(new String[]{"Shivaji","2007","Action"});
        movieList.add(new String[]{"Kaala","2018","Drama"});
        return movieList;
    }
    public void saveToDb(List <String[]> data){
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             PreparedStatement ps = con.prepareStatement("insert into movie values (?,?,?)")){
            for (String[] movieArr : data) {
                ps.setString(1, movieArr[0]);
                ps.setInt(2, Integer.parseInt(movieArr[1]));
                ps.setString(3,movieArr[2]);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Map<Integer, List<String>> getMoviesFromDbForYears (int arr[]){
        Map <Integer, List<String>> yearWiseMovie = new HashMap<>();
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             PreparedStatement ps = con.prepareStatement("select * from movie where year = ?")){
            for (int i = 0; i < arr.length; i++) {
                ps.setInt(1,arr[i]);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    if(yearWiseMovie.containsKey(rs.getInt(2))){
                        List<String> newList = yearWiseMovie.get(rs.getInt(2));
                        newList.add(rs.getString(1));
                        yearWiseMovie.replace(rs.getInt(2),newList);
                    }
                    else{
                        List<String> movieLst = new ArrayList<>();
                        movieLst.add(rs.getString(1));
                        yearWiseMovie.put(rs.getInt(2),movieLst);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return yearWiseMovie;
    }
    public Set<Movie> getMoviesForGenre(String genre){
        Set <Movie> genreMovies = new HashSet<>();
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             PreparedStatement ps = con.prepareStatement("select * from movie where genre = ?")){
                ps.setString(1, genre);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String movie = rs.getString(1);
                    int year = rs.getInt(2);
                    String genrename = rs.getString(3);
                    Movie m = new Movie(movie,year,genrename);
                    genreMovies.add(m);
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return genreMovies;
    }
}
