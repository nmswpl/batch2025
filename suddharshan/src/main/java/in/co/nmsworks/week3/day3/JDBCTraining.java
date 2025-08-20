package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTraining {
    public static void main(String[] args) {
        JDBCTraining j = new JDBCTraining();
        //j.insertMembers();
        j.getAndPrintMembers();
    }

    public void insertMembers(){
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             Statement stmt = con.createStatement()){

            int count1 = stmt.executeUpdate("insert into members values (101, 'Gokul', 'Trainee', 'gok@gmail.com','M')");
            System.out.println(count1 + "row(s) successfully inserted");
            int count2 = stmt.executeUpdate("insert into members values (102, 'Rani', 'Trainee', 'ran@gmail.com','F')");
            System.out.println(count2 + "row(s) successfully inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void getAndPrintMembers(){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select * from members; ")){

            List<Member> membersList = new ArrayList<>();

            while(rs.next()){
                Integer id = rs.getInt(1);
                String name =  rs.getString(2);
                String type = rs.getString(3);
                String email = rs.getString(4);
                String gender = rs.getString(5);
                Member members = new Member(id,name,type,email,gender);
                membersList.add(members);
            }

            for (Member members : membersList) {
                System.out.println("Id: " + members.getId() + ", Name: " + members.getName() + ", Type: " + members.getType() + ", Email: " + members.getEmail() + ", Gender: " + members.getGender());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
