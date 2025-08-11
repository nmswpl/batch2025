package in.co.nmsworks.week1.test;

public class HunderedthPositionInWords {
    public static void printHunderedthPositionInWords(int number, String[] numbers){
            int hunderedthDigit = number/100;
            System.out.println(numbers[hunderedthDigit]);
    }
    public static void main(String[] args) {
        int number = 542;
        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        printHunderedthPositionInWords(number,numbers);
    }
}
