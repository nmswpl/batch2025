package in.co.nmsworks.week2.day2;

public class Employee {
    int salary;
    public int getSalary(int basePay,int workingHours){
        salary = basePay * workingHours;
        return salary;
    }
}
