package in.co.nmsworks.week2.test.set1;

public class TitleCase {

    public static void changeToTitleCAse(String input){
        input = input.toLowerCase();
        String[] words = input.split(" ");
        String result = "";

        for(int i=0; i<=words.length-1; i++){
            String s = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            result += s + " ";
        }
        System.out.println(result);
    }

}
