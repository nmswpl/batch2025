package in.co.nmsworks.week2.day2;

public class Employee {
    int salary;
    String employeeName;
    int employeeId;

    public  int getSalary(int basePay,int workingHours){
        salary = basePay * workingHours;
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
