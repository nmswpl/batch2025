package in.co.nmsworks.week2.day2;

public class FullTImeEmployee extends Employee{

    int basicPay;
    int workingHours;

    public FullTImeEmployee() {
    }

    public FullTImeEmployee(int basicPay, int workingHours) {
        this.basicPay = basicPay;
        this.workingHours = workingHours;
    }


    public void calculateSalary() {
        workingHours=workingHours * 30;
        super.calculateSalary(workingHours,basicPay);
    }
}
