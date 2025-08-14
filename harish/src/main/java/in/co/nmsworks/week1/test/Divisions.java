package in.co.nmsworks.week1.test;

public class Divisions {
    public static void main(String[] args) {
        int divider = 3;
        printTheDivisibleNumbers(divider);
    }
    public static void printTheDivisibleNumbers(int divider){
        for(int i = 303 ; i < 400 ; i = i + 3){
            System.out.println(i);
        }
    }
}
