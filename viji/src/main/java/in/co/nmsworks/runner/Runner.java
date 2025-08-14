package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day3.Rectangle;
import in.co.nmsworks.week2.day3.Shape;
import in.co.nmsworks.week2.day3.Square;
import in.co.nmsworks.week2.day3.Triangle;


public class Runner {
    public static void main(String[] args) {

    Rectangle rectangle = new Rectangle(3, 4);
     System.out.println("Perimeter of Rectangle: " +rectangle.perimeter());
    System.out.println("Area of Rectangle: "+ rectangle.area());
    rectangle.printClassName();

    Square square = new Square(6);
    System.out.println("Perimeter of Square: " +square.area());
    System.out.println("Area of Square: "+square.perimeter());
    square.printClassName();

    Triangle triangle = new Triangle();
    triangle.printClassName();

    printArea(square);
    printArea(rectangle);
    printArea(triangle);
    printNoOfSides(square);

    }

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
    }
}























































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
