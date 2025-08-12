package in.co.nmsworks.week2.day2;

public class Employee {
    public int hrs;
    public int basePay;

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public int getBasePay() {
        return basePay;
    }

    public void setBasePay(int basePay) {
        this.basePay = basePay;
    }

    public final int getSalary() {
        int salary = 30 * getHrs() * getBasePay();
        return salary;
    }
}

class Contractor extends Employee{
    Contractor(){
        super.setBasePay(3);
    }
}

class FullTimeEmployee extends Employee{
    FullTimeEmployee(){
        super.setBasePay(8);
    }
}

class PartTimeEmployee extends Employee{
    PartTimeEmployee(){
        super.setBasePay(5);
    }
}
