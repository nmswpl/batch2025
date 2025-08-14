package in.co.nmsworks.week2.day4;

public class ManagerAnnualIncomCalculating {

    public static void main(String[] args) {
        Employee manager= new Manager();
        System.out.println("Calculating the Annual Income for Manager :  "+manager.salary(12,3000)+" Name for Manager :"+manager.naming("XYZ"));
//        System.out.println("*******");
//        printingAnnualSalar(manager,"anu",2000,12);



        Employee employee=new EmploeeF();
        System.out.println("Calculating the Annual Income for Employee: "+employee.salary(12,2000)+ " Name for Employee :"+manager.naming("Logeswari"));
        manager.naming("logeswari");



    }

    public static void printingAnnualSalar(Employee emp){
        System.out.println("print : " +emp);

    }
}
