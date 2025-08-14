package in.co.nmsworks.week2.day2;

public class PartTimeEmployee extends Employee{
    @Override
    public void calculateSalary() {
        hours = noOfDays * 5;
        basePay = 5;
        super.calculateSalary();
    }
}
