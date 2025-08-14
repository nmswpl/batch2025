package in.co.nmsworks.week1.test;

public class WordSearch {
    public static void searchWordInAString(String input, String word){
        String[] arr = input.split(" ");
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i].contains(word)){
                System.out.println("Word found at Position: " + input.indexOf(arr[i].charAt(0)));
                System.out.println("First character of the word: " + arr[i].charAt(0));
                System.out.println("Last character of the word: " + arr[i].charAt(arr[i].length()-1));
            }
        }
    }
    public static void main(String[] args) {
        String input = "Java is a popular programming language.";
        String word = "popular";
        searchWordInAString(input,word);
    }
}
