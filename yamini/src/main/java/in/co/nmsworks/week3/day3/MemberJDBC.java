package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberJDBC {
    public static void main(String[] args) throws SQLException {

        List<Member> memberList = new ArrayList<>();
        ResultSet res;
        String query = "Select * from Members";
        String insert = "Insert into Members values(34,'Pavi','trainee','pavi@gmail.com','F');";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = con.createStatement()) {

            res = stmt.executeQuery(query);
            //int result = stmt.executeUpdate(insert);
            //System.out.println(result);

            while (res.next()) {
                    int id = res.getInt(1);
                    String name = res.getString(2);
                    String email = res.getString(4);
                    String type = res.getString(3);
                    String gender = res.getString(5);

                    Member member = new Member(id, name, email, type, gender);
                    memberList.add(member);

                }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        printObjects(memberList);

    }

    public static void printObjects(List<Member> memberJDBCList) throws SQLException {
        for (Member memberJDBC : memberJDBCList) {
            System.out.println(memberJDBC);
        }

    }

}
