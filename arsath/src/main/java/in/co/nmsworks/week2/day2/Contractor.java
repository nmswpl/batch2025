package in.co.nmsworks.week2.day2;

public class Contractor extends Employee {
    @Override
    public void calculateSalary() {
        hours = 30;
        basePay = 3;
        super.calculateSalary();
    }
}
