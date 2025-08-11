package in.co.nmsworks.week2.day1;

import java.util.Arrays;

public class StringPrograms {
    public static void indexOfTheString(String input1){
        System.out.println(input1.charAt(5));
    }

    public static void lengthOfTheString(String input2){
        System.out.println(input2.length());
    }

    public static void printSubstring(String input3){
        System.out.println(input3.substring(5));
    }

    public static void printSubstringWithBegin(String input4){
        System.out.println(input4.substring(11,15));
    }

    public static void containsSubstring(String input5, String word){
        if(input5.contains("Prog")){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }

    public static void equalsString(String input6, String input7){
        System.out.println(input6.equals(input7));
    }

    public static void isEmptyString(String input8){
        System.out.println(input8.isEmpty());
    }

    public static void concatenateString(String input9, String input10){
        System.out.println(input9.concat(input10));
    }

    public static void replaceAll(String input11){
        System.out.println(input11.replace('a', 'o'));
    }

    public static void stringJoin(String input12, String input13, String input14){
        System.out.println(String.join(input12,input13,input14));
    }

    public static void ignoreCase(String input15,String input16){
        System.out.println(input15.equalsIgnoreCase(input16));
    }

    public static void stringSplit(String input17){
        String[] arr = input17.split(",");
        System.out.println(Arrays.toString(arr));
    }

    public static void stringSplitWithLimit(String input18){
        String[] arr = input18.split(";", 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void firstOccurence(String input19){
        System.out.println(input19.indexOf('g'));
    }

    public static void firstOccurenceOfTheString(String input20){
        System.out.println(input20.indexOf(input20.substring(10)));
    }

    public static void lowerCaseOfTheString(String input21){
        System.out.println(input21.toLowerCase());
    }

    public static void upperCaseOfTheString(String input22){
        System.out.println(input22.toUpperCase());
    }

    public static void autoBox(String input23){
        System.out.println(input23);
    }
    public static void main(String[] args) {
        String input1 = "NMSWorks";
        indexOfTheString(input1);

        String input2 = "OpenAI";
        lengthOfTheString(input2);

        String input3 = "Java Programming";
        printSubstring(input3);

        String input4 = "Welcome to Java";
        printSubstringWithBegin(input4);

        String input5 = "Java Programming";
        String word = "Prog";
        containsSubstring(input5,word);

        String input6 = "hello";
        String input7 = "Hello";
        equalsString(input6,input7);

        String input8 = " ";
        isEmptyString(input8);

        String input9 = "Hello";
        String input10 = "World";
        concatenateString(input9,input10);

        String input11 = "banana";
        replaceAll(input11);

        String input12 = "apple";
        String input13 = "banana";
        String input14 = "cherry";
        stringJoin(input12,input13,input14);

        String input15 = "hello";
        String input16 = "HELLO";
        ignoreCase(input15,input16);

        String input17 = "one,two,three";
        stringSplit(input17);

        String input18 = "apple;banana;cherry;date";
        stringSplitWithLimit(input18);

        String input19 = "Programming";
        firstOccurence(input19);

        String input20 = "welcome to the world";
        firstOccurenceOfTheString(input20);

        String input21 = "Java Programming";
        lowerCaseOfTheString(input21);

        String input22 = "welcome to java";
        upperCaseOfTheString(input22);

        String input23 = new String();
        input23.valueOf("1234");
        autoBox(input23);


    }
}
