package in.co.nmsworks.week2.day2;

public class Employee {

    public void calculateSalary(int basicPay, float workingHours){
        float salary = workingHours * basicPay;
        System.out.println(salary);
    }
}
