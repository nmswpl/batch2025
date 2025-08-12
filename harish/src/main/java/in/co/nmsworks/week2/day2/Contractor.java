package in.co.nmsworks.week2.day2;

public class Contractor extends  Employee {
    final int basepay = 3;
    String employeeName;
    int employeeId;

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
    public int getSalary(int workingHours) {
        return super.getSalary(basepay, workingHours);
    }
}
