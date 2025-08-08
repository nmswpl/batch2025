package in.co.nmsworks.week1.day2.string.First;

public class PrintWords {

    static void printWordsLen(){
        String input="this is java language";
        String[] words=input.split(" ");
        System.out.println("output : ");

        for(String word :words){
            if(word.length()%2==0){
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        printWordsLen();
    }
}
