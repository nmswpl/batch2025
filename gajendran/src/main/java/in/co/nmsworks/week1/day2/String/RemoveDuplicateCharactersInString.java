package in.co.nmsworks.week1.day2.String;

public class RemoveDuplicateCharactersInString {


    public static String findUniqueValues(String word){

        String answer = "";
        int len = word.length();
        for (int i = 0; i < len; i++){
            if(! answer.contains(""+word.charAt(i))) {
                answer += word.charAt(i);
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        String word = "Gajendran";
        System.out.println(findUniqueValues(word));

    }

}
