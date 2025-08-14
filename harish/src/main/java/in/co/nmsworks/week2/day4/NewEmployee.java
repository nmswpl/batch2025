package in.co.nmsworks.week2.day4;

public class NewEmployee{

    private String name;
    private double salaryPerMonth;

//    public void New1Employee(String name , double salaryPerMonth){
//        this.name = name;
//        this.salaryPerMonth = salaryPerMonth;
//    }


    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double  getAnnualSalary(){
         return  12 * salaryPerMonth ;
        //System.out.println("The Annual salary of the " + name + "  " + salary);
    }
}
