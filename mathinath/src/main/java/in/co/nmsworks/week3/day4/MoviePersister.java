package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;

import java.io.*;
import java.net.ConnectException;
import java.sql.*;
import java.util.*;

public class MoviePersister {
    public static void main(String[] args) throws IOException, SQLException {
        MoviePersister mp = new MoviePersister();
        List<Movie> movie = mp.getMovieFromFiles("/home/nms-training/Downloads/MovieName.txt");
//            System.out.println(movie);
//        mp.saveMoviesToDb(movie);
        Set<Movie> setMovie = mp.getAllMovieFromMovie(movie);
        for (Movie movie1 : setMovie) {
            System.out.println(movie1);
        }
        mp.writeAllMovieToFile(setMovie);

    }

    private void writeAllMovieToFile(Set<Movie> setMovie) {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/MovieName1.txt",setMovie));
//        bw.write(setMovie);
    }

    private Set<Movie> getAllMovieFromMovie(List<Movie> movie) throws SQLException {
        Set<Movie> movies = new HashSet<>();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
        PreparedStatement ps = con.prepareStatement("select * from movie");
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            movies.add(new Movie(rs.getString(1),rs.getInt(2),rs.getString(3)));
        }

        return movies;
    }


    private void saveMoviesToDb(List<Movie> movie) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
        PreparedStatement ps = con.prepareStatement("insert into movie values(?,?,?)");
        for (Movie movie1 : movie) {
           ps.setString(1, movie1.getMovieName());
           ps.setInt(2,movie1.getYearOfRelease());
           ps.setString(3,movie1.getGenre());
        }
        ps.executeUpdate();
    }


    private List<Movie> getMovieFromFiles(String filename) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(filename));
        String line;
        List<Movie> list1 = new ArrayList<>();
        while ((line = bf.readLine()) != null)
        {
//            System.out.println(line);
            String[] arr = line.split(",");
//            System.out.println(Arrays.toString(arr));
            Movie m1 = new Movie(arr[0],Integer.parseInt(arr[1]),arr[2]);
//            for(int i=0;i<arr.length;i++)
//            {
//                list1.add(new Movie());
//            }
            list1.add(m1);
        }
        bf.close();
      return list1;


    }


}
