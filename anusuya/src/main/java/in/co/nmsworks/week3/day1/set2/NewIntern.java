package in.co.nmsworks.week3.day1.set2;

public class NewIntern {

    private String name;
    private int salary;

    NewIntern(){
    }

    NewIntern(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
