package in.co.nmsworks.week1.day2;
// 3, Multiples of 7 Program in Java
//7 x 1 =7
//7 x 2 = 14
//7 x 3 = 21
//…
//...
//7 x 10 = 70


public class MultiplesTables {

    public static void printTables(int number){
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " * " + number + " = " + i*number);
        }
    }

    public static void main(String[] args) {
        printTables(7);
    }
}
