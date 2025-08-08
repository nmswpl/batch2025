package in.co.nmsworks.week1.day2.string;

/**
 * . Write a program to reverse words in a Sentence.
 * Input : India is my country.
 * Output:      country my is India.
 */
public class ReverseString {
    static void printReverseString(String value){
        String [] arrayValue=value.split(" ");
        String result="";
        for(int i=0 ;i<arrayValue.length;i++){
            result+=arrayValue[arrayValue.length-i-1]+" ";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        printReverseString("India is my country ");
    }
}
