/*Write a program to Find Largest Among Three numbers using
if..else statement*/
package in.co.nmsworks.week1.day2;

public class Largestnumber {
    public static void main(String[] args) {
        lArgestNumber(1,0,0);
    }
    public static void lArgestNumber(int number1, int number2, int number3){
        if( number1 > number2 && number1 > number3  ){

                System.out.println("The "+number1+"is the greatest number");
        }

        if(number2 > number3 && number2 > number1){

                System.out.println("The "+number2+"is the greatest number");
        }

        else{

            System.out.println("The "+number3+"is the greatest number");
        }
    }
}
