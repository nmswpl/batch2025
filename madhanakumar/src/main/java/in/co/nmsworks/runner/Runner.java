package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.Candidate;
import in.co.nmsworks.week2.day2.CandidateArray;
import in.co.nmsworks.week2.day3.*;

public class Runner {
//    final static float PI = 3.14f;
    public static void main(String[] args) {
//        Teacher teacher1 = new Teacher(1, "Rayleigh");
//        Teacher teacher2 = new Teacher(2, "Jiraya");
//
//        System.out.println(teacher1);
//        System.out.println(teacher2);
//
//        Subject maths = new Subject();
//        maths.setCode("MA101");
//        maths.setName("Maths");
//        maths.setTeacher(teacher1);
//
//        System.out.println(maths);
//
//        Subject science = new Subject();
//        science.setCode("SC101");
//        science.setName("Science");
//        science.setTeacher(teacher2);
//
//        System.out.println(science);
//
//        printTeacherName(science);
//
//        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(10, 30, 8);
//
//        fullTimeEmployee.calcSalary();
//
//        Contractor contractor = new Contractor(3, 6);
//
//        contractor.calcSalary();
//
//        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(5, 30, 5);
//
//        partTimeEmployee.calcSalary();

//        Rectangle rectangle = new Rectangle(4,3);

//        System.out.println("Area : " + rectangle.area());
//        System.out.println("Perimeter : " + rectangle.perimeter());

//        Square square = new Square(6);

//        System.out.println("Area : "+ square.area());
//        System.out.println("Perimeter : "+ square.perimeter());

//        Triangle triangle = new Triangle(4,6);
//
//        printArea(square);
//        printArea(rectangle);
//
//        printPerimeter(square);
//        printPerimeter(rectangle);
//
//        printArea(triangle);
//        printPerimeter(triangle);
//
//        printNumOfSides(square);
//
//        Candidate c = new Candidate(1,"name","abc@cd.com","dep");
//        c.setMyShape(square);
//        c.setMyShape(new Square(3));
//        System.out.println(c.getMyShape().toString());

//        CreditCardPayment c = new CreditCardPayment();
//
//        System.out.println(new CreditCardPayment().processPayment(3000.0D));
//
//        CryptoPayment cy = new CryptoPayment();
//
//        System.out.println(new CryptoPayment().processPayment(220.D));
//
//        UPIPayment upi = new UPIPayment();
//
//        System.out.println(new UPIPayment().processPayment(550.0D));
//
//        Person p1 = new Person();
//        p1.setName("Madhan");
//        p1.setPreferredGateway(c);
//
//        p1.makePayment(200.0D);
//
//        Person p2 = new Person();
//        p2.setName("Vimal");
//        p2.setPreferredGateway(cy);
//
//        p2.makePayment(500.0D);
//
//        Person p3 = new Person();
//        p3.setName("Kanna");
//        p3.setPreferredGateway(upi);
//
//        p3.makePayment(250.0D);


        Screen1 screen101 = new Screen1();
        screen101.setTicketNumber(501);
        System.out.println(screen101.bookTicket());
        screen101.setTicketNumber(3);
        System.out.println(screen101.bookTicket());
        screen101.setTicketNumber(5);
        System.out.println(screen101.bookTicket());

        Screen2 screen201 = new Screen2();
        screen201.setTicketNumber(1);
        System.out.println(screen201.bookTicket());

        Screen3 screen301 = new Screen3();
        screen301.setTicketNumber(1);
        System.out.println(screen301.bookTicket());
        screen301.setTicketNumber(30);
        System.out.println(screen301.bookTicket());
    }

//    public static void printArea(Rectangle rectangle) {
//        System.out.println("Area : " + rectangle.area());
//    }
//
//    public static void printArea(Square square) {
//        System.out.println("Area : "+ square.area());


//    }


//
//    public static void printArea(Shape s){
//        System.out.println("Area is "+s.area());
//        s.printClassName();
//    }
//
//    public static void printPerimeter(Shape s){
//        System.out.println("Perimeter is "+s.perimeter());
//    }
//
//    private static void printNumOfSides(Shape s){
//        if (s instanceof Square ){
//            Square sq = (Square) s;
//            System.out.println(sq.getDescription());
//        } else if (s instanceof Rectangle) {
//            System.out.println(4);
//        } else if (s instanceof Triangle) {
//            System.out.println(3);
//        }
//
//    }

//    private static void printTeacherName(Subject s){
//        System.out.println(s.getTeacher().getName());
//    }
}
