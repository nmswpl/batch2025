package in.co.nmsworks.week2.day1;
import java.util.Arrays;

public class StringPrograms {
    public static void main(String[] args) {
        indexAtString("NMSWorks",5);
        System.out.println(printLength("OpenAi"));
        System.out.println(printSubstring("Java Programming",5));
        System.out.println(printSubstringWithStartEnd("Welcome to Java",11,15));
        System.out.println(substringPresentOrNot("Java Programming","Prog"));
        System.out.println(compareStrings("hello","Hello"));
        System.out.println(emptyOrNot(" "));
        System.out.println(concatTwoStrings("Hello","World"));
        System.out.println(replaceChar("banana",'a','o'));
        System.out.println(compareWithCaseInsensitive("hello","HELLO"));
        System.out.println(concatUsingJoin("apple","banana","cherry"));
        System.out.println(Arrays.toString(splitString("one,two,three")));
        splitStringWithLimit("apple;banana;cherry;date",3);
        System.out.println();
        System.out.println(firstOccurrence("programming",'g'));
//        firstOccurrenceWithSubstring("welcome to the world" ,"the",10);
        System.out.println(convertToLowercase("Java Programming"));
        System.out.println(convertToUppercase("welcome to Java"));
        System.out.println(printString(1234));
    }

    private static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void indexAtString(String word,int index) {
        System.out.println(word.charAt(index));
    }

    public static int printLength(String str) {
        return str.length();
    }

    public static String printSubstring(String str,int index) {
        return str.substring(index);
    }

    public static String printSubstringWithStartEnd(String str, int beg,int end) {
        return str.substring(beg,end);
    }

    public static String substringPresentOrNot(String str1,String str2) {
        if(str1.contains(str2)){
            return "Found";
        }
        else {
            return "Not Found";
        }
    }

    public static String emptyOrNot(String str) {
        return (str.isEmpty() ? "Empty" : "Not Empty");
    }

    public static String concatTwoStrings(String str1, String str2) {
        return str1.concat(str2);
    }

    public static String replaceChar(String str, char c1, char c2) {
        return str.replace(c1,c2);
    }

    public static String compareWithCaseInsensitive(String str1, String str2) {
        return str1.toLowerCase().equalsIgnoreCase(str2.toLowerCase()) ? "Equal" : "Not Equal";
    }

    public static String concatUsingJoin(String str1, String str2, String str3) {
        return String.join(", ",str1,str2,str3);
    }

    public static String[] splitString(String str) {
        return str.split(",");
    }

    public static void splitStringWithLimit(String str,int limit) {
        String[] arr = str.split(";",limit);
        for(String s : arr) {
            System.out.print(s + " ");
        }
    }

    public static int firstOccurrence(String str, char ch) {
        return str.indexOf(ch);
    }

//    public static void firstOccurrenceWithSubstring(String str1, String str2, int index) {
//        int i = str1.indexOf(str2.charAt(0));
//        System.out.println(str1.substring(index,i));
//    }

    public static String convertToLowercase(String str) {
        return str.toLowerCase();
    }

    public static String convertToUppercase(String str) {
        return str.toUpperCase();
    }

    public static String printString(int num) {
        return String.valueOf(num);
    }

}
