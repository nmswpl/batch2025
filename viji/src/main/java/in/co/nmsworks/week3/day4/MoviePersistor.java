package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;

import java.io.*;
import java.sql.*;
import java.util.*;

public class MoviePersistor {
    public static void main(String[] args) throws IOException {

        MoviePersistor mp = new MoviePersistor();
        List<Movie> movies =mp.getMoviesFromFile("/home/nms-training/Downloads/MovieName.txt");

        saveMovieToDb(movies);

         Set<Movie> movieSet = mp.getAllMoviesFromDb();

         mp.writeAllMoviesToFile(movieSet , "/tmp/Movies.txt");


    }



    private List<Movie> getMoviesFromFile(String fileName) {
        List<Movie> movie = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line ;
            br.readLine();
            while((line = br.readLine())!= null){

                String[] str = line.split(",");
                Movie m = new Movie(str[0] , Integer.parseInt(str[1]) , str[2]);

                movie.add(m);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    return movie;
    }

    private static void saveMovieToDb(List<Movie> movies) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps= con.prepareStatement("Insert into Movies(movieName,yearOfRelease,genre ) values(?,?,?) " )){

            for( Movie m : movies){
               ps.setString(1,m.getMovieName());
               ps.setInt(2,m.getYearOfRelease());
               ps.setString(3,m.getGenre());
               ps.executeUpdate();
            }
            System.out.println("Successfully inserted");


        } catch (Exception  e) {
           e.printStackTrace();
        }

    }

    private Set<Movie> getAllMoviesFromDb(){
        Set<Movie> movieSet = new LinkedHashSet<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("select * from Movies")){
            while(res.next()){
               String movieName= res.getString(1);
               int yearOfRelease = res.getInt(2);
               String genre = res.getString(3);
               Movie m = new Movie(movieName,yearOfRelease,genre);
               movieSet.add(m);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return  movieSet;

    }
    private static void writeAllMoviesToFile(Set<Movie> movieSet, String filePath) {
         try(BufferedWriter br = new BufferedWriter(new FileWriter(filePath))){
             for(Movie m : movieSet){
                 br.write(m.getMovieName() + " ," + m.getYearOfRelease() + " ," + m.getGenre());
                 br.newLine();
             }

         } catch (Exception e) {
             e.printStackTrace();
         }

    }





}

