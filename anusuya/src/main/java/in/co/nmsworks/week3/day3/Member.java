package in.co.nmsworks.week3.day3;

import java.sql.*;

public class Member {

    private int id;
    private String name;
    private String email;
    private String type;
    private String gender;

    public Member(int id, String name, String email, String type, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
