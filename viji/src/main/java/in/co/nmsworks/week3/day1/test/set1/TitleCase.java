package in.co.nmsworks.week3.day1.test.set1;

public class TitleCase {
    public static void main(String[] args) {
        String str = "THE quick brown fox jumped over the lazy dog.";
        firstLetterCapital(str);
    }
    public static void firstLetterCapital(String input){
        String[] str = input.split(" ");
        String result = "";
        for(int i=0 ; i<str.length ; i ++ ){
            result += str[i].substring(0,1).toUpperCase() + str[i].substring(1).toLowerCase()+" ";
        }
        System.out.println(result);


    }
}
