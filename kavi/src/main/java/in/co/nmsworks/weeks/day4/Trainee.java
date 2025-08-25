package in.co.nmsworks.weeks.day4;

import java.util.Objects;

public class Trainee {
    private int id;
    private String name;
    private String department;

    public Trainee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + name  + department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trainee)) return false;
        Trainee trainee = (Trainee) o;
        return id == trainee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
