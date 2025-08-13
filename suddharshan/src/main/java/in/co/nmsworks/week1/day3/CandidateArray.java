package in.co.nmsworks.week1.day3;

import java.util.Objects;

public class CandidateArray {
    private int id;
    private String name;
    private String email;
    private String dept;

    public CandidateArray(){}

    public CandidateArray(int id, String name, String email, String dept){
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name= name;
    }

    public void setEmail(String email){
        this.email= email;
    }

    public void setDept(String dept){
        this.dept= dept;
    }

    public String getId(){
        return "Id: " + id;
    }

    public String getName(){
        return "Name: " + name;
    }

    public String getEmail(){
        return "Email: " + email;
    }

    public String getDept(){
        return "Dept: "+ dept;
    }

    public void printCandidateInfo(CandidateArray candidate){
        System.out.println("Id: " + candidate.id);
        System.out.println("Name: " + candidate.name);
        System.out.println("Dept: " + candidate.dept);
        System.out.println("Email: " + candidate.email);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CandidateArray candidate = (CandidateArray) o;
        return Objects.equals(dept, candidate.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dept);
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
