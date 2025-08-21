package in.co.nmsworks.week3.day1.day3;

import java.sql.*;
import java.util.*;

import static java.lang.System.out;

public class MovieRunner{
    private ResultSet rs;

    public static void main(String[] args) throws SQLException {
        MovieRunner mr=new MovieRunner();
        List<String[]> list = mr.getData();
        List<String[]> list1 = mr.savetoDatabase(list);

       String actions= Arrays.toString(mr.getMoviefrongenre("action"));
        out.println(Arrays.toString(actions.toCharArray()));


        mr.getMovieforyyear(2007);


    }

    private void getFromForYear(List<String[]> list, int i) {
    }

    public  List<String[]> getData(){

        String[] ob1= new String[]{"enthiran","2021","sci-fi"};
        String[] ob2= new String[]{"kabali","2016","action"};
        String[] ob3= new String[]{"enthiran","2021","sci-fi"};
        String[] ob4= new String[]{"superstar","2002","sci-fi"};
        String[] ob5= new String[]{"basha","1995","action"};
        String[] ob6= new String[]{"muththu","2008","sci-fi"};
        String[] ob7= new String[]{"sivai","2021","sci-fi"};
        String[] ob8= new String[]{"petta","2021","sci-fi"};
        String[] ob9= new String[]{"thalabathi","2021","sci-fi"};
        String[] ob10= new String[]{"kallai","2018","action"};

        List<String[]> list=new ArrayList<>();
        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        list.add(ob4);
        list.add(ob5);
        list.add(ob6);
        list.add(ob7);
        list.add(ob8);
        list.add(ob9);
        list.add(ob10);




        return list;
    }
    public List<String[]> savetoDatabase(List<String[]> movie){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps=  connection.prepareStatement("INSERT INTO movies Values(?,?,?)"))
        {
            for (String[] array : movie) {
                System.out.println(movie);
                ps.setString(1, array[0]);
                ps.setInt(2, Integer.parseInt(array[1]));
                ps.setString(3, array[2]);
                ps.executeUpdate();
                ps.addBatch();
                System.out.println("success*******");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movie;
    }


    public String[] getMovieforyyear(int year) throws SQLException {
        String  sql="select name from movies where year=?";
        List <String> result=new ArrayList<>();

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps=  connection.prepareStatement(sql)){
            ps.setInt(1,year);
            try {
                ResultSet rs;
                ResultSet resultSet = rs = ps.executeQuery();


                    while (rs.next()){
                        result.add(rs.getString("name"));
                    }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
     return result.toArray(new String[0]);
    }
    public String[] getMoviefrongenre(String genre)  {
        String  sql="select name from movies where genre=?";
        List <String> result=new ArrayList<>();

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");

            PreparedStatement ps=  connection.prepareStatement(sql)){
            ps.setInt(1, Integer.parseInt((genre)));
            try {
                ResultSet rs;
                ResultSet resultSet = rs = ps.executeQuery();


                while (rs.next()){
                    result.add(rs.getString("genre"));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result.toArray(new String[0]);
    }


}