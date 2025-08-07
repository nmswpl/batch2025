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
        int NoOfRows = 10, NoToMultiply = 7;
        mUltiplicationTable(NoOfRows,NoToMultiply);
    }
    public static void mUltiplicationTable(int NoOfRows, int NoToMultiply){
        for(int i = 1; i <= NoOfRows; i++){
            System.out.println(NoToMultiply+" x "+i+" = "+(NoToMultiply*i));
        }
    }
}
