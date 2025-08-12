package in.co.nmsworks.week2.day2;

public class FullTimeEmployee extends Employee{
    final int basepay = 10;
    String employeeName;
    int employeeId;
    final int perDayWorkingHour = 8;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public int getSalary(int workingDays){
       return super.getSalary(basepay,workingDays * perDayWorkingHour);
    }
}
