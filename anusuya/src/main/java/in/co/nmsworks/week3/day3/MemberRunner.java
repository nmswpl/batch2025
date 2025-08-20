package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberRunner {

    public static List<Member> members = new ArrayList<>();

    public static void main(String[] args) {

        MemberRunner memrun = new MemberRunner();

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            Statement stmt = con.createStatement()){

            try (ResultSet rs = stmt.executeQuery("SELECT * FROM Members")) {
                while(rs.next()){
                    members.add(new Member(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(4)));
                }
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
           // memrun.insertCandidateInfo();
            memrun.printCandidateInfo(members);
        }
        catch (SQLException e){
            e.printStackTrace();
            return;
        }
    }

    private void printCandidateInfo(List<Member> members) {

        for(int i = 0; i < members.size(); i++){
            System.out.println(members.get(i));
        }
    }

    private void insertCandidateInfo(){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            Statement stmt = con.createStatement()){

            int rs = stmt.executeUpdate("INSERT INTO Members VALUES(32,'Sachin','Trainee','sac','M')");
            System.out.println("Updated Row Count is : " + rs);
            int rs1 = stmt.executeUpdate("INSERT INTO Members VALUES(33,'Rexi','Trainee','rex','F')");
            System.out.println("Updated Row Count is : " + rs1);

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
