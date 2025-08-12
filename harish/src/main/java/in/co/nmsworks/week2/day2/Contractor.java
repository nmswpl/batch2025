package in.co.nmsworks.week2.day2;

public class Contractor extends  Employee {
    final int basepay = 3;
    public int getSalary(int workingHours) {
        return super.getSalary(basepay, workingHours);
    }
}
