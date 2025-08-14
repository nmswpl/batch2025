package in.co.nmsworks.week1.day3;

import in.co.nmsworks.week2.day3.Shape;

import java.util.Objects;

public class Candidate {
    private int id;
    private String name;
    private String email;
    private String department;
    private Shape myShape;

    public Shape getMyShape() {
        return myShape;
    }

    public void setMyShape(Shape myShape) {
        this.myShape = myShape;
    }

    public Candidate() {

    }

    public Candidate(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printCandidateInfo() {

    }

    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name +
                ", email='" + email +
                ", department='" + department +
                '}';
    }
}
