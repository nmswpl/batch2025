package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.string.First.Candidate;
import in.co.nmsworks.week2.day3.*;

public class Runner {
    static private int age;
    final float PI = 3.14f;

    public void test() {
        Double d = Double.valueOf(1.23);
        double d1 = d;


        final String name = "logeswari n ";

        age = age + 1;
        System.out.println("done");
    }

    public static void main(String[] args) {
//        Candidate c1 = new Candidate();
//        Sample s1 = new Sample();
//        age++;
        Rectangle r1=new Rectangle(3,4);
        System.out.println("Rectangle"+r1.perimeter());
        System.out.println("Rectangle"+r1.area());

        Square s1=new Square(4);
        System.out.println("check desc : "+s1.getDescription());

        System.out.println("square of area : "+s1.area());
        System.out.println("square : "+s1.perimeter());

        Triangle t1=new Triangle(10,9);
        System.out.println();
        printArea(r1);
        System.out.println("---");
        printArea(s1);
        printArea(t1);
        printNoOfSide(t1);
        Candidate c1=new Candidate(1,"acbs","ab@mail.com","developer");
        c1.setMyShape(s1);
        System.out.println("from candidate : "+c1.getMyShape());
        c1.setMyShape(new Square(3));
        System.out.println("getShape : "+c1.getMyShape().perimeter());
        System.out.println("getShape : "+c1.getMyShape().area());
        System.out.println("getShape to string : "+c1.toString());

        CredicardPayment credicardPayment=new CredicardPayment();
        System.out.println("paid through the Credicard");
        credicardPayment.processPayment(300);
        printAmountDetails(credicardPayment);

        UPIPayment upiPayment=new UPIPayment();
        upiPayment.processPayment(4000);
        System.out.println("paid through the upi");
        printAmountDetails(upiPayment);

        CriptoPament criptoPament=new CriptoPament();
        criptoPament.processPayment(3000);
        System.out.println("paid cripto through the Credicard");
        printAmountDetails(criptoPament);

        Person person1=new Person("logeswari",upiPayment);
        System.out.println(person1.name+" name  "+person1.makePament(200)+criptoPament.processPayment(9000));
        System.out.println(person1);


    }
    public static void printAmountDetails(PaymentGateWay paymentGateWay){
        System.out.println(paymentGateWay.processPayment(200));
    }



//
//    public static void printArea( Square s1){
//        System.out.println("squarq of area : "+ s1.area());
//    }
//
//    public static void printArea( Rectangle r1){
//        System.out.println("rectangle of area : "+ r1.area());
//    }
    public static void printArea(Shape s){
        System.out.println("Area is from Shape"+s.area());
        System.out.println("Area is from Shape"+s.perimeter());
        s.printClassName();
    }
    public static void printNoOfSide(Shape s){
        if(s instanceof Square ){
            Square sq= (Square) (Square) s;
            sq.getDescription();
//            Integer square=(Square) (Square) s;
            System.out.println("4 side");
        } else if (s instanceof Rectangle) {
            System.out.println("r 4side");
        } else if (s instanceof Triangle){
            System.out.println("3side");
        }
    }

}
