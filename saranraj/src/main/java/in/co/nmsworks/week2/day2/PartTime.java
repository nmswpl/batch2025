package in.co.nmsworks.week2.day2;

public class PartTime extends Employee{
    private int basicPay;
    private int workingHrs;
    private int noOfDays;


    public PartTime() {
    }

    public PartTime(int basicPay, int workingHrs, int workingDays) {
        this.basicPay = basicPay;
        this.workingHrs = workingHrs;
        this.noOfDays = workingDays;
    }



    @Override
    public void Calculatesalary() {
        int totalHrs = workingHrs * noOfDays;
        int salary = totalHrs * basicPay;
        System.out.println("Part Time Salary : "+ salary);
    }
}
