package in.co.nmsworks.week3.day1.set2;

public class BinaryConverter {
    public static String decimalToBinary(int number) {
        String result = "";
        if (number == 0) return "0";
        while (number > 0) {
            int remainder = number % 2;
            result = remainder + result;
            number = number / 2;
        }
        return result;
    }

    public static int binaryToDecimal(String binaryString) {
        int result = 0;
        int power = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char digit = binaryString.charAt(i);
            if (digit == '1') {
                result += Math.pow(2, power);
            }
            power++;
        }
        return result;
    }

    public static void main(String[] args) {
        int decimal = 42;
        String binary = decimalToBinary(decimal);
        System.out.println("Binary of " + decimal + " is " + binary);

        String binaryInput = "101010";
        int decimalOutput = binaryToDecimal(binaryInput);
        System.out.println("Decimal of " + binaryInput + " is " + decimalOutput);
    }
}
