package in.co.nmsworks.week2.day1;

public class StringPrograms {
    public static void main(String[] args) {
        System.out.println(findIndex("NMSWorks"));
        System.out.println(findLength("OpenAI"));
        System.out.println(findSubString("Java Programming"));
        System.out.println(findSubStringWithEnd("Java Programming"));
        containsSubstring("Java Programming", "Java");
        System.out.println(joinArray(new String[] {"apple","banana","mango"}));
        equalString("Happy","happy");
        isEmpty("Hello");
        isEmpty(" ");
        System.out.println(concateString("Hello","World"));
        System.out.println(replaceChars("banana"));
        equalStringWithIgnoreCase("Hello","hellO");
        splitStrings("apple,banana,mango");
        splitStringsWithLimit("apple;banana;mango;watermelon");
        System.out.println(findPosition("programming"));
        System.out.println(findIndexSubstring("Welcome to the world","world"));
        System.out.println(toLower("HELLO"));
        System.out.println(toUpper("hello"));
        System.out.println(toString(123));

    }
    public static String findIndex(String s){
        String str = String.valueOf(s.charAt(5));
        return str;
    }
    public static int findLength(String str){
        return str.length();
    }
    public static String findSubString(String str){
        return str.substring(5);
    }
    public static String findSubStringWithEnd(String str){
        return str.substring(5, 7);
    }
    public static void containsSubstring(String s1, String s2){
        boolean found = s1.contains(s2);
        if(found){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
    public static String joinArray(String [] arr){
        String str = String.join(",", arr);
        return str;
    }
    public static void equalString(String s1, String s2){
        if(s1.equals(s2)) {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
    public static void isEmpty(String s){
        if(s.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not empty");
        }
    }
    public static String concateString(String s1, String s2){
        return s1.concat(s2);
    }
    public static String replaceChars(String s){
        String str = s.replace('a','o');
        return str;
    }
    public static void equalStringWithIgnoreCase(String s1, String s2){
        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
    public static void splitStrings(String s){
        String [] arr = s.split(",");
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void splitStringsWithLimit(String s){
        String [] arr = s.split(";", 3);
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    public static int findPosition(String s){
        return s.indexOf('g');
    }
    public static int findIndexSubstring(String s1, String s2){
        return s1.indexOf(s2);
    }
    public static String toLower(String s){
        return s.toLowerCase();
    }
    public static String toUpper(String s){
        return s.toUpperCase();
    }
    public static String toString(int x){
        return String.valueOf(x);
    }
}
