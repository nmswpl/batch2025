package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day3.Rectangle;
import in.co.nmsworks.week2.day3.Shape;
import in.co.nmsworks.week2.day3.Square;
import in.co.nmsworks.week2.day3.Triangle;

public class Runner {
    private static int age;
    final float pi=3.14f;
    public void test1(){
        final String NAME = "Tharun";
        Double d = Double.valueOf(1.23);
        double d1 = d;
    }

    public static void printTeacher(Subject subject){
        System.out.println(subject.getTeacher().getName());
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3,4);
//        System.out.println("Perimeter of Rectangle : " + r1.perimeter());
//        System.out.println("Area of Square : " + r1.area());

        Square s1 = new Square(6);
//        System.out.println("Perimeter of Square : " + s1.perimeter());
//        System.out.println("Area of Square : " + s1.area());

        Triangle t1 = new Triangle(4,5);

        System.out.println("--------------------");

        printPerimeter(s1);

        printPerimeter(r1);

        printPerimeter(t1);

        printArea(s1);

        printArea(r1);

        printArea(t1);

        System.out.println("--------------------");

        printNUmberOfSide(s1);


    }
//
//    private static void printArea(Rectangle r1) {
//        System.out.println("Area of Rectangle : " + r1.area());
//    }
//
//    private static void printArea(Square s1) {
//        System.out.println("Area of Square : " + s1.area());
//    }

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


}
