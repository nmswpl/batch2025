package in.co.nmsworks.week2.day4;

public class SwapTwoNumber {
    public static void main(String[] args) {

        int value1 = 5;
        int value2 = 3;
        int temp;
        System.out.println("swap Before :" + value1 +" "+ value2);
        temp = value1;
        value1 = value2;
        value2 = temp;

        System.out.println("swap after :" + value1 +" "+ value2);
    }
}
