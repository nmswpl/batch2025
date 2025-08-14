package in.co.nmsworks.week2.day1;

public class StringProgram {
    public static void main(String[] args) {
       printCharacterAtIndex("NMSWorks",5);
       printLengthOfTheString("OpenAI");
       printSubstringIndex("Java Programming" , 5);
       printSubstring("Welcome to Java",11,15);
       checkStringContains("Java Programming" , "Prog");
       compareTwoStrings("hello","Hello");
       isStringEmpty(" ");
       concateTwoStrings("Hello" ,"World");
       replaceCharacter("banana");
       checkTwoStringsEqual("hello","HELLO");
       printEachSubstring("one,two,three");
       splitStringIntoArray("apple;banana;cherry;date" , 3);
       printFirstOccurenceIndex("programming", 'g');
       printSpecifiedFirstOccurence("welcome to the world","the",10);
       convertStringToLowerCase("Java Programming");
       convertStringToUpperCase("welcome to Java");
       convertIntegerToString(1234);


    }


        /* Write a Java program that takes a string and an index as input and prints the
character at that index. What will the program output if the input string is "NMSWorks" and the
index is 5? */

    public static void printCharacterAtIndex(String input ,int n){
        System.out.println(input.charAt(n));
    }

    /* * Write a Java program that prints the length of a given string. What will the length
be for the string "OpenAI"? */

    public static void printLengthOfTheString(String input){
        System.out.println(input.length());
    }

    /* Write a Java program that extracts and prints the substring from a given string
starting at a specified index. What will be the result if the input string is "Java Programming" and
the beginIndex is 5? */

    public static void printSubstringIndex(String input, int n){
        System.out.println(input.substring(n));
    }

    /* Write a Java program that extracts and prints a substring from a given string
starting from `beginIndex` and ending at `endIndex`. What will be the result if the input string is
"Welcome to Java" and the indices are 11 and 15? */
    public static void printSubstring(String input, int n , int m){
        System.out.println(input.substring(n,m));
    }

    /* Write a Java program that checks if a given string contains a specific substring.
Print "Found" if the substring is present, otherwise print "Not Found". What will the result be if the
input string is "Java Programming" and the substring is "Prog"? */

   public static void  checkStringContains(String input,String isContain ){
       if(input.contains(isContain)){
           System.out.println("Found");
       }
       else{
           System.out.println("Not Found");
       }
   }

   /* Write a Java program that compares two strings for equality and prints whether
they are equal. What will be the result if the strings are "hello" and "Hello"? */
    public static void compareTwoStrings(String str1 , String str2){
        if(str1.equals(str2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }

    /* Write a Java program that checks if a given string is empty and prints "Empty" or
"Not Empty" based on the result. What will the result be for the string " " (a single space)? */

    public  static void isStringEmpty(String input){
        if(input.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not Empty");
        }
    }

    /* * Write a Java program that concatenates a given string with another string using
the `concat` method. What will be the result if the strings are "Hello" and " World"? */

      public static void concateTwoStrings(String input1, String input2){
          System.out.println(input1.concat(input2));
      }

      /* Write a Java program that replaces all occurrences of a specific character in a
string with another character and prints the result. What will the output be if the string is "banana"
and you replace 'a' with 'o'? */

    public static void replaceCharacter(String input){
        String res="";
        for(int i=0; i< input.length() ; i++){
            char ch = input.charAt(i);
            if(ch == 'a'){
                res=res+"o";
            }
            else{
                res=res+ch;
            }
        }
        System.out.println(res);

    }

    /* Write a Java program that compares two strings for equality, ignoring case, and
prints whether they are equal. What will be the result if the strings are "hello" and "HELLO"? */
      public static void checkTwoStringsEqual(String input1, String input2){
          if(input1.equalsIgnoreCase(input2)){
              System.out.println("equal");
          }
          else{
              System.out.println("Not Equal");
          }
      }

      /* Write a Java program that splits a string into an array of substrings based on a
specified delimiter and prints each substring. What will be the output if the input string is
"one,two,three" and the delimiter is ","? */
    public static void printEachSubstring(String input){
        String[] substring = input.split(",");
        for(int i=0 ;i< substring.length ; i++){
            System.out.print(substring[i]+" ");
        }
        System.out.println();
    }

    /* Write a Java program that splits a string into an array of substrings with a
specified limit on the number of substrings. What will be the result if the input string is
"apple;banana;cherry;date" with a limit of 3? */

    public static void splitStringIntoArray(String input,int limit){
            String[] array = input.split(";" , limit);
            for(int i=0; i< array.length ; i++){
                System.out.println(array[i]+ " ");
            }
    }

    /* * Write a Java program that finds and prints the index of the first occurrence of a
specific character in a string. What will be the result if the input string is "programming" and the
character is 'g'? */
    public static void printFirstOccurenceIndex(String input , char ch){
        System.out.println(input.indexOf(ch));
    }

    /* Write a Java program that finds and prints the index of the first occurrence of a
substring, starting the search from a specified index. What will be the result if the input string is
"welcome to the world" and the substring is "the", starting from index 10? */

    public static void printSpecifiedFirstOccurence(String input , String subString, int n){
        System.out.println(input.indexOf(subString,n));
    }

    /* Write a Java program that converts a given string to lowercase and prints the
result. What will be the output if the input string is "Java Programming"? */

    public static void convertStringToLowerCase(String input){
        System.out.println(input.toLowerCase());
    }

    /* * Write a Java program that converts a given string to uppercase and prints the
result. What will be the output if the input string is "welcome to Java"? */

    public static void convertStringToUpperCase(String input){
        System.out.println(input.toUpperCase());
    }

    /* Write a Java program that converts an integer to a string using `String.valueOf`
and prints the result. What will be the output if the integer value is 1234? */

    public static void convertIntegerToString(int number){
        System.out.println(String.valueOf(number));

    }








}
