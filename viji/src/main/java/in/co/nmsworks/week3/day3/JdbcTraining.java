package in.co.nmsworks.week3.day3;

import java.lang.reflect.Member;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTraining {

    public static void main(String[] args) {


        ResultSet res;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = con.createStatement()) {

            System.out.println("Connection successfull");
            System.out.println("Statement Created");
            res = stmt.executeQuery("select * from Members");

            while (res.next()) {
                int id = res.getInt(1);
                String name = res.getString(2);
                String type = res.getString(3);
                String email = res.getString(4);
                String gender = res.getString(5);
                List<Members> members = new ArrayList<>();
                Members m = new Members(id, name, type, email, gender);
                members.add(m);
                for (Members member : members) {
                    System.out.println(member);
                }
                con.close();
                stmt.close();
                res.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            Statement stmt = con.createStatement())
        {
            System.out.println("Connection successfull");
            System.out.println("Statement Created");
            String insertRow1 = "Insert into Members(id,name,type,email,gender) values(96, 'siva' , 'Trainee' , 'abc@gmail.com' , 'M') ";
            int firstRow = stmt.executeUpdate(insertRow1);
            System.out.println("FirstRow Inserted " + firstRow);
            String insertRow2 = "Insert into Members(id,name,type,email,gender) values(95, 'ruba' , 'Trainee' , 'def@gmail.com' , 'F') ";
            int secondRow = stmt.executeUpdate(insertRow2);
            System.out.println("SecondRow Inserted " + secondRow);

            con.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}






