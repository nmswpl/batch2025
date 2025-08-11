package in.co.nmsworks.test;

public class WordSearch {
    public static void searchWordInAString(String input, String word){
        String[] arr = input.split(" ");
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i].contains(word)){
                System.out.println("Position: " + i);
            }
        }
    }
    public static void main(String[] args) {
        String input = "Java is a popular programming language.";
        String word = "popular";
        searchWordInAString(input,word);
    }
}
