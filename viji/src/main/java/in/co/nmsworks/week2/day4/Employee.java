package in.co.nmsworks.week2.day4;

public  class Employee {
     String name ;
     double salaryPerMonth ;

    public String getName(){
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }


    public double annualSalary(){
        return salaryPerMonth * 12 ;
    }

}

