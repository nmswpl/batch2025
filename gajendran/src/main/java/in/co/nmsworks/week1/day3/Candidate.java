package in.co.nmsworks.week1.day3;

import in.co.nmsworks.week2.day3.Shape;

public class Candidate {

    private int id;
    private String name;
    private String email;
    private String dept;
    private Shape myShape;


    public Candidate(){}

    public Shape getMyShape() {
        return myShape;
    }

    public void setMyShape(Shape myShape) {
        this.myShape = myShape;
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

    public  void setCandidateDetails(int id, String name, String email, String Dept){
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;

    }

    public Candidate(int id, String name, String email, String dept){
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
    }


    public void setId(int id){
        this.id = id;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setDept(String dept){
        this.dept = dept;
    }



    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getDept(){
        return dept;
    }


}
