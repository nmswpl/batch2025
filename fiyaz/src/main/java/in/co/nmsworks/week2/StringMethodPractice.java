package in.co.nmsworks.week2;



public class StringMethodPractice {
    public static void main(String args[]) {

        takeStringindex("NMSWorks", 5);
        printLength("OpenAI");
        extractAndprint("Java Programming", 5);
        extractAndprint1("Welcome to Java", 11, 15);
        checkThestring("Java Programming", "Prog");

        equalString("Hello", "hello");
        isEmpty(" ");
        concatString("Hello", "World");
        replaceChar("banana");
        equalIgnoring("hello", "HELLO");
        stringArray("one,two,three");
        limetSubstring("apple;banana;cherry;date");
        occurrenceChar("programming");
        findsubstring("welcome to the world", "the", 10);


    }

    private static void findsubstring(String w, String t, int i) {
        String str = w.substring(10);
        if(str.contains(t)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    private static void occurrenceChar(String p) {
        for (int i=0; i<p.length(); i++) {
            if(p.charAt(i) == 'g') {
                System.out.println(i);
            }
        }
    }

    private static void limetSubstring(String s) {
        String strarr[] = s.split(s,3);
        for (String s1 : strarr) {
            System.out.println(s1);
        }
    }

    private static void stringArray(String s) {
        String strarr[] = s.split(",");
        for (String s1 : strarr) {
            System.out.println(s1);
        }
    }

    private static void equalIgnoring(String h0, String h1) {
        System.out.println(h0.equalsIgnoreCase(h1));
    }

    private static void replaceChar(String b) {
        String temp = " ";
        for (int i=0; i<b.length(); i++) {
            if(b.charAt(i) == 'a') {
                temp = temp + 'o';
            }
            else {
                temp = temp + b.charAt(i);
            }
        }
        System.out.println(temp);
    }

    private static void concatString(String h, String w) {
        System.out.println(h.concat(w));
    }

    private static void isEmpty(String s) {
        if(s.isEmpty()) {
            System.out.println("Empty");
        }
        else {
            System.out.println("Not Empty");
        }

    }

    private static void equalString(String h, String h1) {
        if(h.equals(h1)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }

    public static void takeStringindex(String s, int n) {
        System.out.println(s.indexOf(5));
    }

    public static void printLength(String s) {
        System.out.println(s.length());
    }

    public static void extractAndprint(String s, int n ){
        System.out.println(s.substring(5));
    }
    public static void extractAndprint1(String s, int n, int n1){
        System.out.println(s.substring(11,15));
    }
    public static void checkThestring(String s, String s1) {

        if (s.contains(s1)) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }

    }



}