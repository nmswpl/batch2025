package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day3.Rectangle;
import in.co.nmsworks.week2.day3.Shape;
import in.co.nmsworks.week2.day3.Square;
import in.co.nmsworks.week2.day3.Triangle;

public class Runner {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3,4);
//        System.out.println( "Perimeter: "+r1.perimeter());
//        System.out.println("area: "+r1.area());

        System.out.println();

        Square s1 = new Square(6);
//        System.out.println("Perimeter: "+s1.perimeter());
//        System.out.println("area: "+s1.area());
        printArea(s1);
        printArea(r1);


        Triangle t1 = new Triangle(2,3);
//        System.out.println(t1.perimeter());
//        System.out.println(t1.area());
        printArea(t1);
        printNoOfSidea(s1);
        printNoOfSidea(r1);
        printNoOfSidea(t1);

//        Teacher teacher1=new Teacher(1,"mathi");
//        Teacher teacher2=new Teacher(2,"madan");
//
//        System.out.println(teacher1);
//        System.out.println(teacher2);
//
//        Subject maths=new Subject();
//        maths.setCode("MA101");
//        maths.setName("Maths");
//        maths.setTeacher(teacher1);
//        System.out.println(maths);
//
//        Subject science=new Subject();
//        science.setCode("SC101");
//        science.setName("science");
//        science.setTeacher(teacher2);
//        System.out.println(science);
//
//        System.out.println(science.getName());
//        printTeacherName(science);
//        Employee e1=new Employee();
//        e1.calculateSalaray();
//        Contractor c1=new Contractor(3,15);
//        c1.calculateSalaray();
//        System.out.println( c1.getHours());
//        FullTimeEmployee f1=new FullTimeEmployee();
//        f1.calculateSalaray();
//        PartTimeEmployee p1=new PartTimeEmployee();
//        p1.calculateSalaray();

//        Animal a = new Animal();

//        Dog d1 = new Dog();

//       bike b1 = new Bike();







    }

    public static void printArea(Shape s)
    {
//        System.out.println("area is: "+s.area());
//        System.out.println("Perimeter is: "+s.perimeter());

        s.printShape();
    }

    public static void printNoOfSidea(Shape s)
    {
        if(s instanceof Square)
        {
            System.out.println(4);
            Square sq= (Square) s;
//            Integer i = (Integer) s;
        }
        else if (s instanceof Rectangle)
        {
            System.out.println(4);
        }
        else if (s instanceof Triangle)
        {
            System.out.println(3);
        } else
        {
            System.out.println(0);
        }

    }
//    public  static void printArea(Rectangle r1) {
//        System.out.println("Area of Rectangle: "+r1.area());
//    }
//
//    public static void printArea(Square s1) {
//        System.out.println("Area of square: "+s1.area());
//    }

//    public  static void printTeacherName(Subject subject) {
//        System.out.println(subject.getTeacher().getName());
//    }

}
