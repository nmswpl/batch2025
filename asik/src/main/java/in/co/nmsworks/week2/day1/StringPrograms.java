package in.co.nmsworks.week2.day1;

public class StringPrograms
{
    public static void main(String[] args) {
        System.out.println(getCharacter("NmsWorks", 5));

        printLengthOfTheString("OpenAI");

        printSubstring("Java Programming", 5);

        printSubstringWithBeginAndEnd("Welcome to Java", 11, 15);

        boolean result = checkSubstring("Java Programming", "Prog");
        if(result)
        {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }

        joinStringUsingDemlimiter();

        checkIfTwoStringsAreEqual("hello", "HELLO");

        boolean isEmpty = checkIfStringIsEmpty(" ");
        if(isEmpty)
        {
            System.out.println("Empty");
        }
        else
        {
            System.out.println("Not Empty");
        }


        concatTwoStrings();

        String resultString = replaceCharacters("banana", 'o');
        System.out.println(resultString);

        checkIfStringsAreEqual();

        printArrayOfSubstrings("one,two,three", ",");

        printSubstringWithLimit("apple;banana;cherry;date", 3);

        printIndexOfFirstOccurence("programming", 'g');

        printIndexOfFirstSubstring("welcome to the world", "the", 10);

        changeToLowerCase("Java Programming");

        changeToUpperCase("welcome to Java");

        System.out.println(getIntegerValue(1234));
    }

    private static void concatTwoStrings() {
        System.out.println("Hello".concat("World"));
    }

    private static void checkIfTwoStringsAreEqual(String str1, String str2) {
        System.out.println(str1.equals(str2));
    }

    private static void joinStringUsingDemlimiter() {
        System.out.println(String.join(",", new String[]{"apple", "banana", "cherry"}));
    }

    private static void changeToUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    private static void changeToLowerCase(String str) {
        System.out.println(str.toLowerCase());
    }

    private static void checkIfStringsAreEqual() {
        System.out.println("hello".equalsIgnoreCase("HELLO"));
    }

    public static char getCharacter(String str, int index)
    {
        return str.charAt(index);
    }

    public static void printLengthOfTheString(String str)
    {
        System.out.println(str.length());
    }

    public static void printSubstring(String str, int beginIndex)
    {
        System.out.println(str.substring(beginIndex));
    }

    public static boolean checkSubstring(String str, String word)
    {
        return str.contains(word);
    }

    public static void printSubstringWithBeginAndEnd(String str, int begin, int end)
    {
        System.out.println(str.substring(begin, end));
    }

    public static boolean checkIfStringIsEmpty(String str)
    {
        return str.isEmpty();
    }

    public static String replaceCharacters(String str, char character)
    {
        return str.replace('a', 'o');
    }

    public static void printArrayOfSubstrings(String str, String delimiter)
    {
        String[] arr = str.split(delimiter);
        for(String s : arr)
        {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void printSubstringWithLimit(String str, int limit)
    {
        String[] arr = str.split(";", limit);
        for(String s : arr)
        {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void printIndexOfFirstOccurence(String str, char c)
    {
        System.out.println(str.indexOf(c));
    }

    public static void printIndexOfFirstSubstring(String str, String subString, int startIndex)
    {
        System.out.println(str.indexOf(subString, startIndex));
    }

    public static String getIntegerValue(int num)
    {
        return String.valueOf(num);
    }

}

