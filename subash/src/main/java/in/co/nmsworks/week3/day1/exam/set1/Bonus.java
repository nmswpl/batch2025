package in.co.nmsworks.week3.day1.exam.set1;

public class Bonus {


    public static String intToBinary(int number) {
        if (number == 0) {
            return "0";
        }
        String binary = "";
        while (number > 0) {
            int i = number % 2;
            binary = i + binary;
            number = number/2;
        }
        return binary.toString();
    }

    public static int binaryToInt(String binaryStr) {
        int decimal = 0;
        int length = binaryStr.length();
        for (int i = 0; i < length; i++) {
            char c = binaryStr.charAt(length - 1 - i);
            if (c == '1') {
                decimal += Math.pow(2, i);
            } else if (c != '0') {
                System.out.println("Invalid binary number: " + binaryStr);
            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        int num = 10;
        String binary = intToBinary(num);
        System.out.println("Binary of " + num + " is: " + binary);

        String binStr = "10111";
        int decimal = binaryToInt(binStr);
        System.out.println("Decimal of " + binStr + " is: " + decimal);
    }


}
