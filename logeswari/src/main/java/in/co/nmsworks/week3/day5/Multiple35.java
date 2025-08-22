package in.co.nmsworks.week3.day5;

public class Multiple35 {
    public static void main(String[] args) {
        int nun=3;
        for (int i=0;i<=100;i++) {
            if((i*3)%3==0){
                System.out.println("Fizz");
                System.out.println(i);
            } else if ((i*5)%5==0) {
                System.out.println("Buzz");
            } else if (((i*3)%3==0)&&((i*5)%5==0)) {
                
            }
            System.out.println("FizzBuzz");
        }
    }
}
