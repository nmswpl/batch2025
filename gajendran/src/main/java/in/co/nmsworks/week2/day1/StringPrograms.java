package in.co.nmsworks.week2.day1;

public class StringPrograms {

    public static void printIndex(String word,int index){
        System.out.println(word.charAt(index));
    }
    public static void printLength(String word){
        System.out.println(word.length());
    }
    public static void printSubstring(String word, int start){
        System.out.println(word.substring(start));
    }
    public static void printSubstringWithStartAndEnd(String word, int start, int end){
        System.out.println(word.substring(start,end));
    }

    public static void printCheckSubstringContains(String word,String check){
        if(word.contains(check)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }

    public static void printStringJoin(String[] str){
        String a = "";
        a = String.join(",", "apple","banana","cherry");
        System.out.println(a);
    }

    public static void isStringEqual(String str1, String str2){
        System.out.println(str1.equals(str2));
    }

    public static void isStringEqualInIgnoringCase(String str1, String str2){
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    public static void printReplacesAllOccurrences(String str1,char  oldLetter, char newLetter){
        System.out.println(str1.replace(oldLetter,newLetter));
    }

    public static void printConcatGivenString(String str1, String str2){
        System.out.println(str1.concat(str2));
    }

    public static void printEmptyString (String word){
        if(!word.isEmpty()){
            System.out.println("Not Empty");
        }
        else {
            System.out.println("Empty");
        }
    }


    public static void printSubStringUsingSplit(String str1){
        String[] temp = str1.split(";");
        for(String i : temp){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void printSubStringUsingSplitWithLimit(String str1, int limit){
        String[] temp = str1.split(",",limit);
        for(String i : temp){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void printFirstOccurrence(String str, char check){
        System.out.println(str.indexOf(check));
    }

    public static void printFirstOccurrenceWithIndex(String str, String  check, int startIndex){
        System.out.println(str.indexOf(check,startIndex));
    }

    public static void printStringInLowerCase(String str1){
        System.out.println(str1.toLowerCase());
    }

    public static void printStringInUpperCase(String str1){
        System.out.println(str1.toUpperCase());
    }

    public static void printConvertsOfIntToString(int value){
        System.out.println(String.valueOf(value));
    }







    public static void main(String[] args) {


    printIndex("NMSWorks", 5);
    printLength("OpenAI");
    printSubstringWithStartAndEnd("Welcome to Java",11,15);
    printSubstring("Java Programming",5);
    printCheckSubstringContains("Java Programming","Prog");
    printStringJoin(new String[]{"apple", "banana", "cherry"});
    isStringEqual("hello", "Hello");
    isStringEqualInIgnoringCase("hello", "Hello");
    printSubStringUsingSplit("one,two,three");
    printSubStringUsingSplitWithLimit("apple;banana;cherry;date",3);
    printFirstOccurrence("programming",'g');
    printFirstOccurrenceWithIndex("welcome to the world","the",10);
    printStringInLowerCase("Java Programming");
    printStringInUpperCase("welcome to Java");
    printConvertsOfIntToString(1234);
    printEmptyString(" ");
    printReplacesAllOccurrences("banana",'a','o');
    printConcatGivenString("Hello","World");



    }

}
