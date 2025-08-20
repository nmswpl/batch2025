package in.co.nmsworks.week3.day3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Member {
    private int id;
    private String name;
    private String type;
    private String email;
    private String gender;

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

    public void printMemberDetails() {
        System.out.println("Id :: "+getId() +" Name :: "+getName()+" type :: "+getType()+" Email :: "+getEmail()+" Gender :: "+getGender());
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
