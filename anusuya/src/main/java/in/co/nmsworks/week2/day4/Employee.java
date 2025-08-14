package in.co.nmsworks.week2.day4;

import java.util.EnumMap;

public class Employee {

    public String name;
    public double salaryPerMonth;

    public Employee() {
    }

    public Employee(String name, double salaryPerMonth){
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public double annualSalary(){
        return salaryPerMonth*12;
    }
}
