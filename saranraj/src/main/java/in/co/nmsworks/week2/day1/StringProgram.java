package in.co.nmsworks.week2.day1;

public class StringProgram {

    public static void main(String[] args) {

         printIndexOfCharacter();
         printLengthOfString();
         printSubstringOfString();
         printSubString();
         printSubstringFoundOrNot();
         //------------------------
         printJoinString();
         printCompareTwoString();
         printCheckStringEmptyOrNot();
         printConcatOfTwoString();
         printReplaceLetter();
//         -----------------------
        printStringEqualsOrNot();
        printEachSubStringUsingDelimiter();
        printSplitIntoArrayOfString();
        printIndexOfFirstCharacter();
        printSpecificSearchIndex();
//      ----------------------------
        printStringIntoLowerCase();
        printStringIntoUpperCase();
        printIntegerIntoString();
    }

    private static void printIntegerIntoString() {
        int value = 1234;
        System.out.println(String.valueOf(value));
    }

    private static void printStringIntoUpperCase() {
      String word = "welcome to Java";
        System.out.println(word.toUpperCase());
    }


    private static void printStringIntoLowerCase() {
        String word = "Java Programming";
        System.out.println(word.toLowerCase());
    }

    private static void printSpecificSearchIndex() {
        String word = "welcome to the world";
        System.out.println(word.indexOf("the",10));
    }

    private static void printIndexOfFirstCharacter() {
        String word = "programming";
        System.out.println(word.indexOf("g"));
    }


    private static void printSplitIntoArrayOfString() {
        String[] words = "apple;banana;cherry;date".split(";",3);
        for(String word : words){
            System.out.println(word);
        }
    }

    private static void printEachSubStringUsingDelimiter() {
        String[] words = "one,two,three".split(",");
        for(String word : words ){
            System.out.println(word);
        }
    }

    private static void printStringEqualsOrNot() {
        String word1 = "hello";
        String word2 = "Hello";
        System.out.println(word1.equalsIgnoreCase(word2));

    }

    private static void printReplaceLetter() {
        String word = "banana";
System.out.println(word.replace("a","o"));
    }

    private static void printConcatOfTwoString() {

         String word1 = "Hello";
         String word2 = "World";
        System.out.println(word1.concat(word2));
    }

    private static void printCheckStringEmptyOrNot() {
        String word = " ";
        if(word.isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            System.out.println("Not Empty");
        }
    }

    private static void printCompareTwoString() {
        String word1 = "hello";
        String word2 = "Hello";

        if(word1.equals(word2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equals");
        }

    }

    private static void printJoinString() {
        System.out.println(String.join(",","apple","banana","cherry"));
    }

    private static void printSubString() {
        String word = "Welcome to Java";
        System.out.println(word.substring(11,15));
    }

    private static void printSubstringFoundOrNot() {
        String word = "Java Programming";
        if(word.contains("Prog"))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }

    private static void printSubstringOfString() {
        String word = "Java Programming";
        int beginIndex = 5;
        System.out.println(word.substring(beginIndex));
    }

    private static void printLengthOfString() {
        String findLength = "OpenAI";
        System.out.println(findLength.length());
    }

    private static void printIndexOfCharacter() {
        String word = "NMSWorks";
        int index = 5;
        System.out.println(word.toLowerCase().charAt(index));
    }

}
