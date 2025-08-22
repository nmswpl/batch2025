package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week2.day4.Movie;

import java.sql.*;
import java.util.*;

public class MovieRunner {
    public static void main(String[] args) {

        MovieRunner mr = new MovieRunner();
        List<String[]> movieData = mr.getData();

        mr.saveDb(movieData);

        int[] year = {1995,1991};
        Map<Integer , List<String> > answer = mr.getMoviesFromDbForYear(year);
        for (Map.Entry<Integer, List<String>> entry : answer.entrySet()) {
            System.out.println("The year is : "+entry.getKey() + " "+ "The movie name is " + entry.getValue());
        }
        Set<Movie> moviesGenre  = mr.getMoviesForGenre("Sci-fi");
        System.out.println(moviesGenre);



    }

    public List<String[]> getData() {

        String[] str1 = {"Enthiran", "2010", "Sci-fi"};
        String[] str2 = {"Kabali", "2016", "Action"};
        String[] str3 = {"Superstar", "2002", "Drama"};
        String[] str4 = {"Baasha", "1995", "Action"};
        String[] str5 = {"Muthu", "1995", "Drama"};
        String[] str6 = {"Sivaji-The Boss", "2007", "Action"};
        String[] str7 = {"Peta", "2019", "Drama"};
        String[] str8 = {"Thalapathi", "1991", "Drama"};
        String[] str9 = {"Sivaji", "2007", "Action"};
        String[] str10 = {"Kaala", "2018", "Drama"};

        List<String[]> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);
        list.add(str6);
        list.add(str7);
        list.add(str8);
        list.add(str9);
        list.add(str10);
        System.out.println(list.size());
        return list;

    }

    public void saveDb(List<String[]> movieList) {

            try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps = con.prepareStatement("Insert into Movies values(?, ? , ? ) ");){

                for (String[] movie : movieList) {
                    ps.setString(1, movie[0]);
                    ps.setInt(2, Integer.parseInt(movie[1]));
                    ps.setString(3, movie[2]);
                    ps.executeUpdate();
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    public Map<Integer, List<String> > getMoviesFromDbForYear(int[] year) {
        Map<Integer, List<String> >  map = new HashMap<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps = con.prepareStatement("select movieName from Movies where yearOfRelease = ?");

            for (int i1 : year) {
               ps.setInt(1,i1);
               ResultSet res = ps.executeQuery();

               List<String> list = new ArrayList<>();
                while(res.next()){
                    list.add(res.getString(1));
                }
                map.put(i1,list);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }

    private Set<Movie> getMoviesForGenre(String genre1) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            PreparedStatement ps = con.prepareStatement("select * from Movies Where genre = ?")){

            ps.setString(1,genre1);

            Set<Movie> set = new LinkedHashSet<>();
            ResultSet res = ps.executeQuery();
            while(res.next()){
                String movieName = res.getString(1);
                int yearOfRelease = res.getInt(2);
                String genre = res.getString(3);
                Movie m =new Movie(movieName,yearOfRelease,genre);
               set.add(m);
            }
            return set;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}




