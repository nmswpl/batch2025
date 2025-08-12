package in.co.nmsworks.week2.day2;

public class Employee {
    private int basicPay;
    private int workingHrs;
    private int noOfDays;

    public int getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(int basicPay) {
        this.basicPay = basicPay;
    }

    public int getWorkingHrs() {
        return workingHrs;
    }

    public void setWorkingHrs(int workingHrs) {
        this.workingHrs = workingHrs;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public Employee() {
    }


    public void Calculatesalary(){

           int totalHrs = workingHrs * noOfDays;
           int salary = totalHrs * basicPay;
        System.out.println(salary);
    }

}


