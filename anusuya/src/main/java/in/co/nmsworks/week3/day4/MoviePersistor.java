package in.co.nmsworks.week3.day4;

import com.mysql.cj.jdbc.CallableStatementWrapper;
import in.co.nmsworks.week2.day4.Movie;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MoviePersistor {

    public static void main(String[] args) {

        MoviePersistor mp = new MoviePersistor();
        String filename = "/home/nms-training/Downloads/MovieName.txt";

        List<Movie> movieList = mp.getMoviesFromFile(filename);
        System.out.println(movieList);

        mp.saveMoviesToDb(movieList);

        Set<Movie> movieSet = mp.getAllMoviesFromDB();
        System.out.println(movieSet);

        mp.writeAllMoviesToFile(movieSet);
    }

    private List<Movie> getMoviesFromFile(String filename) {

        try(BufferedReader br = new BufferedReader(new FileReader(filename))){

            List<Movie> tempMovieList = new ArrayList<>();
            String line;
            line = br.readLine();
            while((line = br.readLine()) != null){
                String[] splittedLine = line.split(",");
                tempMovieList.add(new Movie(splittedLine[0],Integer.parseInt(splittedLine[1]),splittedLine[2]));
            }
            return tempMovieList;
        }

        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void saveMoviesToDb(List<Movie> movieList) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement("INSERT INTO Movies VALUES (?,?,?)")) {

            for (Movie movie : movieList) {
                ps.setString(1,movie.getName());
                ps.setInt(2,movie.getYearOfRelease());
                ps.setString(3,movie.getGenre());
                ps.executeUpdate();
            }
        }

        catch (SQLException e) {
            throw new RuntimeException(e);
        } ;
    }

    private Set<Movie> getAllMoviesFromDB() {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            Statement st = con.createStatement()){

            Set<Movie> tempMovieSet = new HashSet<>();
            try(ResultSet rs = st.executeQuery("SELECT * FROM Movies")){
                while(rs.next()){
                    tempMovieSet.add(new Movie(rs.getString(1),rs.getInt(2),rs.getString(3)));
                }
            }
            return  tempMovieSet;
        }

        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeAllMoviesToFile(Set<Movie> movieSet) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("/tmp/MovieSet"))){

            int sno = 1;
            for (Movie movie : movieSet) {
                bw.write(sno +"," +  movie.getName() + "," + movie.getYearOfRelease() + "," + movie.getGenre());
                bw.newLine();
                sno++;
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
