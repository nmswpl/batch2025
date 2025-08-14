package in.co.nmsworks.runner;

import in.co.nmsworks.week1.Cat;
import in.co.nmsworks.week2.day2.Animal;
import in.co.nmsworks.week2.day2.Dog;
import in.co.nmsworks.week2.day2.Horse;
import in.co.nmsworks.week2.day3.*;

public class Runner {
    public static void main(String[] args) {

        /*Employee fullTime = new FullTimeEmployee();
        Employee partTime = new PartTimeEmployee();
        Employee contractorEmp = new Contractor();

        fullTime.calculateSalary();
        partTime.calculateSalary();
        contractorEmp.calculateSalary();*/

     Dog a = new Dog();
     Cat c = new Cat();
        Horse h = new Horse();
     System.out.println(a.makeSound());
     System.out.println(c.makeSound());
//        System.out.println(h.makeSound());

        System.out.println();

//        Rectangle r1 = new Rectangle(3,4);
//        System.out.println("Area of Rectangle: " + r1.area());
//        System.out.println("Perimeter of Rectangle: " + r1.periMeter());
//
//        System.out.println();
//
//        Square s1 = new Square(6);
//        System.out.println("Area of Square: " + s1.area());
//        System.out.println("Perimeter of Square: " + s1.periMeter());
//
//        System.out.println();
//
//        Triangle t1 = new Triangle(5,4);

//        printArea(s1);
//        printArea(r1);
//        printArea(t1);

//        printPerimeter(r1);
//        printPerimeter(s1);
//        printPerimeter(t1);

//        printNofOfSides(s1);
//        printNofOfSides(r1);
//        printNofOfSides(t1);
//
//        Candidate c = new Candidate(1,"Name","abc","SWE");
//        c.setMyShape(s1);
//        c.setMyShape(new Square(3));
//        System.out.println(c.getMyShape().toString());

        CreditCardPayment cc = new CreditCardPayment();
        UpiPayment upi = new UpiPayment();
        CryptoPayment crypt = new CryptoPayment();

        cc.processPayment(3000d);
        upi.processPayment(4000d);
        crypt.processPayment(1000d);

        System.out.println();

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.makePayment(10000d, cc);
        p2.makePayment(29000d, upi);
        p3.makePayment(300000d, crypt);
        System.out.println();

        Screen1 s1 = new Screen1();
        Screen2 s2 = new Screen2();
        Screen3 s3 = new Screen3();

        s1.bookTicket(1);
        s1.bookTicket(2);
        s1.bookTicket(1);
        System.out.println(s1.checkAvailability(247));

        System.out.println();

        s2.bookTicket(1);
        System.out.println(s2.checkAvailability(5));

        System.out.println();

        s3.bookTicket(2);
        System.out.println(s3.checkAvailability(249));

        Test te1 = new Test();
        te1.printName("abc");


    }

//    private static void printArea(Square s1){
//        System.out.println(s.area());
//    }

//    private static void printArea(Rectangle r1){
//        System.out.println(r1.area());
//    }

//    public static void printArea(Shape s){
//        System.out.println("Area: " + s.area());
//        System.out.println();
//        s.printClassName();
//    }
//
//    public static void printPerimeter(Shape s){
//        System.out.println("Perimeter: " + s.periMeter());
//    }


}
