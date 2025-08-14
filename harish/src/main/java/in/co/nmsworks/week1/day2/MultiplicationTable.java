/*Multiples of 7 Program in Java
7 x 1 =7
        7 x 2 = 14
        7 x 3 = 21
        …
        ...
        7 x 10 = 70*/
package in.co.nmsworks.week1.day2;

public class MultiplicationTable {
    public static void main(String[] args) {
        int noOfRows = 10, noToMultiply = 7;
        multiplicationTable(noOfRows,noToMultiply);
    }
    public static void multiplicationTable(int noOfRows, int noToMultiply){
        for(int i = 1; i <= noOfRows; i++){
            System.out.println(noToMultiply+" x "+i+" = "+(noToMultiply*i));
        }
    }
}
