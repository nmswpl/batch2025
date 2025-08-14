package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.Candidate;
import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;
import in.co.nmsworks.week2.day1.day2.EmployeeOver;
import in.co.nmsworks.week2.day3.*;

public class Runner {

            /*
    {
        Teacher t1=new Teacher(1,"kabil");
        Teacher t2=new Teacher(2,"english");

        System.out.println(t1);
        System.out.println(t2);

        Subject maths = new Subject();
        maths.setCode("mam101");
        maths.setName("maths");

        maths.setTeacher(t2);
        System.out.println(t2);
        System.out.println(maths);

        print(maths);


    }
    public  static void  print(Subject subject)
    {
        Teacher t1 = subject.getTeacher();
        System.out.println(t1);


    }
*/

/*

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        System.out.println("Rectangle Peremeter : " +r1.peremeter());
        System.out.println("Rectangle Area : "+r1.area());

        Triangle t1 = new Triangle(2, 3);
        System.out.println("Triangle Premeter : "+t1.peremeter());
        System.out.println("Triangle Area : "+t1.area());

        Square s1 = new Square(4);
        System.out.println("Square Peremeter :" +r1.peremeter());


        printArea(s1);
        printArea(r1);

        printPeremeter(s1);
        printPeremeter(t1);
        printNoOsSides(s1);

        Candidate c = new Candidate(1,"name","abc@dc.com","dep");
        c.setMyShape(s1);
        c.setMyShape(new Square(3));
        c.getMyShape();


    }
/*
    public static void printArea(Square s1) {
        System.out.println("square" + s1.peremeter());
        System.out.println("Area " + s1.area());

    }
    public  static  void  printArea(Rectangle r1)
    {
        System.out.println();
    }

}


    public static void printArea(Shape s) {
        System.out.println("area is " + s.area());
        //System.out.println("Peremeters " + s.peremeter());
        s.printClassName();


    }
    public static void printNoOsSides(Shape s)
    {
        if (s instanceof Square) {
           Square sq = (Square) s;
            //Integer sq = (Integer) s;
        }
        else if (s instanceof Rectangle) {
            System.out.println("Print 4 side");
        }
        else if (s instanceof  Triangle)
        {
            System.out.println("print 3 side");
        }
    }


    public  static  void  printPeremeter(Shape s)
    {

        System.out.println(s.peremeter());
        System.out.println(s.area());
    }
}

/*

    public static void main(String[] args) {
        EmployeeOver e1 = new Manager();
        e1.work();

    }
} c.setMyShape(s1);
        c.setMyShape(new Square(3));
        c.getMyShape();


     */

    public static void main(String[] args) {
        CreditPayment c = new CreditPayment();
        System.out.println("credit payment is :"+c.processPayment(10.0));
        CryptoPayment cr = new CryptoPayment();
        System.out.println("Crypto payment is :" +cr.processPayment(2));
        UPIPayment u = new UPIPayment();
        System.out.println("upi payment is :" +u.processPayment(4));

       Person p1 = new Person();
       Person p2 = new Person();
       Person p3 = new Person();

       p1.setProcessPayment(c);
       p1.setProcessPayment(cr);
       p1.setProcessPayment(u);



       // System.out.println(p2.getProcessPayment(c));




    }
    }
