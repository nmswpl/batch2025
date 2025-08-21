package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnection
{
    public static void main(String[] args) {
        JDBCConnection db = new JDBCConnection();
        db.printDatabase();

    }
    public  static void printDatabase() {
        Connection con;
        Statement stmt;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            stmt = con.createStatement();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        try {
            int up1 = stmt.executeUpdate("insert into Members values(32,'mani','mani@gamil.com','trainee','m')");
            int up2 = stmt.executeUpdate("insert into Members values(33,'manivanan','manivanan@gamil.com','trainee','m')");

            ResultSet rs = stmt.executeQuery("select * from Members");

            List<Member> members = new ArrayList<>();
            try {
                while (rs.next())
                {
                    Member member = new Member();
                    member.setId(rs.getInt(1));
                    member.setName(rs.getString(2));
                    member.setEmail(rs.getString(3));
                    member.setType(rs.getString(4));
                    member.setGender(rs.getString(5));

                    members.add(member);
                    System.out.println(member);

                }
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

   public  static void printDatabsaeInfo(int id,String name,String email,String type,String gender)
    {
        System.out.println("Id :" +id + " Name :"+name +" Email :"+email+" Type :"+type+" Gender :"+gender);
    }
}
