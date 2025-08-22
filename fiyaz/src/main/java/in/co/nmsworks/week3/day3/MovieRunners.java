package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieRunners {
    public static void main(String[] args) {

        MovieRunners movieRunners = new MovieRunners();
        List<String[]> data =  movieRunners.getData();

        saveTheDb(data);
    }

    private static void saveTheDb(List<String[]> data)  {


        String sql = "INSERT INTO Movies VALUES (?, ?, ?)";

        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training","nms-training");
                PreparedStatement ps = con.prepareStatement(sql)
        ) {
            for (String[] s : data) {
                ps.setString(1, s[0]);
                ps.setString(2, s[1]);
                ps.setString(3, s[2]);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        }




    private  List<String[]> getData() {


        String[] enthiran = new String[] {"Enthiran", "2010", "Scifi" };
        String[] kabali = new String[] {"Kabali", "2010", "Action" };
        String[] superstar = new String[] {"Superstar", "2002", "Drama" };
        String[] baasha = new String[] {"Baasha", "1995", "Action" };
        String[] muthu = new String[] {"Muthu", "1995", "Scifi" };
        String[] sivajiTheBoss = new String[] {"Sivaji", "1995", "Drama" };
        String[] petta = new String[] {"Petta", "2019", "Action" };
        String[] thalapathi = new String[] {"Thalapathi", "1991", "Drama" };
        String[] shivaji = new String[] {"Shivaji", "2007", "Action" };
        String[] kaala = new String[] {"Kaala", "2018", "2018" };

        List<String[]> listMovies = new ArrayList<>();
        listMovies.add(enthiran);
        listMovies.add(kabali);
        listMovies.add(superstar);
        listMovies.add(baasha);
        listMovies.add(muthu);
        listMovies.add(sivajiTheBoss);
        listMovies.add(petta);
        listMovies.add(thalapathi);
        listMovies.add(shivaji);
        listMovies.add(kaala);


        return listMovies;

    }


}
