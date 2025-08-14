package in.co.nmsworks.week1.test;

public class PrintTheHundredthPosition {
    public static void main(String[] args) {
        print(542);
        print(777);
    }
    public static void print(int number) {
        String[] arr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int digit = number/100;
        System.out.println(arr[digit]);
    }
}
