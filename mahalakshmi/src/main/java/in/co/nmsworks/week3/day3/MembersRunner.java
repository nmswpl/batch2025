package in.co.nmsworks.week3.day3;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MembersRunner {
    public static List<Member> convertToMembers(ResultSet rs) throws SQLException {
        List<Member> memList = new ArrayList<>();
        Member mem = null;
        while (rs.next()) {
            try {
                memList.add(new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return memList;
    }

    public static List<Member> dbConnection() throws SQLException {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            try (Statement stat = con.createStatement()) {
                ResultSet rs = stat.executeQuery("SELECT * FROM Members;");
                List<Member> memberList = convertToMembers(rs);
                String query1 = "INSERT INTO Members (id,name,email,type,gender) VALUES (34,'Nandhini','nandhu@gmail.com', 'trainee','F'),(35,'Ananthy','ananathy@gmail.com','Trainee','f')";
                stat.executeUpdate(query1);
                return memberList;
            }
    }


    public static void main(String[] args) throws SQLException {
        List<Member> list = dbConnection();
        for (Member member : list) {
            System.out.println(member);
        }
    }
}
