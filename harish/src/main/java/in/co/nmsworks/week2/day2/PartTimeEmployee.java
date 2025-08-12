package in.co.nmsworks.week2.day2;

public class PartTimeEmployee extends Employee {
    final int basepay = 5;
    int perDayWorkingHour = 4;

    public int getSalary(int workingDays) {
        return super.getSalary(basepay, workingDays * perDayWorkingHour);
    }
}
