package in.co.nmsworks.week2.day2;

public class Employee {
    private int days;
    private int hours;
    private int basepay;

    public Employee() {

    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getBasepay() {
        return basepay;
    }

    public void setBasepay(int basepay) {
        this.basepay = basepay;
    }

    public Employee(int days, int hours, int basepay) {
        this.days = days;
        this.hours = hours;
        this.basepay = basepay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "days=" + days +
                ", hours=" + hours +
                ", basepay=" + basepay +
                '}';
    }
    public static void calculateSalar(Employee emp) {

        int salary;
        salary = emp.getHours() * emp.getBasepay();
        System.out.println(salary);
    }
}
