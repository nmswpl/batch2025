//Multiples of 7 Program in Java

package in.co.nmsworks.week1.day2;

public class MultiplicationTable {
    public static void main(String[] args) {
        printTable(7);

    }
    public static void printTable(int n){

        for(int i = 1 ; i <= 10 ;i ++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }

}
