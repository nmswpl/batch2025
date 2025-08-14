package in.co.nmsworks.week2.day4;

public class Employee {

    private String name;
    private double salaryPerMonth;

    public void setNameAndSalary(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public double annualSalary(){
        return salaryPerMonth * 12.0;
    }


}
