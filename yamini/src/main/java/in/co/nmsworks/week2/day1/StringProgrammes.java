package in.co.nmsworks.week2.day1;

public class StringProgrammes {
    public static void main(String[] args) {
        printChar("NMSWorks", 5);
        findLength("OpenAI");
        printSubString("Welcome to Java", 11, 15);
        printSubStringWithIndex("Java Programming", 5);
        findSubString("Java Programming", "Prog");
        joinString("");
        compareStrings("Hello", "hello");
        findIsEmpty(" ");
        concatStrings("Hello", "World");
        replaceCharacters("banana", 'a', 'o');
        compareIgnoreCase("hello", "Hello");
        splitString("one,two,three");
        subStringWithLimitIndex("apple;banana;cherry;date", 3);
        printIndex("programming", "g");
        findIndex("welcome to the world", "the", 10);
        lowerCaseConversion("Java Programming");
        upperCaseConversion("welcome to java");
        integerToString(1234);

    }

    public static void printChar(String input, int index) {
        System.out.println(input.charAt(index));
    }

    public static void findLength(String input) {
        System.out.println(input.length());
    }

    public static void printSubString(String input, int begIndex, int lastIndex) {
        System.out.println(input.substring(begIndex, lastIndex));
    }

    public static void printSubStringWithIndex(String input, int index) {
        System.out.println(input.substring(index));
    }

    public static void findSubString(String input, String subString) {
        if (input.contains(subString)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    public static void joinString(String input) {
        System.out.println(input.join(",", "apple", "banana", "cherry"));
    }

    public static void compareStrings(String word1, String word2) {
        System.out.println(word1.equals(word2));
    }

    public static void findIsEmpty(String input) {
        System.out.println(input.isEmpty());
    }

    public static void concatStrings(String input1, String input2) {
        System.out.println(input1.concat(input2));
    }

    public static void replaceCharacters(String input, char ch1, char ch2) {
        System.out.println(input.replace(ch1, ch2));
    }

    public static void compareIgnoreCase(String input1, String input2) {
        System.out.println(input1.equalsIgnoreCase(input2));
    }

    public static void splitString(String input) {
        String[] arr = input.split(",");
        for (String words : arr) {
            System.out.println(words);
        }
    }

    public static void subStringWithLimitIndex(String input, int limit) {
        String[] arr = input.split(";", limit);
        for (String words : arr) {
            System.out.println(words);
        }

    }

    public static void printIndex(String input, String ch) {
        System.out.println(input.indexOf(ch));
    }

    public static void findIndex(String input, String word, int index) {
        System.out.println(input.indexOf(word, index));
    }

    public static void lowerCaseConversion(String input) {
        System.out.println(input.toLowerCase());
    }

    public static void upperCaseConversion(String input) {
        System.out.println(input.toUpperCase());
    }

    public static void integerToString(int input) {
        System.out.println(String.valueOf(input));
    }

}
