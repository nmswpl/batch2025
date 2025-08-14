package in.co.nmsworks.week2.day4;

public class FibonacSeries {
    public static void main(String[] args) {
        int number = 10;
        findFibonic(number);
    }

    public static void findFibonic(int getNumber) {
        int first = 0;
        int second = 1;
        int result=0;

        for (int i = 1; i < getNumber; i++) {
           System.out.println(result);
            result = first + second;
            first = second;
            second = result;

        }
    }
}
