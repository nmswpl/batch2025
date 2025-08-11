package in.co.nmsworks.week2.day1;

public class PracticeProblems {
    public void characterAtIndex(String s, int index){
        System.out.println(s.charAt(index));
    }

    public void lengthOfString(String s){
        System.out.println(s.length());
    }

    public void printSubstring(String s){
        System.out.println(s.substring(5));
    }

    public void beginEndSubstring(String s){
        System.out.println(s.substring(11,15));
    }

    public void findSubstring(String s,String s1){
        if (s.contains(s1)){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    public void concatString(){
        System.out.println(String.join("," ,"apple","banana","cherry"));
    }

    public void compareString(String s, String s1){
        System.out.println(s.equals(s1));
    }

    public void checkEmpty(String s){
        if (s.isEmpty()){
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }

    public void stringConcat(String s, String s1){
        System.out.println(s.concat(s1));
    }

    public void replaceCharacter(String s){
        System.out.println(s.replace('a','o'));
    }

    public void compareIgnoreCase(String s, String s1){
        System.out.println(s.equalsIgnoreCase(s1));
    }

    public void splitString(String s){
        String [] s1 = s.split(",");
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
    }

    public void splitStringLimit(String s){
        String[] s1 = s.split(";",3);
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
    }

    public void occuranceSpecificChar(String s){
        System.out.println(s.indexOf('g'));
    }

    public void substringOccuranceIndex(String s){
        System.out.println(s.indexOf("the",10));
    }

    public void convertToLowerCase(String s){
        System.out.println(s.toLowerCase());
    }

    public void convertToUpperCase(String s){
        System.out.println(s.toUpperCase());
    }

    public void convertIntegerToString(int s){
        System.out.println(String.valueOf(s));
    }

    public static void main(String[] args) {
        PracticeProblems pp = new PracticeProblems();
        pp.characterAtIndex("NMSWorks",5);
        pp.lengthOfString("OpenAI");
        pp.printSubstring("Java programming");
        pp.beginEndSubstring("Welcome to Java");
        pp.findSubstring("Java Programming", "Prog");
        pp.concatString();
        pp.compareString("hello","Hello");
        pp.checkEmpty(" ");
        pp.stringConcat("Hello"," World");
        pp.replaceCharacter("banana");
        pp.compareIgnoreCase("hello","HELLO");
        pp.splitString("one,two,three");
        pp.splitStringLimit("apple;banana;cherry;date");
        pp.occuranceSpecificChar("programming");
        pp.substringOccuranceIndex("Welcome to the world");
        pp.convertToLowerCase("Java Programming");
        pp.convertToUpperCase("welcome to java");
        pp.convertIntegerToString(1234);
    }
}
