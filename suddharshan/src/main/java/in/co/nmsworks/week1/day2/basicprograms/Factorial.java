package in.co.nmsworks.week1.day2.basicprograms;
/*
4) Factorial Program in Java
 */
public class Factorial {
    public static void main(String[] args) {
        int b =5, c= 6;
        System.out.println("Factorial is = " +getFactorial(b));
        System.out.println("Factorial is = " +getFactorial(c));
    }
    public static int getFactorial(int a){
        int res = 1;
        while (a!=0){
            res = res*a;
            a--;
        }
        return res;
    }
}

