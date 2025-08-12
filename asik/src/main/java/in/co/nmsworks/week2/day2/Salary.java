package in.co.nmsworks.week2.day2;

public class Salary
{
    private int baseSalary;
    private int workingHours;
    private int noOfDays = 1;

    public Salary()
    {}

    public Salary(int baseSalary, int workingHours) {
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
    }

    public Salary(int days, int baseSalary, int workingHours) {
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
        this.noOfDays = days;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }
}
