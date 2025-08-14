package in.co.nmsworks.week2.day4;

public class Manager implements Employee{

    double bonus=2500;

    @Override
    public String naming(String name) {
        return name;
    }

    @Override
    public double salary(int month, double salary) {
        double totalSalaryOfManaer=bonus+(12 *salary);
        return (totalSalaryOfManaer);
    }

}
