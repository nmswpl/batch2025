package in.co.nmsworks.week3.day1.set2;

public class IntegerBinaryConversion {
    public static void main(String[] args) {

        int number = 16;
        String binaryValue = getBinaryFromInteger(number);
        System.out.println(number + " 's Binary Conversion is : " + binaryValue);

        System.out.println(binaryValue + " 's Integer value is : " + getIntegerFromBinary(binaryValue));
    }

    public static String getBinaryFromInteger(int number){

        String binary = "";
        int k = 0;
        while(number >= 1){
            int rem = (number % 2);
            binary = rem + binary;
            number = number/2;
        }
        return binary;
    }

    public static int getIntegerFromBinary(String binaryValue){

        int number = 0;
        int k = 0;
        for (int i = binaryValue.length()-1; i >= 0; i--){
            if(binaryValue.charAt(i) == '0'){
                k++;
                continue;
            }
            else{
                number += Math.pow(2, k++);
            }
        }
        return number;
    }
}
