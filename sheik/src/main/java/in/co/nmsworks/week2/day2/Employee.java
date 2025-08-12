package in.co.nmsworks.week2.day2;

public class Employee
{
    private int days;
    private int hrs;
    private int basePay;
    private int salary;

    public int PrintCalculatedSalary(){
        int salary = hrs * basePay;
        return salary;
    }

    public int getBasePay() {
        return basePay;
    }

    public void setBasePay(int basePay) {
        this.basePay = basePay;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }
}

public class Contractor extends Employee
{
    @Override
    public int PrintCalculatesSalary(int hrs , int basePay){
       salary = hrs * basePay;
        System.out.println(salary);
    }
}


public class FullTime extends Employee
{
    public void PrintCalculatesSalary(int hrs , int basePay,int days){
        salary = days * hrs * basePay;

    }
}
public class PartTime extends Employee
{
    public void PrintCalculatesSalary(int hrs , int basePay,int days){
        salary = days * hrs * basePay;

}

