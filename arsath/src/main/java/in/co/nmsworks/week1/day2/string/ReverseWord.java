package in.co.nmsworks.week1.day2.string;

public class ReverseWord {
    //Write a program to reverse words in a Sentence
    public static void reverse(String input){
        String end = "";
        if(input.charAt(input.length()-1) == '.') {
            end = ".";
            input = input.substring(0, input.length() - 1);
        }
            String[] arr = input.split(" ");

            String output = "";

            for(int i = arr.length-1; i>=0; i--){
                output += arr[i];
                if(i!=0){
                    output += " ";
                }
            }
            output += end;
            System.out.println(output);
    }
    public static void main(String[] args) {
        String input = "India is my country.";
        reverse(input);
    }
}
