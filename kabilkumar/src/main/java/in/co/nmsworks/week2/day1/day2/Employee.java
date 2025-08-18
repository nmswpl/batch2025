package in.co.nmsworks.week2.day1.day2;

public class Employee {

    private  int hrs;
    private int days;
    private int salary;
    String basicSalary;

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    public class contractor extends Employee {
        @Override
        public int getDays() {
            return days;
        }

        @Override
        public int getHrs() {
            return hrs;
        }
    }

    public class fullTimeEmp extends Employee {


    }

    public class partTimeEmp extends Employee {

    }


    public static void calculateSalary(int salary, int hrs) {
        int result = salary * hrs;
    }


}


