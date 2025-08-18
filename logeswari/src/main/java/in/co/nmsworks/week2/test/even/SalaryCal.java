package in.co.nmsworks.week2.test.even;

public class SalaryCal {
    private static boolean Salary;
    public int salary;
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }


    public SalaryCal(int salary, String name){

    }


    public int salaryCalculation(SalaryCal intern[], int salary) {

        return salary;

    }

    public static void main(String[] args) {

        SalaryCal[] ob=new SalaryCal[3];

        SalaryCal[] oj1=new SalaryCal[20000];
        SalaryCal[] oj2=new SalaryCal[20000];
        SalaryCal[] oj3=new SalaryCal[20000];
        
        SalaryCal[][] odj={oj1,oj2,oj3};
        
        for( SalaryCal[] s:odj){
            System.out.println(Salary);
            
        }




    }
}
