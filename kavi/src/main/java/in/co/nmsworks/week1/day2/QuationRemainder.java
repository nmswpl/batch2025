package in.co.nmsworks.week1.day2;

//1.Write a program to compute Quotient and Remainder in Java
public class QuationRemainder {
    public static void main(String[] args) {
        printQoutientRemainder();
    }

    public static void printQoutientRemainder(){
        int devide=13;
        int devisor=2;
        int quotient= devide/devisor;
        int remainder=devide%devisor;
        System.out.println("quotient"+quotient);
        System.out.println("remaindr"+remainder);
    }
}
