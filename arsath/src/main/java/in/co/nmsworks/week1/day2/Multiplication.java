package in.co.nmsworks.week1.day2;

public class Multiplication {
    // Multiples of 7 Program in Java
    public static void printMultiplication(int a){
        for(int i=1;i<=10;i++){
            int b = a*i;
            System.out.println(a + "x" + i + "=" + b);
        }
    }

    public static void main(String[] args) {
        int a = 7;
        printMultiplication(a);
    }
}
