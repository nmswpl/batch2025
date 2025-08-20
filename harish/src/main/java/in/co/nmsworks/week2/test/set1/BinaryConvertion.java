package in.co.nmsworks.week2.test.set1;

import java.util.HashSet;
import java.util.Set;

public class BinaryConvertion {

    public static void main(String[] args) {
        int number = 13;
        String binary = "1101";
        System.out.println("This is the binary number of the given number " + getBinary(number));
        System.out.println("The decimal value of the given binary String " + getDecimal(binary));
        Set<String> set = new HashSet<>();
    }
    private static int getDecimal(String binary) {
        int decimal = 0;
        int j = binary.length() - 1;
        for(int i = 0; i < binary.length() ; i++ ){
            decimal += (int)(binary.charAt(j) - '0') * (int)Math.pow(2,i);
            j--;
        }
        return decimal;
    }

    private static String getBinary(int number) {
        String binaryString = "";
        int quotient = number;
        int reminder;
        while (quotient > 0) {
            reminder = quotient % 2;
            quotient = quotient / 2;
            binaryString = reminder + binaryString;
        }
        return binaryString;
    }
}