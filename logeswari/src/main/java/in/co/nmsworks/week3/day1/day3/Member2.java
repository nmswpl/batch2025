package in.co.nmsworks.week3.day1.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Member2 {
    static List<Members> members1=new ArrayList<>();
    public static void main(String[] args) {
        Member2 members = new Member2();
        members.executeMemberQuery();
     //   members.rowInsertQuery();

    }


    public void executeMemberQuery() {
        Statement statement = null;
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("finally connection success");

        try {
            ResultSet result = statement.executeQuery("select * from Members");
            while (result.next()) {
                members1.add(new Members(result.getInt(1),result.getString(2), result.getNString(3), result.getNString(4), result.getString(5)));

            }
            for(int i=0;i<members1.size();i++){
                System.out.println("details : "+ members1.get(i));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void rowInsertQuery(){

        Statement statement = null;
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("finally connection success");

        try {
            int result = statement.executeUpdate("INSERT INTO Members VALUES(35,'yash','yash@gmail.com','student','m') ");
//                int result = statement.executeUpdate("DELETE FROM Members WHERE id=35 ");
//                while (result) {
//                    boolean id = result;
//                    String name = result.getString(2);
//                    String email = result.getString(3);
//                    String type = result.getString(4);
//                    String gender = result.getString(5);
//                    System.out.println("id : " + id + "Name : " + name + " Email : " + email + " Type : " + type + " Gender : " + gender);
//                }
            System.out.println("Insert Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
