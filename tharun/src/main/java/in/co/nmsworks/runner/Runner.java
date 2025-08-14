package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.Candidate;
import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day3.Rectangle;
import in.co.nmsworks.week2.day3.Shape;
import in.co.nmsworks.week2.day3.Square;
import in.co.nmsworks.week2.day3.Triangle;
import in.co.nmsworks.week2.day3.multiplex.Screen1;
import in.co.nmsworks.week2.day3.multiplex.Screen2;
import in.co.nmsworks.week2.day3.multiplex.Screen3;
import in.co.nmsworks.week2.day3.payment.CreditCardPayment;
import in.co.nmsworks.week2.day3.payment.CryptoPayment;
import in.co.nmsworks.week2.day3.payment.Person;
import in.co.nmsworks.week2.day3.payment.UPIPayment;
import in.co.nmsworks.week2.day4.Adder;
import in.co.nmsworks.week2.day4.Calculator;
import in.co.nmsworks.week2.day4.Divider;
import in.co.nmsworks.week2.day4.Multiplier;
import in.co.nmsworks.week2.day4.sequence.SequenceGenerator;
import in.co.nmsworks.week2.day4.sequence.SimpleAdder;
import in.co.nmsworks.week2.day4.sequence.SimpleMultiplier;

public class Runner {
    private static int age;
    final float pi=3.14f;
    public void test1(){
        final String NAME = "Tharun";
        Double d = Double.valueOf(1.23);
        double d1 = d;
    }


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


    public static void printTeacher(Subject subject){
        System.out.println(subject.getTeacher().getName());
    }

    public static void main(String[] args) {

        Calculator calculate = new Calculator();
        calculate.performCalculation(2,3,new Adder());
        calculate.performCalculation(2,3,new Multiplier());
        calculate.performCalculation(5,5,new Divider());

        SequenceGenerator sequence = new SequenceGenerator();
        sequence.printSequence(new SimpleAdder(), 4);
        sequence.printSequence(new SimpleMultiplier(),6);


    }

}
