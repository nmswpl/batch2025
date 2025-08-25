/*package in.co.nmsworks.week2.day2;

import in.co.nmsworks.week1.day2.string.Candidate;
import in.co.nmsworks.week2.day3.*;

public class Runner {

    public static void main(String[] args) {

        /*Car c1 = new Car();
        c1.setModel("maruthi");
        c1.setYear(1990);
        c1.setNoOfDoors(5);
        System.out.println(c1.display());

        Bike b1 = new Bike();
        b1.setModel("bajaj");
        b1.sethBT(Bike.HandleBarType.LOWER);
        b1.setYear(1999);
        System.out.println(b1.display());

         */



        /*Contractor con1 = new Contractor();
        con1.setHrs(8);
        con1.setBasePay(5);
        //System.out.println(con1.PrintCalculatesSalary());

        PartTime p1 = new PartTime();
        p1.setDays(30);
        p1.setHrs(6);
        p1.setBasePay(10);
        System.out.println(p1.PrintCalculatesSalary());
            */


        /*Rectangle rec = new Rectangle(3,4);
        System.out.println("rec area :" +rec.area());
        System.out.println("rec perimeter :" +rec.perimeter());

        Square sq = new Square(6);
        System.out.println("sq area " +sq.area());
        System.out.println("sq perimeter " +sq.perimeter());

        Triangle tri = new Triangle(4,5);
        System.out.println("Tri area :" + tri.area());
        System.out.println("Tri perimeter :" +tri.perimeter());

        printArea(sq);
        printPerimeter(sq);
        printArea(rec);
        printnumberOfSide(sq);


        Candidate c =new Candidate(1,"name","abc@cd.com", "dep");
        c.setMyShape(sq);
        c.setMyShape(new Square(3));
        System.out.println(c.getMyShape());


        CreditCardPayment cred = new CreditCardPayment();
        cred.processPayment(30);


        UpiPayment upi = new UpiPayment();
        upi.processPayment(20);

        CryptoPayment crypto = new CryptoPayment();
        crypto.processPayment(10);

        System.out.println(" ");



        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p1.setPGW(cred);
        p1.makePayment(15.0d);
        p2.setPGW(upi);
        p2.makePayment(50.0d);
        p3.setPGW(crypto);
        p3.makePayment(35.0d);







        Screen screen1 = new Screen(10);
        Screen screen2 = new Screen(70);
        Screen screen3 = new Screen(10);

        printTicketDetails(screen1 , 12);






    }

    public static boolean printTicketDetails(Screen screen , int noOfTickect){
        if (screen.checkAvailability(noOfTickect)){
            System.out.println("Ticket Available");


        }
        else{
            System.out.println("Ticket Not Available");
        }
    }






    /*
    public static void printArea(Square sq){
        System.out.println("sq area:" + sq.area());
    }

    public static void printArea(Rectangle rec){
        System.out.println("rec area:" + rec.area());
    }
     */


    /*public static void printArea(Shape s){
        //System.out.println("area is" + s.area());
        s.printClassName();
        //System.out.println("perimeter" + s.perimeter());
    }

    public static void printPerimeter(Shape p){
        System.out.println("perimeter is :" + p.perimeter());
    }

    public static void printnumberOfSide(Shape s){

        if (s instanceof Square)
        {
            Square sq = (Square) s;
            sq.stringGetDescription();
            System.out.println("4");
        }
        else if (s instanceof Rectangle)
        {
            System.out.println("4");
        }
        else if (s instanceof Triangle)
        {
            System.out.println("3");
        }
    }

     */



