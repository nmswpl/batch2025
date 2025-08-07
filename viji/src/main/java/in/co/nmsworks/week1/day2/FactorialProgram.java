// Factorial Program in Java
package in.co.nmsworks.week1.day2;

public class FactorialProgram {

    public static void main(String[] args) {
        int n=5;
        factorialNumber(n);
    }

    public static void factorialNumber(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }

}
