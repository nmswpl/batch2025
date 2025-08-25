package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;
import in.co.nmsworks.week3.day3.MovieRunner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoviePasser
{
    private String name;
    private int year;
    private String genre;

    public static void main(String[] args) throws IOException, SQLException {
        MoviePasser mp = new MoviePasser();
        List<Movie> mov = mp.getMoviesFromFile("/tmp/MovieName.txt");
        System.out.println(mov);
        mp.saveMovieToDb(mov);
    }

    public List<Movie> getMoviesFromFile(String file) throws IOException {
        List<Movie> name = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file));){
            String line;
            int i= 0;
            br.readLine();
            while((line = br.readLine())!=null) {
                String[] str = line.split(",");
                //System.out.println(Arrays.toString(str));
                Movie m = new Movie(str[0], Integer.parseInt(str[1]), str[2]);
                name.add(m);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }

    public void saveMovieToDb(List<Movie> movies) throws SQLException {
        String sql = "insert into movie values(?,?,?)";
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training" , "nms-training", "nms-training");
            PreparedStatement ps = con.prepareStatement(sql)){
            for (Movie movie : movies) {
                ps.setString(1,movie.getName());
                ps.setInt(2,movie.getYear());
                ps.setString(3,movie.getGenre());
                int rs = ps.executeUpdate();
            }

            //System.out.println(rs + "Inserted");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
