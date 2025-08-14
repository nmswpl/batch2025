package in.co.nmsworks.week2.day4;

public class EmploeeF implements Employee{
    @Override
    public String naming(String name) {
        return name;
    }

    @Override
    public double salary(int month, double salary) {
        return (month*salary);
    }
}
