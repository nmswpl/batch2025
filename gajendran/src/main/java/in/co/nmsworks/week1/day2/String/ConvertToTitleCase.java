package in.co.nmsworks.week1.day2.String;

public class ConvertToTitleCase {

    public static void printWordInTitleCase(String str){
        String[] strArray = str.toLowerCase().trim().split(" ");

        for (String temp : strArray){

            System.out.print(Character.toTitleCase(temp.charAt(0)) + temp.substring(1) + " ");

        }

    }


    public static void main(String[] args) {

        printWordInTitleCase("the quick brown fox jumps over the lazy a dog");

    }

}
