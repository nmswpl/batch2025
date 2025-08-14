package in.co.nmsworks.week2.day2;

public class ContractTime extends Employee {
    private int basicPay;
    private int workingHrs;
    private int noOfDays =30;

    public ContractTime() {
    }

    public ContractTime(int basicPay, int workingHrs) {
        this.basicPay = basicPay;
        this.workingHrs = workingHrs;

    }




    @Override
    public  void Calculatesalary() {
        int totalHrs = workingHrs * noOfDays;
        int salary = totalHrs * basicPay;
        System.out.println("Contract Salary : "+ salary);
    }
}
