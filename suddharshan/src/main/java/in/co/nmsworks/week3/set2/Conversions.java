package in.co.nmsworks.week3.set2;
/*
Write a program that contains two methods:
1. Method 1: This method accepts an integer and returns its binary representation as a String.
2. Method 2: This method accepts a String (representing a binary number) and returns its
corresponding decimal value.
 */
public class Conversions {
    public static void main(String[] args) {
        Conversions c = new Conversions();
        System.out.println(c.integertoBinaryString(12));
        System.out.println(c.binaryStringToDecimal("101001"));
    }

    public String integertoBinaryString(int i){
        return Integer.toBinaryString(i);
    }
    public int binaryStringToDecimal(String s){
        return Integer.parseInt(s,2);
    }

}
