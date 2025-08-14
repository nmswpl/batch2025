package in.co.nmsworks.week2.day2;

public class Contractor extends Employee{

    int basicPay;
    int workingHours;

    public Contractor() {
    }

    public Contractor(int basicPay, int workingHours) {
        this.basicPay = basicPay;
        this.workingHours = workingHours;
    }


    public void calculateSalary() {
        super.calculateSalary(workingHours,basicPay);
    }
}
