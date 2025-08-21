package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberJDBC
{

    public static void main(String[] args) {

        List<Member> list = new ArrayList<>();



        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training" , "nms-training", "nms-training");
            Statement stmt = con.createStatement()){

            //int row1 = stmt.executeUpdate("insert into Members values(34 , 'Raj' ,'raj@email.com' , 'Trainee' , 'M');");
            //int row2 = stmt.executeUpdate("insert into Members values(35 , 'Mohan' ,'mohan@email.com' , 'Trainee' , 'M');");
            ResultSet rs = stmt.executeQuery("select * from Members;");

            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String type = rs.getString(4);
                String gender = rs.getString(5);

                Member mem = new Member(id,name,type,email,gender);
                list.add(mem);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        printInfo(list);

    }
    public static void printInfo(List<Member> list){

        for (Member members : list) {
            System.out.println(members.toString());
        }

        //System.out.println("Id : "+ id + " " + "Name :" +name + " " + "Email :" +email + " " + "Type :" + type + " " + "Gender :" +gender);
    }

}
