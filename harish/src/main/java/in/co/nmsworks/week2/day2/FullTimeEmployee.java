package in.co.nmsworks.week2.day2;

public class FullTimeEmployee extends Employee{
    final int basepay = 10;
    int perDayWorkingHour = 8;

    public int getSalary(int workingDays){
       return super.getSalary(basepay,workingDays * perDayWorkingHour);
    }

}
