package in.co.nmsworks.week1.day2.string;
//Given a string str, write a Java program to print all words with even length in the given
//string.
public class EvenLength {
    public static void printInEvenLength(String str){
        String[] arr = str.split(" ");
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i].length() % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        String str = "This is a java language";
        printInEvenLength(str);
    }
}
