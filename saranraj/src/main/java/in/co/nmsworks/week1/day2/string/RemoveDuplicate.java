package in.co.nmsworks.week1.day2.string;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str = "aabbcc";
        printRemovedWord(str);
    }

    private static void printRemovedWord(String originalWord) {
        String removedWord = "";
        for(int i = 0;i < originalWord.length(); i++){
            char ch = originalWord.charAt(i);
            if(removedWord.indexOf(ch) == -1){
                removedWord += ch;
            }
        }
        System.out.println(removedWord);
    }
}
