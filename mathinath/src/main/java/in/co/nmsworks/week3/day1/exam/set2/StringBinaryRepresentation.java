package in.co.nmsworks.week3.day1.exam.set2;

public class StringBinaryRepresentation {
    public static void main(String[] args) {
        StringBinaryRepresentation sbr = new StringBinaryRepresentation();
        String binary = sbr.integerToBinary(22);
        System.out.println("Integer to binary "+binary);
        int decimal = sbr.stringToDecimal("100");
        System.out.println("String to decimal :"+decimal);
    }

    private int stringToDecimal(String string) {
        return Integer.parseInt(string);
    }

    private String integerToBinary(int i) {
        return Integer.toBinaryString(i);
    }
}
