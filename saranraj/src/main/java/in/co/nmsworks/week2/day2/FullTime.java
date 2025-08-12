package in.co.nmsworks.week2.day2;

public class FullTime extends Employee {
      private int basicPay;
      private int workingHrs;
      private int noOfDays;



    public FullTime(int basicPay, int workingHrs, int workingDays) {
        this.basicPay = basicPay;
        this.workingHrs = workingHrs;
        this.noOfDays = workingDays;
    }

    public FullTime() {
    }

    @Override
    public void Calculatesalary() {
        int totalHrs = workingHrs * noOfDays;
        int salary = totalHrs * basicPay;
        System.out.println("Full Time Salary : "+ salary);
    }
}
