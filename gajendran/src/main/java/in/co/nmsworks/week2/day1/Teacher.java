package in.co.nmsworks.week2.day1;

public class Teacher {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Teacher(){

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



}
