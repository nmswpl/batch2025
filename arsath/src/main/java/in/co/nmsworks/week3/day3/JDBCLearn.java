package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCLearn{
    public static void main(String[] args) {
        JDBCLearn jdbcLearn = new JDBCLearn();
        jdbcLearn.printMemberDetails();
    }

    public  void printMemberDetails(){
        try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
              Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Members");
            List<Member> memberList = new ArrayList<>();

            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String type = rs.getString(4);
                String gender = rs.getString(5);
                Member m = new Member(id,name,email,type,gender);
                memberList.add(m);
            }

            for (Member m : memberList) {
                System.out.println(m);
            }


//            int a = stmt.executeUpdate("INSERT INTO Members VALUES (35,'Ahamed','457@gmail,com','trainee','M')");
//            int a = stmt.executeUpdate("INSERT INTO Members VALUES (36,'John','john@yahoo.com','trainee','M')");
//            System.out.println("INSERTED " + a + " ROW(S)");

//            int b = stmt.executeUpdate("DELETE FROM Members WHERE id = 33");
//            System.out.println("DELETED " + b + " ROW(S)");

            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Connection acquired and established successfully");

    }
}
