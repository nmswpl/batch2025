package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;
import in.co.nmsworks.week3.day3.Member;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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

        String filename = "/home/nms-training/Downloads/MovieName.txt";
        String filename1 = "/home/nms-training/Downloads/DBMovis.txt";

//        List<Movie> result = mp.getAllMoviesFromFile(filename);
//        System.out.println(result);
//
//        mp.saveMoviesToDb(result);
        Set<Movie> movieSet = mp.getMoviesFromDb();
        mp.writeAllMoviesToAFile(movieSet,filename1);
    }

    private List<Movie> getAllMoviesFromFile(String filename) {
        List<Movie> movies = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line=br.readLine())!=null){
//                System.out.println(line);
                String arr[] = line.split(",");
                if(arr[1].equals("Year")){
                    continue;
                }
                Movie movie = new Movie(arr[0],Integer.parseInt(arr[1]),arr[2]);
                movies.add(movie);
            }
            System.out.println(movies);


        } catch (Exception e) {
           e.printStackTrace();
        }

        return movies;
    }

    private void saveMoviesToDb(List<Movie> movies) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training")){
            PreparedStatement ps = con.prepareStatement("INSERT INTO Movie VALUES (?,?,?)");
            for (Movie movie : movies) {
                ps.setString(1,movie.getName());
                ps.setInt(2,movie.getYearOfRelease());
                ps.setString(3,movie.getGenre());
                ps.executeUpdate();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Set<Movie> getMoviesFromDb() {
        Set<Movie> movieSet = new HashSet<>();
        String sql = "SELECT * FROM Movie";
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training")){
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                String name = rs.getString(1);
                int yearOfRelease = rs.getInt(2);
                String genre = rs.getString(3);

                movieSet.add(new Movie(name,yearOfRelease,genre));

            }
            System.out.println(movieSet);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return movieSet;
    }

    private void writeAllMoviesToAFile(Set<Movie> movieSet,String filename1) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename1))){
            int i = 0;
            for(Movie m : movieSet){
                i=i+1;
                bw.write(i+","+m.getName()+","+m.getYearOfRelease()+","+m.getGenre());
                bw.newLine();
                bw.flush();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
