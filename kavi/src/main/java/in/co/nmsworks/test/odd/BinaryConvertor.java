package in.co.nmsworks.test.odd;

public class BinaryConvertor {

        public static String intToBinary(int number) {
            return Integer.toBinaryString(number);
        }


        public static int binaryToInt(String binaryStr) {
            return Integer.parseInt(binaryStr, 2);
        }

        public static void main(String[] args) {
            int decimalNumber = 25;
            String binaryString = intToBinary(decimalNumber);
            System.out.println("Decimal" + decimalNumber + " to binary" + binaryString);

            String binaryInput = "10011";
            int decimalValue = binaryToInt(binaryInput);
            System.out.println("Binary" + binaryInput + " to decimal" + decimalValue);
        }



}
