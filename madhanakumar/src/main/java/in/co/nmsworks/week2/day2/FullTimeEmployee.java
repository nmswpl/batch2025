package in.co.nmsworks.week2.day2;

public class FullTimeEmployee extends Employee {
    private int basePay;
    private int workingDays;
    private int workingHours;

    public FullTimeEmployee(int basePay, int workingDays, int workingHours) {
        this.basePay = basePay;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
    }

    @Override
    public void calcSalary(){
        int salary = this.workingHours * this.basePay * this.workingDays;
        System.out.println("The Salary for FullTimeEmployee : "+salary);
    }

}
