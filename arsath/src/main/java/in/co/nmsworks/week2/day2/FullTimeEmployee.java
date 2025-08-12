package in.co.nmsworks.week2.day2;

public class FullTimeEmployee extends Employee {
    @Override
    public void calculateSalary() {
        hours = noOfDays * 8;
        basePay = 10;
        super.calculateSalary();

    }
}
