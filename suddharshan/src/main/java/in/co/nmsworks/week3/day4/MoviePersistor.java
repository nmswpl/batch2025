package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoviePersistor {
    public static void main(String[] args) {
        MoviePersistor mp = new MoviePersistor();
        List <Movie> movieArr = mp.getMoviesFromFile("/home/nms-training/Downloads/MovieName.txt");
        //mp.saveMovieToDb(movieArr);
        Set <Movie> movieSet = mp.getAllMovieFromDb();
        System.out.println(movieSet.size());
        mp.writeAllMovieToFile(movieSet,"/tmp/movieList.txt");
    }
    public List<Movie> getMoviesFromFile(String fileName){
        List <Movie> movieArr = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String res = "", data;
            while((data = br.readLine()) != null){
                res = res + (data + "\n");
            }
            System.out.println(res);
            String [] movieRow = res.split("\n");
            for (int i = 1; i < movieRow.length; i++) {
                String [] movie = movieRow[i].split(",");
                Movie m = new Movie(movie[0],Integer.parseInt(movie[1]),movie[2]);
                movieArr.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movieArr;
    }
    public void saveMovieToDb(List <Movie> movieArr){
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             PreparedStatement ps = con.prepareStatement("insert into movie values (?,?,?)")){
            for (Movie movie : movieArr) {
                ps.setString(1, movie.getName());
                ps.setInt(2, movie.getYearOfRelease());
                ps.setString(3,movie.getGenre());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Set<Movie> getAllMovieFromDb(){
        Set <Movie> movieSet = new HashSet<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select * from movie; ")){

            while(rs.next()){
                Movie mov = new Movie(rs.getString(1),rs.getInt(2),rs.getString(3));
                movieSet.add(mov);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movieSet;
    }
    public void writeAllMovieToFile (Set <Movie> movieSet, String fileName){
        String data = "";
        int count = 1;
        try (FileWriter fw = new FileWriter(fileName,true)){
            for (Movie movie : movieSet) {
                data += ( count + " " + movie.getName() + ", " + movie.getYearOfRelease() + ", " + movie.getGenre() +"\n");
                count++;
                fw.flush();
            }
            fw.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
