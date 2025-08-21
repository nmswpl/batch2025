package in.co.nmsworks.week3.day4;

import java.util.Objects;

public class Trainee {
     private int id;
    private String name;
    private String department;

    public Trainee(){

    }
    public Trainee(int id ,String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Id :" + id + "Name :" + name + " department " + department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return id == trainee.id && Objects.equals(name, trainee.name) && Objects.equals(department, trainee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
