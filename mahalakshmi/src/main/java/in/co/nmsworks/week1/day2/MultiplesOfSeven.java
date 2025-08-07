package in.co.nmsworks.week1.day2;
public class MultiplesOfSeven {

    // 3) Multiples of 7 Program in Java
    public static void main(String[] args) {
        int n1 = 7, stop1 = 10;
        calMultiples(n1,stop1);
    }

    public static void calMultiples(int num, int stop) {
        for(int i = 1 ; i <= stop ; i++) {
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}
