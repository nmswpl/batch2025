package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.Candidate;
import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day3.*;

public class Runner {

    public static void printTeacher(Subject science){
        System.out.println(science.getTeacher().getName());
    }

    public static void main(String[] args) {

//        Teacher t1 = new Teacher(1,"qwerty");
//        Teacher t2 = new Teacher(2,"hello");
//
//        System.out.println(t1);
//        System.out.println(t2);
//
//        Subject maths = new Subject();
//        maths.setCode("MA101");
//        maths.setName("Maths");
//        maths.setTeacher(t1);
//
//        System.out.println(maths);
//
//        Subject science = new Subject();
//        science.setCode("SE101");
//        science.setName("Science");
//        science.setTeacher(t2);
//        System.out.println(science);
//        printTeacher(science);
//        //====================================
//
//
//        FullTime fullTime = new FullTime(10,8,30);
//        PartTime partTime = new PartTime(5,4,30);
//        ContractTime contractTime = new ContractTime(3,7);
//
//        System.out.println("===============================");
//        fullTime.Calculatesalary();
//        partTime.Calculatesalary();
//        contractTime.Calculatesalary();
//        System.out.println("===============================");
//
//
//        Dog dog=new Dog();
//        dog.makeSound();
//

        Reactangle r1 = new Reactangle(3,4);
        System.out.println(r1.perimeter());
        System.out.println(r1.area());
        System.out.println("-------------------");
        Square s1 = new Square(6);
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        System.out.println("-------------------");
        Triangle t1 = new Triangle(4,5);
        System.out.println(t1.perimeter());
        System.out.println(t1.area());
        System.out.println("-------------------");

        printArea(s1);
        printArea(r1);
        printArea(t1);
        printPerimeter(s1);
        printPerimeter(r1);
        printPerimeter(t1);

        printNoOfSide(s1);

        Candidate c = new Candidate(1,"name","abc@gmail.com","dep");
        c.setMyShape(s1);
        c.setMyShape(new Square(3));
        Shape sh =c.getMyShape();
        System.out.println("-----------------");
        System.out.println(c.getMyShape().toString());

        System.out.println("===========================");
        CreditCardPayment ccp = new CreditCardPayment();
        UpiPayment upi = new UpiPayment();
        CryptoPayment cp = new CryptoPayment();
        ccp.processPayment(30);
        upi.processPayment(40);
        cp.processPayment(20);
        System.out.println("====================");
        Person p1 =new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p1.setName("saran");
        p1.setPreferedGateway(new CreditCardPayment());
        p1.makePayment(300);
        p2.setName("saran");
        p2.setPreferedGateway(new UpiPayment());
        p2.makePayment(230);
        p3.setName("saran");
        p3.setPreferedGateway(new CryptoPayment());
        p3.makePayment(450);



        Screen s11 = new Screen(3);
        s11.setScreenName("Screen01");
        Screen s22 = new Screen(2);
        s22.setScreenName("Screen02");
        Screen s33 = new Screen(24);
        s33.setScreenName("Screen03");
        s33.printAndCheckAvailability();
        s33.bookTicket(13);
        s33.printAndCheckAvailability();




















    }

    //    public static void printArea(Reactangle r1) {
//        System.out.println("Reactangle area : "+ r1.area());
//    }
//
//    public static void printArea(Square s1) {
//        System.out.println("Square area : "+ s1.area());
//    }
    public static void printArea(Shape s) {
        System.out.println("Area : "+ s.area());
        s.printClassName();
    }
    private static void printPerimeter(Shape s) {
        System.out.println("Perimeter : "+ s.perimeter());
    }

    private static void printNoOfSide(Shape s) {
         if (s instanceof Square) {
             Square sq = (Square) s;
             sq.getDescription();

         }
         else if (s instanceof Reactangle) {
             System.out.println(4);
         }
         else if (s instanceof Triangle){
             System.out.println(3);
         }

    }

}
