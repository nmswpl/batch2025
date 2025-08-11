package in.co.nmsworks.week1.test;

public class FindWord {
    public static void main(String[] args) {
        String sentence = "Java is a popular programming language";
        String word = "popular";
        getWordPos(sentence, word);
    }
    public static void getWordPos(String sentence, String word){
        String arr[] = sentence.split(" ");
        int index = 0, flag = 0, pos;
        for(int i = 0; i < arr.length;i++){
            if(arr[i].equalsIgnoreCase(word)){
                System.out.println("Word found at index: " + index);
                System.out.println("First Character is: " + arr[i].substring(0,1));
                System.out.println("Last Character found is: " + arr[i].substring(arr[i].length()-1,arr[i].length()));
                flag = 1;
            }
            pos = arr[i].length()+1;
            index += pos;
        }
        if(flag == 0){
            System.out.println("Word is not found");
        }
    }
}
