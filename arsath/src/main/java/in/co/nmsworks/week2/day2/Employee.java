package in.co.nmsworks.week2.day2;

public class Employee {
    int hours;
    int basePay;
    int noOfDays = 30;

    public void calculateSalary(){
        int salary = hours * basePay;
        System.out.println(salary);
    }
}

