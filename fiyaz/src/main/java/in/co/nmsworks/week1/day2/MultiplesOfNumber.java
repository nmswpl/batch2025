package in.co.nmsworks.week1.day2;

//3) Multiples of 7 Program in Java
//        7 x 1 =7
//        7 x 2 = 14
//        7 x 3 = 21
//        …
//        ...
//        7 x 10 = 70

public class MultiplesOfNumber {
    public static void main(String[] args) {

        int num = 11;
        multiplesOfnum(num);

    }

    public static void multiplesOfnum(int n) {

        for(int i=1; i < 11; i++) {
            System.out.println(n + " X " + i + " = " + (n*i));
        }
    }

}