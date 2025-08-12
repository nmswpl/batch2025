package in.co.nmsworks.week2.day2;

public class Runner {
    final int age=18;
   public static void main(String[] args) {
       Employee employee = new Employee(8,10,30);

       Employee employee1=new Contructor();
       Employee emp1=new FullTimeEmployee(8);
       System.out.println(emp1.displaySalary());


       System.out.println("parent Employee"+employee.toString());
       System.out.println(employee.displaySalary());
    }


}
