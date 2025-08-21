package in.co.nmsworks.week2.test.set1;

import java.util.Arrays;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        convertStatementToTitleCase("this is my java program");
        Intern intern1 = new Intern("Yamini", "IT");
        Intern intern2 = new Intern("Viji", "CSE");
        Intern intern3 = new Intern("Sheik", "IT");
        Intern intern4 = new Intern("Vijay", "CSE");
        Intern intern5 = new Intern("Vikas", "IT");
        Intern[] array = {intern1, intern2, intern3, intern4, intern5};
        System.out.println();
        System.out.println(Arrays.toString(returnIndices(array)));
        String res=returnBinary(14);
        System.out.println(res);
        System.out.println(stringToBinary("10101001"));
    }

    public static void convertStatementToTitleCase(String input) {
        String[] arr = input.split(" ");
        for (String words : arr) {
            System.out.print(words.substring(0, 1).toUpperCase() + words.substring(1).toLowerCase());
        }
    }

    public static int[] returnIndices(Intern[] array) {

        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDept().equals("IT")) {
                count++;

            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDept().equals("IT")) {
                result[index++] = i;
            }
        }

        return result;
    }

    public static String returnBinary(int number) {
       int temp=number;
       String result="";
       while(temp>0){
           int last=temp%2;
           result=last+result;
           temp=temp/2;

       }
       return result;
    }

    public  static int stringToBinary(String binaryString){

        int binaryNumber=Integer.parseInt(binaryString);
        int dec=0;
        int base=1;
        int temp=binaryNumber;
        while(temp>0){
            int last=temp%10;
            temp=temp/10;
            dec=dec+last*base;
            base=base*2;

        }

     return dec;
    }
}




