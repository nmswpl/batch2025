package in.co.nmsworks.week2.day2.exam.set2;

public class Intern {

    private static int countIntern = 0;
    private int salary = 0;
    private String name;

    public Intern(int salary, String name) {
        this.salary = salary;
        this.name = name;
        countIntern ++;
    }

    public int getSalary() {
        return salary;
    }

    public int getCountIntern() {
        return countIntern;
    }

}
