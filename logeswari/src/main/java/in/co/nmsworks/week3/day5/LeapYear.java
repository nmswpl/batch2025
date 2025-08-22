package in.co.nmsworks.week3.day5;

public class LeapYear {
    public static void main(String[] args) {
        printLeap();

    }
      public static void printLeap(){
        int num=2020;
        if((num%400) ==0){
            if((num%100) ==0){
                System.out.println("invalid must divided in 4");

            }else {
                if ((num%4) ==0) {
                    System.out.println("it is a leap year");
                }else {
                    System.out.println("it is not a leap year");
                }
            }
        }
    }
}
