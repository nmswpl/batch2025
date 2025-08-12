package in.co.nmsworks.week2.day1;

import java.sql.SQLOutput;

public class StringPrograms {

    public static void main(String[] args) {

        /*
        1* Write a Java program that takes a string and an index as input and prints the
character at that index. What will the program output if the input string is "NMSWorks" and the
index is 5?
         */
        String name = "NMSWorks";
        int index = 5;
        characterAtTheString(name,index);

        /* *2. Write a Java program that prints the length of a given string. What will the length
be for the string "OpenAI"?*/
        String givenString = "openAi";
        lengthOf(givenString);

        /*
        3.Write a Java program that extracts and prints the substring from a given string
starting at a specified index. What will be the result if the input string is "Java Programming" and
the beginIndex is 5?
         */
        String givenString2 = "Java pogramming";
        subString(givenString2);

        /*
        4.Write a Java program that extracts and prints a substring from a given string
starting from `beginIndex` and ending at `endIndex`. What will be the result if the input string is
"Welcome to Java" and the indices are 11 and 15?
         */
        String givenString3 = "Welcome to Java";
        printSubString(givenString3);

        /*
        5.Write a Java program that checks if a given string contains a specific substring.
Print "Found" if the substring is present, otherwise print "Not Found". What will the result be if the
input string is "Java Programming" and the substring is "Prog"?
         */
        String given = "Java Programming";
        String subString = "Prog";
        subStringFoundOrNot(given,subString);

        /*
        7.Write a Java program that compares two strings for equality and prints whether
they are equal. What will be the result if the strings are "hello" and "Hello"?
         */
        String firstString = "hello";
        String secondString = "Hello";
        compareTwoString(firstString,secondString);

        /*
       8. Write a Java program that checks if a given string is empty and prints "Empty" or
"Not Empty" based on the result. What will the result be for the string " " (a single space)?
         */
        String emptyString = " ";
        isEmpty(emptyString);

        /*
       9. Write a Java program that concatenates a given string with another string using
the `concat` method. What will be the result if the strings are "Hello" and " World"?
         */
        String first = "Hello";
        String second = "World";
        conacatenateTwoString(first,second);

        /*
        10.* Write a Java program that replaces all occurrences of a specific character in a
string with another character and prints the result. What will the output be if the string is "banana"
and you replace 'a' with 'o'?
         */
        String givenStr ="banana";
        replaceTheCharacter(givenStr);
        /*
      6.  Write a Java program that uses `String.join` to concatenate a list of strings with a
specified delimiter. What will be the output if the elements are "apple", "banana", and "cherry" and
the delimiter is ", "?
         */
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "grapes";
        joinString(str1,str2,str3);

        /*
       11. Write a Java program that compares two strings for equality, ignoring case, and
prints whether they are equal. What will be the result if the strings are "hello" and "HELLO"?
         */

        String firstString1 = "hello";
        String secondString2 = "Hello";
        compareTwoStringIgnoreCase(firstString1,secondString2);

        /*
      12.  Write a Java program that splits a string into an array of substrings based on a
specified delimiter and prints each substring. What will be the output if the input string is
"one,two,three" and the delimiter is ","?
         */

        String str5 ="apple,banana,grapes";
        subStringWithDelimiter(str5);

        /*
        Write a Java program that splits a string into an array of substrings with a
specified limit on the number of substrings. What will be the result if the input string is
"apple;banana;cherry;date" with a limit of 3?
         */
        String str6 ="apple;banana;grapes";
        subStringWithLimits(str6);

        /*
        Write a Java program that finds and prints the index of the first occurrence of a
specific character in a string. What will be the result if the input string is "programming" and the
character is 'g'?
         */

        String str7 = "Programming";
        String single = "g";
        indexOfString(str7,single);

        /*
        * Write a Java program that converts a given string to lowercase and prints the
result. What will be the output if the input string is "Java Programming"?
         */

        String str12 = "Java programMIng";
        stringLowerCase(str12);
        /*
        * Write a Java program that converts a given string to uppercase and prints the
result. What will be the output if the input string is "welcome to Java"?
         */

        String str8 = "welcome to java";
        stringUpperCase(str8);

       /* Write a Java program that converts an integer to a string using `String.valueOf`
        and prints the result. What will be the output if the integer value is 1234?
*/
        int givennumber = 1234;
        integerToString(givennumber);

        /*
        Write a Java program that finds and prints the index of the first occurrence of a
substring, starting the search from a specified index. What will be the result if the input string is
"welcome to the world" and the substring is "the", starting from index 10?
         */
        String str9 = "welcome to the world";
        subStringIndex(str9);
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
        else{
            System.out.println("The two string are not equal");
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
        System.out.println(String.join(",",str1,str2,str3));
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
        System.out.println(str1.indexOf("the",10));
    }

    public static void stringUpperCase(String str1){
        System.out.println(str1.toUpperCase());
    }

    public static void stringLowerCase(String str1){
        System.out.println(str1.toLowerCase());
    }

    public static void integerToString(int num){
        System.out.println(String.valueOf(num));
    }

}
