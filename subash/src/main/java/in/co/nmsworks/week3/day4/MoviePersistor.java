package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day1.day4.Movie;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MoviePersistor {

    public static void main(String[] args) {


        MoviePersistor mp = new MoviePersistor();
        String filename="/tmp/MovieName.txt";
        String filename1="/tmp/DBMovieName.txt";
        List<Movie> mov = mp.getMoviesFromFile(filename);
        System.out.println(mov);

        mp.saveToDB(mov);

       Set<Movie> setMovie =  mp.getAllMoviesFromDB();
       mp.writeAllMovInFile(setMovie,"/tmp/twentyMovies.txt");
        List<Movie> mov1 = mp.getMoviesFromFile1(filename1);
        System.out.println(mov1);
    }

    private void writeAllMovInFile(Set<Movie> setMovie, String filename)
    {
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(filename,false))) {

            int i=0;
            for (Movie movie : setMovie) {
                i=i+1;
                bf.write(i+","+movie.getMovName()+","+movie.getYearOfRelease()+","+movie.getGenre());
                bf.newLine();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private Set<Movie> getAllMoviesFromDB()
    {
        Set<Movie> setMovie = new LinkedHashSet<>();
        Movie getMovie;
        try( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("select * from Movie;"))
        {
            ResultSet rs;
            rs = ps.executeQuery();

            while(rs.next())
            {
                String movie_name = rs.getString(1);
                int yearOfRelease = rs.getInt(2);
                String genre = rs.getString(3);
               setMovie.add(new Movie(movie_name,yearOfRelease,genre));
            }
            System.out.println(setMovie);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return setMovie;

    }

    private void saveToDB(List<Movie> mov)
    {
        try( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             PreparedStatement ps = con.prepareStatement("Insert into Movie values(?,?,?)"))
        {
            ResultSet rs;
            for (Movie movie : mov) {

                ps.setString(1,movie.getMovName());
                ps.setInt(2,movie.getYearOfRelease());
                ps.setString(3,movie.getGenre());
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Movie> getMoviesFromFile(String filename)
    {
        List<Movie> mov = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String line;
            Movie movie;
            while((line=br.readLine())!=null)
            {
                String arr[] = line.split(",");
                    mov.add(new Movie(arr[0],Integer.parseInt(arr[1]),arr[2]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return mov;
    }

    private List<Movie> getMoviesFromFile1(String filename)
    {
        List<Movie> mov = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String line;
            Movie movie;
            while((line=br.readLine())!=null)
            {
                String arr[] = line.split(",");
//                arr[0]=arr[0].replace('"'+'"',"");
                arr[1]=arr[1].replace(""+""+"","");
                arr[2]=arr[2].replace(""+""+"","");
                arr[3]=arr[3].replace(""+""+"","");
                mov.add(new Movie(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),arr[3]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return mov;
    }


}
