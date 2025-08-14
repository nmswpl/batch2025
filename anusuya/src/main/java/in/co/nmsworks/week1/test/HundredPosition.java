package in.co.nmsworks.week1.test;

public class HundredPosition {

    public static void printHundredPositionInWords ( int number){

        String[] valueInWords = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        int rem = 0;
        int i = 0;
        while( i < 3 && number > 0){
            rem = number % 10;
            number = number / 10;
            i++;
        }

        System.out.println(valueInWords[rem-1]);
    }

    public static void main(String[] args) {

        int number = 777;

        printHundredPositionInWords(number);
    }
}
