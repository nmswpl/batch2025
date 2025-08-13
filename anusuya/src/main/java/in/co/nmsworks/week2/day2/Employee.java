package in.co.nmsworks.week2.day2;

public class Employee {

    private int noOfWorkingHours;
    int basePay;

    public void setNoOfWorkingHours(int noOfWorkingHours) {
        this.noOfWorkingHours = noOfWorkingHours;
    }

    public int getNoOfWorkingHours() {
        return noOfWorkingHours;
    }

    public void setBasePay(int basePay) {
        this.basePay = basePay;
    }

    public int getBasePay() {
        return basePay;
    }

    public int calculateSalary(){
        return getNoOfWorkingHours()*getBasePay();
    }
}

class Contractor extends Employee{

    @Override
    public void setNoOfWorkingHours(int noOfWorkingHours) {
        super.setNoOfWorkingHours(noOfWorkingHours);
    }

    @Override
    public void setBasePay(int basePay) {
        super.setBasePay(basePay);
    }
}

class FullTimeEmployee extends Employee{

    private int noOfWorkingHoursPerDay = 8;

    public void setNoOfWorkingDays(int noOfWorkingDays) {
        super.setNoOfWorkingHours(noOfWorkingDays*noOfWorkingHoursPerDay);
    }

    @Override
    public void setNoOfWorkingHours(int noOfWorkingHoursPerDay) {
        this.noOfWorkingHoursPerDay = noOfWorkingHoursPerDay;
    }

    @Override
    public void setBasePay(int basePay) {
        super.setBasePay(basePay);
    }
}

class PartTimeEmployee extends Employee{

    private int noOfWorkingHoursPerDay = 4;

    public void setNoOfWorkingDays(int noOfWorkingDays) {
        super.setNoOfWorkingHours(noOfWorkingDays*noOfWorkingHoursPerDay);
    }

    @Override
    public void setNoOfWorkingHours(int noOfWorkingHoursPerDay) {
        this.noOfWorkingHoursPerDay = noOfWorkingHoursPerDay;
    }

    @Override
    public void setBasePay(int basePay) {
        super.setBasePay(basePay);
    }
}