package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPractice {

    public static void jdbcPractice(List<Members> members) {

        ResultSet rs = null;


        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");Statement stmt = con.createStatement())
        {
            rs = stmt.executeQuery("SELECT * FROM members");
            while (rs.next()){
                try {
                    members.add( new Members(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            rs.close();
            //insertValueInTable(stmt);


        } catch (SQLException ee) {
            ee.printStackTrace();
        }

    }

    private static void insertValueInTable(Statement stmt) {
        try {
            stmt.executeUpdate("INSERT INTO members VALUES (34,'Name34','trainee','name34@gmail.com','M')");
            stmt.executeUpdate("INSERT INTO members VALUES (35,'Name35','trainee','name35@gmail.com','F')");
            System.out.println("Success");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }




    public static void main(String[] args) {
        List<Members> members = new ArrayList<>();
        //Members object = new Members();
        jdbcPractice(members);
        System.out.println(members);
    }

}
