package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.movie.Movie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class MoviePersistor {
    public static void main(String[] args) {
        MoviePersistor mp = new MoviePersistor();
        List<Movie> movies = mp.getMovieFromFile();
        //mp.saveMovieToDb(movies);
        System.out.println("-------------------------------------");

        System.out.println("Third Method Movies Set");
        Set<String[]> movieSet = mp.getAllMoviesFromDb();
        for (String[] movie : movieSet) {
            System.out.println(Arrays.toString(movie));
        }

        mp.writeAllMovies(movieSet);

    }

    private void writeAllMovies(Set<String[]> movieSet) {
        System.out.println("-----------------------Movies Write to Db -----------------------");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/MovieWriteFromDb.txt"))) {

            int i=1;
            for (String[] movieDetail : movieSet) {
                String row = i+","+movieDetail[0]+","+movieDetail[1]+","+movieDetail[2];
                System.out.println(row);
                bw.write(row);
                bw.newLine();
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Set<String[]> getAllMoviesFromDb() {
        Set<String[]> moviesSet = new HashSet<>();
        String query = "SELECT * FROM MOVIE";
        ResultSet rs = null;
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement(query))
        {
            rs = ps.executeQuery();

            while (rs.next()){
                String [] movieDetails = new String[3];

                movieDetails[0] = rs.getString(1);
                movieDetails[1] = String.valueOf(rs.getInt(2));
                movieDetails[2] = rs.getString(3);

                moviesSet.add(movieDetails);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return moviesSet;
    }

    private void saveMovieToDb(List<Movie> movies) {
        String query = "INSERT INTO MOVIE VALUE (?,?,?)";
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement(query))
        {
            for (Movie movie : movies) {
                ps.setString(1,movie.getMovieName());
                ps.setInt(2,movie.getYear());
                ps.setString(3,movie.getGenre());
                ps.executeUpdate();
                System.out.println("success");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Movie> getMovieFromFile() {
        List<Movie> movies = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieName.txt"))) {
            String line ;
            while ((line = br.readLine()) != null){
                String[] lineSeparator = line.split(",");
                System.out.println(line);
                System.out.println(Arrays.toString(lineSeparator));
                if (lineSeparator[0].equals("Movie")){
                    continue;
                }
                int year = Integer.parseInt(lineSeparator[1]);
                System.out.println(year);
                Movie movieObject = new Movie(lineSeparator[0],year,lineSeparator[2]);
                movies.add(movieObject);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }
}
