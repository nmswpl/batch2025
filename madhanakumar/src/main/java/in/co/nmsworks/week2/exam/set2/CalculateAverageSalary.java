package in.co.nmsworks.week2.exam.set2;

public class CalculateAverageSalary {
    private String name;
    private int salary;

    public CalculateAverageSalary() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public CalculateAverageSalary(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void calculateAverageSalary(){
        CalculateAverageSalary c1 = new CalculateAverageSalary("Madhan", 21000);
        CalculateAverageSalary c2 = new CalculateAverageSalary("Kumar", 30000);
        CalculateAverageSalary c3 = new CalculateAverageSalary("Dhoni", 40000);
        CalculateAverageSalary c4 = new CalculateAverageSalary("Ronaldo", 50000);
        CalculateAverageSalary c5 = new CalculateAverageSalary("Lucifer", 45000);

        CalculateAverageSalary[] intern = new CalculateAverageSalary[]{c1,c2,c3,c4,c5};

        int length = 0;
        double average = 0.0;

        for(CalculateAverageSalary i : intern){
            length += 1;
            average += i.getSalary();
        }

        System.out.println("The Average Salary of Interns is : "+average/length);
    }

}

class testRunner1{
    public static void main(String[] args) {
        CalculateAverageSalary ca = new CalculateAverageSalary();
        ca.calculateAverageSalary();
    }
}
