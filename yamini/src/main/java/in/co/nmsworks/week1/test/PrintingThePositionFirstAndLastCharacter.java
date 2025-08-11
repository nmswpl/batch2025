package in.co.nmsworks.week1.test;
public class PrintingThePositionFirstAndLastCharacter {
    public static void main(String[] args) {
        printTheResult("Java is a popular programming language","Popular");
    }

    public static void printTheResult(String input,String word) {
        int index=input.indexOf(word.toLowerCase());
        System.out.println("Word found at index: "+index);
        System.out.println("First character of the word: "+input.charAt(index));
        //System.out.println(word.charAt(word.length()-1));
        for(int i=word.length()-1;i>=0;i--){
            System.out.println("Last character of the word:  "+word.charAt(i));
            break;
        }
    }
}
