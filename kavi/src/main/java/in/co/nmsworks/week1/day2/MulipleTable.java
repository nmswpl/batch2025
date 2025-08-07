package in.co.nmsworks.week1.day2;
//3) Multiples of 7 Program in Java
public class MulipleTable {
    public static void main(String[] args) {

        printMultiple();
    }

    public static void printMultiple() {
        int num = 7;
        for (int i = 1; i <= 10; i ++) {
            System.out.println(i + " * " + num + " = " + (i*num));

        }
    }
}
