package in.co.nmsworks.week3.set2;

public class NumberConverter {

    public String integerToBinary(int number){
        String binary = Integer.toBinaryString(number);
        return binary ;
    }

    public int binaryToDecimal(String binary){
        int decimal = Integer.parseInt(binary,2);
        return decimal;
    }

    public static void main(String[] args) {
        NumberConverter convert = new NumberConverter();
        System.out.println("Decimal of 1000 is : "+convert.binaryToDecimal("1000"));
        System.out.println("Binary of 8 is : "+convert.integerToBinary(8));
    }

}
