package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.Candidate;
import in.co.nmsworks.week2.day3.Rectangle;
import in.co.nmsworks.week2.day3.Shape;
import in.co.nmsworks.week2.day3.Square;
import in.co.nmsworks.week2.day3.Triangle;

import javax.crypto.spec.PSource;

public class Runner
{
    public static void main(String[] args)
    {
/*
        Candidate c21 = new Candidate(21, "Arunkumar M","gajendrans@nmsworks.co.in","QA");
        Candidate c22 = new Candidate(22, "Vasanth S","gajendrans@nmsworks.co.in","Dev");
        Candidate c23 = new Candidate(23, "Nandhakumar M","gajendrans@nmsworks.co.in","QA");
        Candidate c24 = new Candidate(24, "Ramya S","gajendrans@nmsworks.co.in","Dev");
        Candidate c25 = new Candidate(25, "Neha S","gajendrans@nmsworks.co.in","QA");
        Candidate c26 = new Candidate(26, "Sabarishwaran S","gajendrans@nmsworks.co.in","Dev");
        Candidate c27 = new Candidate(27, "Elakkiya S","gajendrans@nmsworks.co.in","QA");
        Candidate c28 = new Candidate(28, "Ellammal","gajendrans@nmsworks.co.in","Dev");
        Candidate c29 = new Candidate(29, "Kavibharathi S","gajendrans@nmsworks.co.in","QA");
        Candidate c30 = new Candidate(30, "Kabilan R","gajendrans@nmsworks.co.in","Dev");
        Candidate c31 = new Candidate(31, "Velmurugan S","gajendrans@nmsworks.co.in","QA");
        Candidate c32 = new Candidate(32, "Amarnath M","gajendrans@nmsworks.co.in","Dev");
        Candidate c33 = new Candidate(33, "Vinothkumar E","gajendrans@nmsworks.co.in","QA");
        Candidate c34 = new Candidate(34, "Kanagavel N","gajendrans@nmsworks.co.in","Dev");
*/


        Rectangle r1 = new Rectangle(3, 4);

        int r1Perimeter = r1.perimeter();
        System.out.println(r1Perimeter);
        int r1Area = r1.area();
        System.out.println(r1Area);
        printArea(r1);

        Square s1 = new Square(6);

        int s1Perimeter = s1.perimeter();
        System.out.println(s1Perimeter);
        int s1Area = s1.area();
        System.out.println(s1Area);
        printArea(s1);


        Triangle t1 = new Triangle();
        printArea(t1);

        printNoOfSides(s1);

        Candidate c = new Candidate(1, "Name", "abc@cd.com", "Dep");
        c.setMyShape(s1);
        c.setMyShape(new Square(3));
        System.out.println(c.getMyShape().perimeter());

    }

/*    public static void printArea(Square s1)
    {
        System.out.println("Area is " + s1.area());
    }

    public static void printArea(Rectangle r1)
    {
        System.out.println("Area is " + r1.area());
    }
    */

    public static void printArea(Shape s)
    {
        System.out.println("Area is " + s.area());
        s.printClassName();
    }

    public static void printNoOfSides(Shape s)
    {
        if(s instanceof Square)
        {
            Square sq = (Square) s;
            System.out.println(sq.getDescription());
            System.out.println(4);
        }
        else if(s instanceof Rectangle)
        {
            System.out.println(4);
        }
        else if (s instanceof Triangle)
        {
            System.out.println(3);
        }
    }

}
