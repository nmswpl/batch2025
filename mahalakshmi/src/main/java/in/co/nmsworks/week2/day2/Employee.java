package in.co.nmsworks.week2.day2;

public class Employee {
    private int hours;
    private int basePay;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getBasePay() {
        return basePay;
    }

    public void setBasePay(int basePay) {
        this.basePay = basePay;
    }


    public static int calculateSalary(int totalHrs,int bP) {
        return totalHrs * bP;
    }
}
