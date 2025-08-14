package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.Candidate;
import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;
import in.co.nmsworks.week2.day2.*;
import in.co.nmsworks.week2.day3.*;
import in.co.nmsworks.week2.day4.*;

public class Runner {
    public static void main(String[] args) {

        SalesReport salesReport = new SalesReport();
        salesReport.header("Sales Report");
        salesReport.body("This is the sale report in this the sale are listed");
        salesReport.footer("This is the sales report");
        salesReport.generateReport();



        InventoryReport inventoryReport = new InventoryReport();
        inventoryReport.header("INVENTORY REPORT");
        inventoryReport.body("WE HAVE AN MULTIPLE STOCK OF LAPTOPS");
        inventoryReport.footer("FOOTER");
        inventoryReport.generateReport();


    /// //runnnwe






        /// /runner
//        NewEmployee employer1 = new NewEmployee("harish", 30000);
//        employer1.annualSalary();
//
//        NewEmployee manager = new NewEmployee("Manager", 45000);
//        manager.setBonus(25000);
//        manager.annualSalary();


//        NewEmployee e1 = new in.co.nmsworks.week2.day4.Manager();
//        e1.setSalaryPerMonth(20);
//        e1.setName("Harish");
//        System.out.println(e1.getAnnualSalary());
//
//
//        in.co.nmsworks.week2.day4.Manager m1 = new in.co.nmsworks.week2.day4.Manager();
//        m1.setName("Manager");
//        m1.setBonus(90);
//        m1.setBonus(34);
//        System.out.println("Salary :" + (m1.getAnnualSalary() + m1.getBonus()));
//
//        NewEmployee emp = new NewEmployee();
//        emp.setSalaryPerMonth(20);
//        emp.setName("Harish");
//        System.out.println(emp.getAnnualSalary());
//
//
//        NewEmployee emp1 = new NewEmployee();
//        emp.setSalaryPerMonth(20);
//        emp.setName("The Manager");
//        in.co.nmsworks.week2.day4.Manager m1 = emp;
//        emp.setBonus(90);
//        System.out.println(emp.getAnnualSalary() + emp.getBonus());
//

       NewManager manager = new NewManager();
       manager.setName("Harish");
       manager.setBonus(20);
       manager.setSalaryPerMonth(20);
       System.out.println("The Manager salary is " + (manager.getAnnualSalary() + manager.getBonus()));

       NewEmployee employee1 = new NewEmployee();
       employee1.setName("Harish");
       employee1.setSalaryPerMonth(20);
       System.out.println("The employee salary is " + employee1.getAnnualSalary());





        /// runner
        Screen1 booking1 = new Screen1();
        booking1.bookTicket(2);
        System.out.println(booking1.printTheAvailability());



        Screen2 booking2 = new Screen2();
        booking2.bookTicket(2);
        System.out.println(booking2.printTheAvailability());


        Screen3 booking3 = new Screen3();
        booking3.bookTicket(2);
        System.out.println(booking3.printTheAvailability());


        Screen1 booking4 = new Screen1();
        booking4.bookTicket(5);
        System.out.println(booking4.printTheAvailability());








/// ruuner

        CreditCardPayment cc1 = new CreditCardPayment();
        cc1.payment(250);
        UpiPayment upi1 = new UpiPayment();
        upi1.payment(290);
        CryptoPayment cr1 = new CryptoPayment();
        cr1.payment(315);

        Persons p1 = new Persons();
        p1.setPgw(cc1);
        p1.makePayment(350);

        Persons p3 = new Persons();
        p3.setPgw(cr1);
        p3.makePayment(350);

        Persons p2 = new Persons();
        p2.setPgw(upi1);
        p2.makePayment(350);








        /// runner
        Manager m12 = new Manager();
        m12.work();

        Developer d1 = new Developer();
        d1.work();




        //runner

        Rectangle r1 = new Rectangle(3,4);

        System.out.println("Perimeter :" + r1.perimeter());
        System.out.println("Area :" + r1.area());

        Square s1 = new Square(6);
        System.out.println("Perimeter :" + s1.perimeter());
        System.out.println("Area :" + s1.area());


        Triangle t1 = new Triangle(3,4);

        Shape s2 = new Square(23);
        System.out.println(s2.area());
        s2.printClassName();

        printArea(s1);
        printArea(r1);
        printArea(t1);
        printPerimeter(s1);
        printNumberOfSides(s1);
        printNumberOfSides(t1);
        Candidate c1 = new Candidate(1,"name","email.com","DA");
        c1.setMyShape(s1);
        c1.setMyShape(new Square(3));
        System.out.println(c1.getMyShape());
    }




    public static void printNumberOfSides(Shape s1) {

        if (s1 instanceof Square){
            Square sq =  (Square) s1 ;
        }

        else if(s1 instanceof Rectangle){
            System.out.println("Four Sided");
        }

        else if (s1 instanceof Triangle) {
            System.out.println("Three Sided");
        }
    }

    public static void printPerimeter(Shape s1) {

        System.out.println("Perimeter :" + s1.perimeter());
    }


    /// the







    /*
    private static void printArea(Square s1) {

        System.out.println("Perimiter :" + s1.perimeter());
        System.out.println("Area :" + s1.area());
    }

    public static void printArea(Rectangle rectangle){

        System.out.println("Perimeter :" + rectangle.perimeter());
        System.out.println("Area :" + rectangle.area());

    }

    */
    public static void printArea(Shape s){
        System.out.println("Area is :" + s.area());
        s.printClassName();


    }














    public static void printTeacherName(Subject subject){
        System.out.println(subject.getTeacher().getName());
    }

    public static void previouday(){
        Teacher teacher1 = new Teacher(1,"sanjeevsir");
        Teacher teacher2 = new Teacher(2,"rajeshsir");


        System.out.println(teacher1);
        System.out.println(teacher2);

        Subject maths = new Subject();
        maths.setCode("ma101");
        maths.setName("Maths");
        maths.setTeacher(teacher1);
        System.out.println(maths);

        Subject science = new Subject();
        science.setCode("sce001");
        science.setName("Science");
        science.setTeacher(teacher2);
        System.out.println(science);
        printTeacherName(science);


        Subject[] subjectList = new Subject[10];
        subjectList[0] = new Subject();



        //NEW FUNCTIONS

        FullTimeEmployee employee1 = new FullTimeEmployee();
        employee1.setEmployeeId(1);
        employee1.setEmployeeName("Harish");
        System.out.println("The employee name is  :" + employee1.getEmployeeName() + "\t AND employee id is : " + employee1.getEmployeeId() + " \tAND employee salary is :"+employee1.getSalary(30));


        PartTimeEmployee employee2= new PartTimeEmployee();
        employee2.setEmployeeName("Harry");
        employee2.setEmployeeId(2);
        System.out.println("The employee name is  :" + employee2.getEmployeeName() + "\t AND employee id is :" + employee2.getEmployeeId() + "\t AND employee salary is :"+employee2.getSalary(30));

        Contractor employee3 = new Contractor();
        employee3.setEmployeeId(5);
        employee3.setEmployeeName("Parthiban");
        System.out.println("The employee name is " + employee3.getEmployeeName() + "\t AND employee id is " + employee3.getEmployeeId() + "\t AND employee salary is"+employee3.getSalary(30));

    }
}
