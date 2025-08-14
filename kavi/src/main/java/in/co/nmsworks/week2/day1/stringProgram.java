package in.co.nmsworks.week2.day1;

public class stringProgram {
    public static void main(String[] args) {
       printIndex();
       lengthOfString();
       printExtractSubstring();
       printExtractSubstring();
       containSubString();
       printStringCompare();
       compareTwoString();
       concatenateString();
       printStringCompare();
       compareString();
       printsplitscreen();
       stringSplitter13();
       indexOfFirstOccurance();
       indexOfSubstringOcuurance();
       convertStringLower();
       convertStringUpper17();
       printconvertInteger();
       printStringConcate();




    }
    public static void printIndex(){
        String input="NMSworks";
        input.charAt(5);

    }

    public static void lengthOfString(){
                String myString = "OpenAI";
                int length = myString.length();
                System.out.println("The length of the string \"" + myString + "\" is: " + length);

    }

    public static void printExtractSubstring() {
        String inputString = "Java Programming";
        int beginIndex = 5;

        String extractedSubstring = inputString.substring(beginIndex);


        System.out.println("Original String: " + inputString);
        System.out.println("Begin Index: " + beginIndex);
        System.out.println("Extracted Substring: " + extractedSubstring);
    }

    public static void ExtractSubstrin(){
        String inputString = "Welcome to Java";
        int beginIndex = 11;
        int endIndex = 15;


        String extractedSubstring = inputString.substring(beginIndex, endIndex);


        System.out.println("Original String: " + inputString);
        System.out.println("Substring from index " + beginIndex + " to " + endIndex + ": " + extractedSubstring);
    }


    public static void containSubString(){
                String mainString = "Java Programming";
                String subString = "Prog";

                if (mainString.contains(subString)) {
                    System.out.println("Found");
                } else {
                    System.out.println("Not Found");
                }
    }

    /* Write a Java program that uses `String.join` to concatenate a list of strings with a
specified delimiter. What will be the output if the elements are "apple", "banana", and "cherry" and
the delimiter is ", "?*/
    public static void  printStringConcate(){
        String[] str = {"apple", "banana", "kivi"};
        String.join(",",str);
    }

   public static void printStringCompare() {
       String str1 = "hello";
       String str2 = "Hello";
       if (str1.equals(str2)) {
           System.out.println("Strings are equal (case-sensitive).");
       } else {
           System.out.println("Strings are not equal (case-sensitive).");
       }

       if (str1.equalsIgnoreCase(str2)) {
           System.out.println("Strings are equal (case-insensitive).");
       } else {
           System.out.println("Strings are not equal (case-insensitive).");

       }
   }

   public static void compareTwoString(){

               String str1 = "";
               String str2 = "Hello";
               String str3 = " ";

               checkAndPrint(str1);
               checkAndPrint(str2);
               checkAndPrint(str3);
    }

    public static void checkAndPrint(String s) {
               if (s.isEmpty()) {
                   System.out.println("Empty");
               } else {
                   System.out.println("Not Empty");
               }
    }

    public static void concatenateString() {

        String s1="hello";
        String s2="world";
        String s3=s1+s2;
        System.out.println(s3);

    }

    public static void ReplaceCharacter() {
                String originalString = "banana";
                char charToReplace = 'a';
                char replacementChar = 'o';

                String modifiedString = originalString.replace(charToReplace, replacementChar);

                System.out.println("Original String: " + originalString);
                System.out.println("Modified String: " + modifiedString);
    }


    public static void compareString() {

                String string1 = "hello";
                String string2 = "HELLO";

                if (string1.equalsIgnoreCase(string2)) {
                    System.out.println("The strings are equal (ignoring case).");
                } else {
                    System.out.println("The strings are not equal (ignoring case).");
                }
    }


    public static void printsplitscreen(){

                String inputString = "one,two,three";
                String delimiter = ",";

                // Split the string using the delimiter
                String[] substrings = inputString.split(delimiter);

                // Print each substring
                System.out.println("Substrings:");
                for (String substring : substrings) {
                    System.out.println(substring);
                }

    }

    public static void stringSplitter13() {

                String inputString = "apple;banana;cherry;date";
                String delimiter = ";";
                int limit = 3;

                String[] result = inputString.split(delimiter, limit);

                System.out.println("Resulting substrings:");
                for (String s : result) {
                    System.out.println(s);
                }

    }

    public static void indexOfFirstOccurance() {
                String inputString = "programming";
                char targetChar = 'g';

                int index = inputString.indexOf(targetChar);

                if (index != -1) {
                    System.out.println("The first occurrence of '" + targetChar + "' is at index: " + index);
                } else {
                    System.out.println("The character '" + targetChar + "' was not found in the string.");
                }
    }

    public static void indexOfSubstringOcuurance() {
                String mainString = "welcome to the world";
                String subString = "the";
                int startIndex = 10;

                int index = mainString.indexOf(subString, startIndex);


                if (index != -1) {
                    System.out.println("The first occurrence of \"" + subString + "\" starts at index: " + index);
                } else {
                    System.out.println("\"" + subString + "\" not found in the string from index " + startIndex);
                }

    }
    public static void convertStringLower() {
                String inputString = "Java Programming";
                String lowerCaseString = inputString.toLowerCase();
                System.out.println(lowerCaseString);

    }
    public static void convertStringUpper17() {
                String inputString = "welcome to Java";
                String uppercaseString = inputString.toUpperCase();
                System.out.println(uppercaseString);

    }
    public static void printconvertInteger() {
        int number = 1234;
        String strNumber = String.valueOf(number);
        System.out.println("The integer converted to a string is: " + strNumber);
    }
}







