package in.co.nmsworks.week1.day2.basicprograms;
/*
Multiples of 7 Program in Java
7 x 1 =7
7 x 2 = 14
7 x 3 = 21
…
...
7 x 10 = 70
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int a=7;
        findMultiplicationTable(a);
    }
    public  static void findMultiplicationTable(int x){
        for(int i = 1; i < 11; i++){
            System.out.println(x + " x " + i + " = " + x*i);
        }
    }
}


