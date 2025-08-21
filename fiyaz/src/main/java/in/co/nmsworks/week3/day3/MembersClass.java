package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class MembersClass {

    public static void main(String[] args) throws SQLException {



        Connection con;
        ResultSet rs;



        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training","nms-training");


        try (Statement stm = con.createStatement()) {

            rs = stm.executeQuery("Select * from Members");
            List<Member> list = new ArrayList<>();
            while (rs.next()) {
                Member m = new Member(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("type"),
                        rs.getString("email"),
                        rs.getString("gender")
                );

                list.add(m);

            }

            for (Member member : list) {
                System.out.println(member);
            }

        }

//        String toQuery = "insert into Members(id,name,type,email,gender) values(1,'Ram','trainee','ram@gmail.com', 'M')";

    }
}



class Member {
    int id;
    String name;
    String type;
    String email;
    String gender;

    public Member(int id, String name, String type, String email, String gender) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
        this.gender = gender;
    }




    public Member() {

    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
