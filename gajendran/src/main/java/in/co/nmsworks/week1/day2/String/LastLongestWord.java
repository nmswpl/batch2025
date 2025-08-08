package in.co.nmsworks.week1.day2.String;

public class LastLongestWord {

    public static String getLastLongestWord(String sentence){

        String[] temp = sentence.trim().split(" ");
        String answer = "";

        for (String i : temp){
            int lengthOfAnswer = Integer.parseInt(String.valueOf(answer.length()));
            int lengthOfIteratedString = Integer.parseInt(String.valueOf(i.length()));
            if (lengthOfIteratedString >= lengthOfAnswer){
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(getLastLongestWord("The quick brown fox jumps over the lazy dog"));

    }

}
