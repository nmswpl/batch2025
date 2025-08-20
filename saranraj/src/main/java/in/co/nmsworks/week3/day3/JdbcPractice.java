package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JdbcPractice {


    public static void main(String[] args) {
        JdbcPractice jdbcPractice = new JdbcPractice();

        List<Member> members = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = conn.createStatement()) {


            ResultSet rs = stmt.executeQuery("select * from members");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                String email = rs.getString("email");
                String gender = rs.getString("gender");

                Member member = new Member(id, name, type, email, gender);
                members.add(member);
            }

            printAllMembersDetails(members);
            String insertQuery = "insert into members(id,name,type,email,gender) values (34,'qwerty','trainee','abc@gmail.com','M')";

            insertValue(stmt,insertQuery);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static void printAllMembersDetails(List<Member> members) {

        for (Member member : members) {
            System.out.println(member);
        }
    }


    public static void insertValue(Statement stmt, String insertQuery) throws SQLException {

        int rs1 = stmt.executeUpdate(insertQuery);
        System.out.println("row inserted : " + rs1);
    }


}
