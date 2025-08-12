package in.co.nmsworks.week2.day2;

public class Contractor extends Employee {
    private int basePay;
    private int workingHours;
    public int salary;


    public Contractor(int basePay, int workingHours) {
        this.basePay = basePay;
        this.workingHours = workingHours;
    }


    @Override
    public void calcSalary(){
        salary = this.basePay * this.workingHours;
        System.out.println("The Salary for Contractor : "+salary);
    }
}
