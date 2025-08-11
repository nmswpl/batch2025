package in.co.nmsworks.week1.day3;

import java.util.Objects;

public class Candidate {

    private int id;
    private String name;
    private String email;
    private String department;

    public Candidate() {
    }

    private Candidate(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()

    {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
          return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
            return email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return id == candidate.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String  getDepartment() {
        return  department;
    }

}
