package in.co.nmsworks.runner;

import in.co.nmsworks.week1.Cat;
import in.co.nmsworks.week2.day2.Animal;
import in.co.nmsworks.week2.day2.Dog;
import in.co.nmsworks.week2.day2.Horse;
import in.co.nmsworks.week2.day3.*;
import in.co.nmsworks.week2.day4.*;

public class Runner {
    public static void main(String[] args) {

        /*Employee fullTime = new FullTimeEmployee();
        Employee partTime = new PartTimeEmployee();
        Employee contractorEmp = new Contractor();

        fullTime.calculateSalary();
        partTime.calculateSalary();
        contractorEmp.calculateSalary();*/

//     Dog a = new Dog();
//     Cat c = new Cat();
//        Horse h = new Horse();
//     System.out.println(a.makeSound());
//     System.out.println(c.makeSound());
////        System.out.println(h.makeSound());
//
//        System.out.println();

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

//        CreditCardPayment cc = new CreditCardPayment();
//        UpiPayment upi = new UpiPayment();
//        CryptoPayment crypt = new CryptoPayment();
//
//        cc.processPayment(3000d);
//        upi.processPayment(4000d);
//        crypt.processPayment(1000d);
//
//        System.out.println();
//
//        Person p1 = new Person();
//        Person p2 = new Person();
//        Person p3 = new Person();
//
//        p1.makePayment(10000d, cc);
//        p2.makePayment(29000d, upi);
//        p3.makePayment(300000d, crypt);
//        System.out.println();
//
//        Screen1 s1 = new Screen1();
//        Screen2 s2 = new Screen2();
//        Screen3 s3 = new Screen3();
//
//        s1.bookTicket(1);
//        s1.bookTicket(2);
//        s1.bookTicket(1);
//        System.out.println(s1.checkAvailability(247));
//
//        System.out.println();
//
//        s2.bookTicket(1);
//        System.out.println(s2.checkAvailability(5));
//
//        System.out.println();
//
//        s3.bookTicket(2);
//        System.out.println(s3.checkAvailability(249));
//
//        Test te1 = new Test();
//        te1.printName("abc");

//        Employee emp = new Employee("Arsath", 23000d);
//        Employee man = new Manager("John", 60000d, 9000d);
//        System.out.println(emp.getName() + " " + emp.annualSalary());
//        System.out.println(man.getName() + " " + man.annualSalary());

//        Report sales = new SalesReport();
//        Report inventory = new InventoryReport();
//
//        System.out.println(sales.generate());
//
//        System.out.println();
//
//        System.out.println(inventory.generate());

        Movie movie1 = new Movie("Enthiran",2010,"Sci Fi");
        Movie movie2 = new Movie("Kabali",2016,"Action");
        Movie movie3 = new Movie("Superstar",2002,"Drama");
        Movie movie4 = new Movie("Baasha",1995,"Action");
        Movie movie5 = new Movie("Muthu",1995,"Drama");
        Movie movie6 = new Movie("Sivaji: The Boss",2007,"Action");
        Movie movie7 = new Movie("Petta",2019,"Action");
        Movie movie8 = new Movie("Thalapathy",1991,"Drama");
        Movie movie9 = new Movie("Shivaji",2007,"Action");
        Movie movie10 = new Movie("Kaala",2018,"Drama");

        Movie[] movies = new Movie[ ] {movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie10};

        System.out.println("Length of movies array: " + movies.length);
        System.out.println("First movie: " + movies[0].getName() + " " + movies[0].getYearOfRelease() + "\t" + "Last movie: " + movies[movies.length-1].getName() + " " + movies[movies.length-1].getYearOfRelease());

        for(int i=0;i<=movies.length-1;i++){
            if(movies[i].getYearOfRelease()<2000){
                System.out.println(movies[i].getName());
            }
        }

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
