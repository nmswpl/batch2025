package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day3.*;
import in.co.nmsworks.week2.day4.Adder;
import in.co.nmsworks.week2.day4.Computable;
import in.co.nmsworks.week2.day4.Divider;
import in.co.nmsworks.week2.day4.Multiplier;


public class Runner {

    public static void main(String[] args) {

        Adder add = new Adder();
        Calculator.performCalculation(5 , 4 , add);


        Multiplier mul = new Multiplier();
        Calculator.performCalculation(5 , 4, mul);


        Divider div = new Divider();
        Calculator.performCalculation(5 , 4, div );




   }

}
class Calculator{
    public static void performCalculation(int a , int b , Computable c){
        c.compute(a, b);
    }
}










/* Rectangle rectangle = new Rectangle(3, 4);
     System.out.println("Perimeter of Rectangle: " +rectangle.perimeter());
    System.out.println("Area of Rectangle: "+ rectangle.area());
    rectangle.printClassName();

    Square square = new Square(6);
    System.out.println("Perimeter of Square: " + square.area());
    System.out.println("Area of Square: "+square.perimeter());
    square.printClassName();

    Triangle triangle = new Triangle();
    triangle.printClassName();

    Candidate c = new Candidate(1,"name" , "abc@cde.com" , "dept");
    c.setMyShape(square);
    c.setMyShape(new Square(3));
    System.out.println(c.getMyShape());

    printArea(rectangle);
    printArea(triangle);
    printNoOfSides(square);


/*
public static void printArea(Rectangle rectangle) {
    System.out.println("Rectangle Area : " + rectangle.area());
}

public static void printArea(Square square) {
    System.out.println("Square Area: " + square.area());

}

public  static void printArea(Shape s){
    System.out.println("Area is :" +" " + s.area() );
    s.printClassName();
}
public static void printPerimeter(Shape s){
    System.out.println("Perimeter is : "+ " " + s.perimeter());
}
public static void printNoOfSides(Shape s){
    if (s instanceof Square) {
        Square sq = (Square)s;
        sq.getDescription();
    }
    else if(s instanceof Rectangle){
        System.out.println("four");
    }
    else if(s instanceof Triangle){
        System.out.println("three");
    }
    else{
        System.out.println("Others ");
    }
  */








/*  CreditCardPayment cp = new CreditCardPayment();
        cp.processPayment(1000.00);

        UpiPayment up =  new UpiPayment();
        up.processPayment(2000.00);

        CryptoPayment cp2 = new CryptoPayment();
        cp2.processPayment(3000.00);

        System.out.println();

        Person p1 = new Person("viji" , cp);
        p1.makePayment(1000.00);

        Person p2 = new Person("Yamini" , up);
        p2.makePayment(2000.00);

        Person p3 = new Person("Neha" , cp2);
        p3.makePayment(3000.00);

    }*/
























/* Teacher teacher1 = new Teacher(1,"Sanjeev");
Teacher teacher2 = new Teacher(2,"Rajesh");
        System.out.println(teacher1);
        System.out.println(teacher2);

Subject maths = new Subject();
        maths.setCode("MA101");
        maths.setName("Maths");
        maths.setTeacher(teacher1);
        System.out.println(maths);

Subject science = new Subject();
        science.setCode("SC101");
        science.setName("Science");
        science.setTeacher(teacher2);
        System.out.println(science);

printTeacherName(science);
    }
public static void printTeacherName(Subject sub){
    System.out.println(sub.getTeacher().getName());
}
*/
