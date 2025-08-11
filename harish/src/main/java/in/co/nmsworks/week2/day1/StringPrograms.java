package in.co.nmsworks.week2.day1;

import java.sql.SQLOutput;

public class StringPrograms {

    public static void main(String[] args) {
        String name = "NMSWorks";
        int index = 5;
        characterAtTheString(name,index);
        String givenString = "openAi";
        lengthOf(givenString);
        String givenString2 = "Java pogramming";
        subString(givenString2);
        String givenString3 = "Welcome to Java";
        printSubString(givenString3);
        String given = "Java Programming";
        String subString = "Prog";
        subStringFoundOrNot(given,subString);
        String firstString = "hello";
        String secondString = "Hello";
        compareTwoString(firstString,secondString);
        String emptyString = " ";
        isEmpty(emptyString);
        String first = "Hello";
        String second = "World";
        conacatenateTwoString(first,second);
        String givenStr ="banana";
        replaceTheCharacter(givenStr);
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "grapes";
        joinString(str1,str2,str3);

        String firstString1 = "hello";
        String secondString2 = "Hello";
        compareTwoStringIgnoreCase(firstString1,secondString2);

        String str5 ="apple,banana,grapes";
        subStringWithDelimiter(str5);

        String str6 ="appl;banana;grapes";
        subStringWithLimits(str6);

        String str7 = "Programming";
        String single = "g";
        indexOfString(str7,single);

        String str8 = "welcome to java";
        stringUpperCase(str8);

        int givennumber = 1234;
        integerToString(givennumber);
    }
    public  static void characterAtTheString(String name, int index){
        System.out.println("The character at index "+name.charAt(index));
    }

    public static void lengthOf(String givenString){
        System.out.println("The length of the string is :"+givenString.length());
    }

    public static void subString(String givenString){
        System.out.println("The Sub string :"+givenString.substring(5));
    }
    public static void printSubString(String givenString){
        System.out.println("The Sub string :"+givenString.substring(11,15));
    }

    public static void subStringFoundOrNot(String given,String subString){
        if(given.contains(subString)){
            System.out.println("The word found");
        }
        else{
            System.out.println("Not found");
        }
    }
    public static void compareTwoString(String firstString,String secondString){
        if (firstString.equals(secondString)) {
            System.out.println("the two strings are eqaul");
        }
    }

    public static void isEmpty(String emptyString){
        if(emptyString.isEmpty()){
            System.out.println("The given String is empty");
        }
        else{
            System.out.println("The given String is  not empty");
        }
    }

    public static void conacatenateTwoString(String first,String second){
        System.out.println(first.concat(second));
    }

    public static void replaceTheCharacter(String givenStr){
        System.out.println(givenStr.replace('a','o'));

    }
    public static void joinString(String str1, String str2, String str3){
        System.out.println(String.join(str1,str2,str3));
    }

    public static void compareTwoStringIgnoreCase(String firstString,String secondString){
        if (firstString.equalsIgnoreCase(secondString)) {
            System.out.println("the two strings are eqaul");
        }
    }
    public static void subStringWithDelimiter(String str2){
        String[] splittedArray = str2.split(",");
        for(int i = 0;i < splittedArray.length; i++){
            System.out.println(splittedArray[i]);
        }
    }

    public static void subStringWithLimits(String str2){
        String[] splittedArray = str2.split(";",3);
        for(int i = 0;i < splittedArray.length; i++){
            System.out.println(splittedArray[i]);
        }
    }

    public static void indexOfString(String str2,String singleChar){
        System.out.println(str2.indexOf(singleChar));
    }

    public static void subStringIndex(String str1){
        System.out.println(str1.substring(10,11));
    }

    public static void stringUpperCase(String str1){
        System.out.println(str1.toUpperCase());
    }

    public static void integerToString(int num){
        System.out.println(String.valueOf(num));
    }
}
