package in.co.nmsworks.week3.day3;

import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {
        JDBCPractice jdbcPractice = new JDBCPractice();

        jdbcPractice.executeSimpleQuery();
    }

    public void executeSimpleQuery(){
        Statement stmt;
        Connection con;
        try  {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            stmt = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Connection acquired and established successfully");

        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Members");

            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);

                System.out.println("ID:: " + id + ", Name:: " + name  + ", Email: " + email);
            }
            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
