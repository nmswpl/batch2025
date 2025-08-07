/* Multiples of 7 Program in Java
7 x 1 =7
        7 x 2 = 14
        7 x 3 = 21
        …
        ...
        7 x 10 = 70*/
package in.co.nmsworks.week1.day2;

public class PrintTable {

    public static void main(String[] args) {
        table(7);
    }

    public static void table(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i +" = " + (n*i) ) ;
        }

    }
}
