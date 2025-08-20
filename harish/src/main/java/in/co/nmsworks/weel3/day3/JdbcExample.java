package in.co.nmsworks.weel3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListResourceBundle;

public class JdbcExample {
    public static void main(String[] args) {
        JdbcExample jdbc = new JdbcExample();
        jdbc.executeTheConnections();
    }

    private void executeTheConnections()  {
//        Connection connection = null;
//        Statement statement;
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
       Statement statement = connection.createStatement()){
            ResultSet rs = statement.executeQuery("Select * from Members");
            try {
                //int rows_count = statement.executeUpdate("Insert into Members values(35,'rajesh-sir','Trainer','rajesh@gmail.com','M')");

                List<Member> members = new ArrayList<>();
                while (rs.next()){

                    Member member = new Member();
                    member.setId(rs.getInt(1));
                    member.setName(rs.getString(2));
                    member.setEmail(rs.getString(4));
                    member.setType(rs.getString(3));;
                    member.setGender(rs.getString(5));
                    members.add(member);
                }

                for (Member member : members) {
                    System.out.println(member);
                }

            }
            catch (SQLException ef){
                throw new RuntimeException(ef);
            }
            finally {
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }








    }
}
