package in.co.nmsworks.week1.day3;

import java.util.Objects;

public class Candidate
{
    private int id;
    private String name;
    private String email;
    private String dept;

    public Candidate()
    {}

    public Candidate(int id, String name, String email, String dept)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return this.id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setDept(String dept)
    {
        this.dept = dept;
    }

    public String getDept()
    {
        return this.dept;
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
