package in.co.nmsworks.week2.day2;

public class Employee {
    private int days;
    private int hrs;
    private int basePay;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
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


    public int PrintCalculatesSalary(){
        int salary = hrs * basePay;
        return salary;
    }

}
class PartTime extends Employee
{

    public int PrintCalculatesSalary(){
      return super.PrintCalculatesSalary() * getDays();

    }
}


class FullTime extends Employee
{

    public int PrintCalculatesSalary(){
        return super.PrintCalculatesSalary() * getDays();

    }
}
class Contractor extends Employee {

    public int PrintCalculatesSalary() {
        return super.PrintCalculatesSalary();

    }
}

