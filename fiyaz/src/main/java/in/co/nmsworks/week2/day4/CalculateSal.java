package in.co.nmsworks.week2.day4;

public class CalculateSal {
    public static void main(String[] args) {

        Employee e1 = new Employee("Fiyaz",35000);
        calculateSal(e1);

        System.out.println();

        Manager m1 = new Manager();
        m1.setName("Riyaz");
        m1.setSalaryPerMonth(45000);
        m1.setBonus(45000);

        calculateSal(m1);


    }

    public static void calculateSal(Employee emp) {
        System.out.println(emp);
        System.out.println("Name : " + emp.getName());
        System.out.println("Total Annual Salary : " + emp.annualSalary());
    }


}
