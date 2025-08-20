package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPractice {


    public static void main(String[] args) {

        JDBCPractice jdbc = new JDBCPractice();

        try {
            jdbc.executeJdbcQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            jdbc.addMembers();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void executeJdbcQuery() throws SQLException {
        ResultSet rs;

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = con.createStatement())
        {
            rs = stmt.executeQuery("Select * from members");
            List<Member> listMember = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String type = rs.getString(4);
                String gender = rs.getString(5);

                listMember.add(new Member(id, name, email, type, gender));
            }
            rs.close();
            System.out.println(listMember);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void addMembers() throws SQLException
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = con.createStatement()) {

            int update = stmt.executeUpdate("Insert into members values(88,'subash','email.com','Dev','M'),(99,'Abishek','Abiemail.com','Dev','M')");
            if (update > 0)
                System.out.println(update + " rows updated");
            else
                System.out.println("Not inserted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
