package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.Candidate;
import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day3.Rectangle;
import in.co.nmsworks.week2.day3.Shape;
import in.co.nmsworks.week2.day3.Square;
import in.co.nmsworks.week2.day3.Triangle;
import in.co.nmsworks.week2.day3.multiplex.Screen1;
import in.co.nmsworks.week2.day3.multiplex.Screen2;
import in.co.nmsworks.week2.day3.multiplex.Screen3;
import in.co.nmsworks.week2.day3.payment.CreditCardPayment;
import in.co.nmsworks.week2.day3.payment.CryptoPayment;
import in.co.nmsworks.week2.day3.payment.Person;
import in.co.nmsworks.week2.day3.payment.UPIPayment;

public class Runner {
    private static int age;
    final float pi=3.14f;
    public void test1(){
        final String NAME = "Tharun";
        Double d = Double.valueOf(1.23);
        double d1 = d;
    }


    public static void printArea(Shape s){
        System.out.println("Area : " + s.area());
        s.printClassName();
    }

    public static void printPerimeter(Shape s){
        System.out.println("Perimeter : " + s.area());

    }

    public static void printNUmberOfSide(Shape s){
        if (s instanceof Square ){
            Square sq = (Square) s;
            sq.getDescription();
            System.out.println(sq.getDescription());
            System.out.println(4);
        }
        else if (s instanceof Rectangle) {
            System.out.println(4);

        }
        else if (s instanceof Triangle) {
            System.out.println(3);
        }
    }


    public static void printTeacher(Subject subject){
        System.out.println(subject.getTeacher().getName());
    }

    public static void main(String[] args) {

//        Rectangle r1 = new Rectangle(3,4);
////        System.out.println("Perimeter of Rectangle : " + r1.perimeter());
////        System.out.println("Area of Square : " + r1.area());
//
//        Square s1 = new Square(6);
////        System.out.println("Perimeter of Square : " + s1.perimeter());
////        System.out.println("Area of Square : " + s1.area());
//
//        Triangle t1 = new Triangle(4,5);
//
//        System.out.println("--------------------");
//
//        printPerimeter(s1);
//
//        printPerimeter(r1);
//
//        printPerimeter(t1);
//
//        printArea(s1);
//
//        printArea(r1);
//
//        printArea(t1);
//
//        System.out.println("--------------------");
//
//        printNUmberOfSide(s1);
//
//        Candidate c = new Candidate(1,"name","abc@gmail.com","Dep");
//        c.setMyShape(s1);
//        c.setMyShape(new Square(3));
//        System.out.println(c.getMyShape());
//        System.out.println(c.getMyShape().area());
//

        CreditCardPayment creditCard = new CreditCardPayment();
//        creditCard.processPayment(200.1);

        UPIPayment upi = new UPIPayment();
//        upi.processPayment(190.3);

        CryptoPayment crypto = new CryptoPayment();
//        crypto.processPayment(150.5);

        Person p1 = new Person("p1",creditCard);
        p1.makePayment(10);

        Person p2 = new Person("p2",upi);
        p2.makePayment(20);

        Person p3 = new Person("p3", new CryptoPayment());
        p3.makePayment(30);

        System.out.println("--------------------------------");
        Screen1 s1 = new Screen1();
        s1.checkAvailability(8);
        s1.bookTicket(4);
        s1.bookTicket(3);
        s1.checkAvailability(7);
        s1.bookTicket(8);
        s1.checkAvailability(2);

        System.out.println("---------------------------------");

        Screen2 s2 = new Screen2();
        s2.checkAvailability(8);
        s2.bookTicket(4);
        s2.bookTicket(6);
        s2.bookTicket(8);
        s2.checkAvailability(2);

        System.out.println("------------------------------------");
        Screen3 s31 = new Screen3();
        s31.checkAvailability(8);
        s31.bookTicket(4);

        System.out.println("--------------------------------");
        Screen3 s32 = new Screen3();
        s32.checkAvailability(4);
        s32.bookTicket(4);
        s32.bookTicket(8);
        s32.checkAvailability(2);


    }

}
