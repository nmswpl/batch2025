package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day3.*;
import in.co.nmsworks.week2.day4.*;

public class Runner {
    public static void main(String[] args) {

        Adder a = new Adder();
        Multiplier m = new Multiplier();
        Divider d = new Divider();

        Calculator c = new Calculator();
        
        c.performCalculation(2,3,a);
        c.performCalculation(6,8,m);
        c.performCalculation(10,2,d);
        c.performCalculation(10,0,d);
        /*
        ScreenOne s1 = new ScreenOne(15);
        s1.checkAvailability();
        s1.bookTicket(3);
        s1.bookTicket(3);
        s1.checkAvailability();
        s1.bookTicket(3);
        s1.checkAvailability();
        ScreenTwo s2 = new ScreenTwo(10);
        s2.checkAvailability();
        s2.bookTicket(4);
        s2.checkAvailability();
        s2.bookTicket(5);
        s2.checkAvailability();
        ScreenThree s3 = new ScreenThree(10);
        s3.checkAvailability();
        s3.bookTicket(7);
        s3.checkAvailability();
        s3.bookTicket(5);
        s3.checkAvailability();
        CreditCard c = new CreditCard();
        c.processPayment(12);
        UPI u = new UPI();
        u.processPayment(15);
        Crypto cy = new Crypto();
        cy.processPayment(19);
        Person p1 = new Person("Hari",c);
        p1.makePayment(14);
        Person p2 = new Person("Ram", u);
        p2.makePayment(17);
        Person p3 = new Person("Gokul", cy);
        p3.makePayment(22);
        Rectangle r1 = new Rectangle(3,4);
        System.out.println("Perimeter of Rectangle: " + r1.perimeter());
        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Class Name: " );
        r1.printClassName();
        Square s1 = new Square(6);
        System.out.println("Area of Square: " + s1.area());
        System.out.println("Perimeter of Square: " + s1.perimeter());
        System.out.println("Class Name: " );
        s1.printClassName();
        CandidateArray c = new CandidateArray(1,"name","abc@cde.com","dp");
        c.setMyShape(s1);
        c.setMyShape(new Square(3));
        System.out.println(c.toString());
        Triangle t1 = new Triangle(4,6);
        System.out.println("Area of Triangle: " + t1.area());
        System.out.println("Perimeter of Triangle: " + t1.perimeter());
        System.out.println("Class Name: " );
        t1.printClassName();
        printArea(s1);
        printArea(r1);
        printPerimeter(s1);
        printPerimeter(r1);
        printSides(s1);
        printSides(t1);
        printSides(r1);
        Book English = new Book("English","Peter",2008,5);
        Book Maths = new Book("Maths","Eistein", 2012, 2);
        Book Social = new Book("Science", "Rutherford", 2000, 6);

        English.printDetails(English);
        Maths.printDetails(Maths);
        Social.printDetails(Social);

        English.checkOut();
        Maths.checkOut();
        Social.checkOut();

        Maths.checkOut();
        Maths.checkOut();
        */
    }

    /*
    public static void printArea(Rectangle r1) {
        System.out.println(r1.area());
    }

    public static void printArea(Square s1){
        System.out.println(s1.area());
    }*/

    public static void printArea(Shape s){
        System.out.println("Area is: " + s.area());
    }

    private static void printSides(Shape s){
        if (s instanceof Square){
            Square sq = (Square) s;
            sq.getDescription();
        }
        else if (s instanceof Rectangle) {
            System.out.println("Four");
        }
        else if (s instanceof Triangle){
            System.out.println("Three");
        }
    }
    public static void printPerimeter(Shape s){
        System.out.println("Perimeter is: " + s.perimeter());
    }

    /*final static float PI = 3.14f;
        private static int age;
        Teacher t1 = new Teacher( "TeacherOne",1);
        Teacher t2 = new Teacher("TeacherTwo",2);
        System.out.println(t1);
        System.out.println(t2);
        Subject Maths = new Subject();
        Maths.setCode("MA101");
        Maths.setName("Maths");
        Maths.setTeacher(t1);
        System.out.println(Maths);
        Subject Science = new Subject();
        Science.setCode("SC101");
        Science.setName("Science");
        Science.setTeacher(t2);
        System.out.println(Science);
        printSubjectName(Science);
        public static void printSubjectName(Subject subject){
        Teacher t1 = subject.getTeacher();
        System.out.println(t1.getName());
        Contractor con = new Contractor();
        con.setHrs(9);
        System.out.println("Contractor salary: " + con.getSalary());
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.setHrs(8);
        System.out.println("FTE salary: " + fte.getSalary());
        PartTimeEmployee pte = new PartTimeEmployee();
        pte.setHrs(5);
        System.out.println("PTE salary: " + pte.getSalary());
        Dog dog = new Dog();
        System.out.println(dog.makeSound());
        Car c1 = new Car();
        c1.setModel("c1");
        c1.setYearOfMake(2008);
        c1.setNoOfDoors(5);
        c1.display();
        Bike b1 = new Bike();
        b1.setH(Bike.Handlebar.RAISET);
        b1.setModel("b1");
        b1.setYearOfMake(2007);
        b1.display();

        CandidateArray c21 = new CandidateArray(21, "Arunkumar M","gajendrans@nmsworks.co.in","QA");
        CandidateArray c22 = new CandidateArray(22, "Vasanth S","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c23 = new CandidateArray(23, "Nandhakumar M","gajendrans@nmsworks.co.in","QA");
        CandidateArray c24 = new CandidateArray(24, "Ramya S","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c25 = new CandidateArray(25, "Neha S","gajendrans@nmsworks.co.in","QA");
        CandidateArray c26 = new CandidateArray(26, "Sabarishwaran S","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c27 = new CandidateArray(27, "Elakkiya S","gajendrans@nmsworks.co.in","QA");
        CandidateArray c28 = new CandidateArray(28, "Ellammal","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c29 = new CandidateArray(29, "Kavibharathi S","gajendrans@nmsworks.co.in","QA");
        CandidateArray c30 = new CandidateArray(30, "Kabilan R","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c31 = new CandidateArray(31, "Velmurugan S","gajendrans@nmsworks.co.in","QA");
        CandidateArray c32 = new CandidateArray(32, "Amarnath M","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c33 = new CandidateArray(33, "Vinothkumar E","gajendrans@nmsworks.co.in","QA");
        CandidateArray c34 = new CandidateArray(34, "Kanagavel N","gajendrans@nmsworks.co.in","Dev");
        CandidateArray candidates[] = new CandidateArray[]{c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32, c33, c34};
        System.out.println(candidates.length);
        for(int i = 0; i < candidates.length; i++){
            String str = candidates[i].getDept();
            if(str.equalsIgnoreCase("QA")){
                System.out.println(candidates[i].getName());
            }
        }
        for(CandidateArray c:candidates){
            String str = c.getDept();
            if(str.equalsIgnoreCase("QA")){
                System.out.println(c.getName());
            }
        }
    }*/
}