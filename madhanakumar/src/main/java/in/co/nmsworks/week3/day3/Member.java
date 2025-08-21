package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.List;

public class Member {
    private int id;
    private String name;
    private String type;
    private String email;
    private String gender;

    public Member() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Member(int id, String name, String type, String email, String gender) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Members{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void establishConnection(List<Member> membersList) throws SQLException {

//        int update = stmt.executeUpdate("INSERT INTO Members Values (34,'Vimal','Trainee','vimal@gmail.com','M')");
//        int update1 = stmt.executeUpdate("INSERT INTO Members Values (35,'Kanna','Trainee','kanna@gmail.com','M')");
//        System.out.println(update);
//        System.out.println(update1);


       try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
        Statement stmt = con.createStatement()){
           ResultSet rs = stmt.executeQuery("select * from Members");
           while (rs.next()){
               setId(rs.getInt(1));
               setName(rs.getString(2));
               setType(rs.getString(3));
               setEmail(rs.getString(4));
               setGender(rs.getString(5));
               Member member = new Member(id, name, type, email, gender);
               membersList.add(member);
           }
       } catch (Exception e){
           e.printStackTrace();
       }
       finally {
           for (int i = 0; i < membersList.size(); i++) {
               System.out.println(membersList.get(i));
           }
           System.out.println("Statement Closed : Connection Closed");
       }
    }
}
