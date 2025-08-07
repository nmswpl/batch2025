package in.co.nmsworks.week1.day2;

// Write a program to write Largest among three numbers using if..else statement

public class LargestThree {

    static void printLargest ( int num1, int num2, int num3){

        if((num1 > num2) && (num1 > num3)) {
            System.out.println("Largest of " + num1 + " " + num2 + " " + num3 + " is : " + num1);
        }
        else if(num2 > num3){
            System.out.println("Largest of " + num1 + " " + num2 + " " + num3 + " is : " + num2);
        }
        else{
            System.out.println("Largest of " + num1 + " " + num2 + " " + num3 + " is : " + num3);
        }
    }

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 30;
        int num3 = 10;

        printLargest(num1, num2, num3);
    }

}
