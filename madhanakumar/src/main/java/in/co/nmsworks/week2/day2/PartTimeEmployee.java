package in.co.nmsworks.week2.day2;

public class PartTimeEmployee extends Employee {
    private int basePay;
    private int workingDays;
    private int workingHours;

    public PartTimeEmployee(int basePay, int workingDays, int workingHours) {
        this.basePay = basePay;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
    }

    @Override
    public void calcSalary (){
        int salary = this.basePay * this.workingHours * this.workingDays;
        System.out.println("The Salary for PartTimeEmployee : "+salary);
    }
}
