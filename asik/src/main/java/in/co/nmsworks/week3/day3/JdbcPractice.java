package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcPractice
{

    private List<Member> members = new ArrayList<>();

    public static void main(String[] args)
    {
        JdbcPractice jdbcPractice = new JdbcPractice();

        try( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
        Statement stmt = con.createStatement() )
        {
            String selectQuery = "select * from Members";

            String insertQuery1 = "insert into Members values (32, 'Ashwin' , 'Trainee', 'ashwin@nms.co.in', 'M')";
            String insertQuery2 = "insert into Members values (33, 'Ashwini' , 'Trainee', 'ashwini@nms.co.in', 'G')";
            String insertQuery3 = "insert into Members values (34, 'Arjun' , 'Trainee', 'arjun@nms.co.in', 'M')";
            String insertQuery4 = "insert into Members values (35, 'Vignesh' , 'Trainee', 'vignesh@nms.co.in', 'M')";

            jdbcPractice.copyDbMembersToMembersListAndPrint(stmt, selectQuery);

            /*jdbcPractice.insertIntoDb(stmt, insertQuery1);

            jdbcPractice.insertIntoDb(stmt, insertQuery2);

            jdbcPractice.insertIntoDb(stmt, insertQuery3);

            jdbcPractice.insertIntoDb(stmt, insertQuery4);*/

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    private void insertIntoDb(Statement stmt, String query)
    {
        try
        {
            int rowsAffected = stmt.executeUpdate(query);

            if (rowsAffected > 0)
            {
                System.out.println("Insertion into DB Successfull and the Rows Affected is " + rowsAffected);
            }

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    private void copyDbMembersToMembersListAndPrint(Statement stmt, String query)
    {

        try( ResultSet rs = stmt.executeQuery(query) )
        {
            while (rs.next())
            {
                Member member = new Member();
                member.setId(rs.getInt(1));
                member.setName(rs.getString(2));
                member.setEmail(rs.getString(3));
                member.setType(rs.getString(4));
                member.setGender(rs.getString(5));
                members.add(member);
            }

            printMembersDetails(members);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    private static void printMembersDetails(List<Member> members)
    {
        for (Member member : members)
        {
            System.out.println(member);
        }
    }
}
