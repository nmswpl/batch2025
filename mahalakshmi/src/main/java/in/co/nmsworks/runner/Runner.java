package in.co.nmsworks.runner;
import in.co.nmsworks.week2.day3.*;
import in.co.nmsworks.week2.day4.*;
import in.co.nmsworks.week2.day4.Employee;
//import in.co.nmsworks.week2.day2.Animal.Dog;

public class Runner {
    private static int age = 5;
    final float PI = 3.14f;
    final String name = "Maha";

//    public static void main(String[] args) {
//        Candidate c1 = new Candidate(1,"maha","abc","cde");
//        age++;
//        Sample s1 = new Sample();
//    }

    public void test1() {
        age += 1;
        Double d = Double.valueOf(1.1);
        double d1 = d;

    }

//    public static void main(String[] args) {
//        FullTimeEmployee ft = new FullTimeEmployee();
//        ft.setDays(30);
//        ft.setBasePay(10);
//        ft.setHours(8);
//        int total1 = ft.calculateTotalHours(ft.getDays(),ft.getHours());
//        System.out.println("Salary: $" + ft.calculateSalary(total1,ft.getBasePay()));
//
//
//        PartTimeEmployee pt = new PartTimeEmployee();
//        pt.setDays(30);
//        pt.setBasePay(8);
//        pt.setHours(4);
//        int total2 = pt.calculateTotalHours(pt.getDays(),pt.getHours());
//        System.out.println("Salary: " + pt.calculateSalary(total2,pt.getBasePay()));
//
//        Contractor con = new Contractor();
//        con.setBasePay(3);
//        con.setHours(6);
//        System.out.println("Salary: $" + con.calculateSalary(con.getHours(),con.getBasePay()));
//
//    }

//    public static void main(String[] args) {
//        Dog d1 = new Dog();
//        d1.makeSound();
//    }

//    public static void printArea(Square s1) {
//        System.out.println(s1.area());
//    }
//
//    public static void printArea(Rectangle rectangle) {
//        System.out.println(rectangle.area());
//    }


//    public static void main(String[] args) {
////        Rectangle r1 = new Rectangle(3,4);
////        System.out.println("Perimeter: "+ r1.perimeter());
////        System.out.println("Area: " + r1.area());
////
//        Square s1 = new Square(6);
//        System.out.println("Perimeter of square: " + s1.perimeter());
//        System.out.println("Area of square: " + s1.area());
//        printArea(s1);
////        printArea(r1);
////        printPerimeter(r1);
////        System.out.println();
////        s1.printClassName();
////        r1.printClassName();
////        printNumOfSides(r1);
//////        Shape.getDescription();
////
////        Triangle t1 = new Triangle();
//////        System.out.println("Perime");
////        printArea(t1);
//
//        Candidate c = new Candidate(1,"maha","maha@mail.com","dept");
//        c.setMyShape(s1);
//        c.setMyShape(new Square(3));
//        System.out.println(c.getMyShape().area());
//    }
//    public static void main(String[] args) {
//        CreditCardPayment cc = new CreditCardPayment();
////        cc.processPayment(30);
//        UPIPayement upi = new UPIPayement();
////        upi.processPayment(40);
//
//        Person p1 = new Person();
//        p1.setName("maha");
//        p1.setPreferredGW(cc);
//        p1.makePayment(1000);
//
//        Person p2 = new Person();
//        p2.setName("lakshmi");
//        p2.setPreferredGW(upi);
//        p2.makePayment(80);
//
//        CryptoPayment crypto = new CryptoPayment();
//        Person p3 = new Person();
//        p3.setName("Nandhu");
//        p3.setPreferredGW(crypto);
//        p3.makePayment(89);
//
//    }
//    public static void main(String[] args) {
//        BookingSystem screen1 = new BookingSystem(50);
//        screen1.bookTicket(7);
//        screen1.bookTicket(9);
//
//        BookingSystem screen2 = new BookingSystem(60);
//        screen2.bookTicket(5);
//
//        BookingSystem screen3 = new BookingSystem(90);
//        screen3.bookTicket(3);
//    }

    public static void printArea(Shape s) {
        System.out.println("Area is " + s.area());
        s.printClassName();
    }

    public static void printNumOfSides(Shape s) {
        if (s instanceof Square) {
            Square sq = (Square) s;
//            int sq = (Integer) s;
            sq.getDescription();
        }
        else if(s instanceof Triangle) {
            System.out.println("3");
        }

        else if(s instanceof Rectangle){
            System.out.println("4");
        }
    }

    public static void printPerimeter(Shape s) {
        System.out.println("Perimeter is " + s.perimeter());
    }

//    public static void main(String[] args) {
//        Employee em1 = new Employee("John",30000);
//        System.out.println(em1.annualSalary());
//
//        Employee em2 = new Manager("Smith",40000,15000);
//        System.out.println(em2.annualSalary());
//    }

//    public static void main(String[] args) {
//       Report r1 = new SalesReport();
//       Report r2 = new InventoryReport();
//       System.out.println(r1.generate());
//        System.out.println(r2.generate());
//    }

    }

