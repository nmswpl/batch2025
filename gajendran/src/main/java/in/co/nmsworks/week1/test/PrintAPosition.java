package in.co.nmsworks.week1.test;

public class PrintAPosition {

    public static String getPositionOfInteger(int value, int digit){
        String[] numbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight","Nine"};
        if ((value < 100 && digit == 3) || (value < 10 && digit == 2) || (value < 0 && digit ==1)){
            return "Value Should Greater Then 100";
        }
        int temp = 0;
        for (int i = 0; i < digit; i++){

            temp = value % 10;
            value /= 10;
        }
        return numbers[temp-1];

    }


}
