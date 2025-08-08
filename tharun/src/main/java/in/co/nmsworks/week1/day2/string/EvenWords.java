package in.co.nmsworks.week1.day2.string;

/**
 * Given a string str, write a Java program to print all words with even length in the given tring.
 * Input
 * : s = "This is a java language"
 * Output
 * : This
 * is
 * java
 * language
 */
public class EvenWords {

    static void  printEvenWords(String value){
        String [] wordArray=value.split(" ");
        for(int i=0;i< wordArray.length;i++){
            if((wordArray[i].length())%2==0){
                System.out.println(wordArray[i]);
            }
        }
    }
    public static void main(String[] args) {
        String i="This is a java language";
        printEvenWords(i);
    }
}
