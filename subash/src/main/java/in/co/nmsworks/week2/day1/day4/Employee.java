package in.co.nmsworks.week2.day1.day4;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double annualSalary()
    {
        System.out.println(name);
        return salary*12;
    }

    public static void main(String[] args) {

        Employee man=new Manager("Anand",3000,2000);
        System.out.println(man.annualSalary());

        Employee emp1=new Employee("Vimal",4000);
        System.out.println(emp1.annualSalary());





    }


}
