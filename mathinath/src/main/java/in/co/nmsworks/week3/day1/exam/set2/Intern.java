package in.co.nmsworks.week3.day1.exam.set2;

public class Intern {
    String name;
    int salary;

    public Intern(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Intern() {

    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Intern i1 = new Intern("Mathi",3000);
        Intern i2 = new Intern("Madan",3000);
        Intern i3 = new Intern("subash",3000);
        Intern[] interns = new Intern[]{i1,i2,i3};
        System.out.println( new Intern().calculateAverageSalary(interns));
    }

    private int calculateAverageSalary(Intern[] interns)
    {
        int avgSalary = 0;
        for (Intern i:interns)
        {
            avgSalary = avgSalary+i.getSalary();
        }
        return avgSalary /interns.length;
    }
}
