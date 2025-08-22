package in.co.nmsworks.week3.day4;

import java.util.Objects;

public class Trainees {
    private int id;

    public Trainees(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    private String name;

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    private String dept;

    @Override
    public String toString() {
        return "Trainees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Trainees trainees = (Trainees) o;
        return id == trainees.id && Objects.equals(name, trainees.name) && Objects.equals(dept, trainees.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dept);
    }
}
