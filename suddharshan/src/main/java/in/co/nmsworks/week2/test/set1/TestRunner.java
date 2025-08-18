package in.co.nmsworks.week2.test.set1;

public class TestRunner {

    public static void main(String[] args) {
        String sentence = "this is simple question";
        System.out.println(getTitleCase(sentence));;
    }
    public static String getTitleCase(String sentence){
        String arr[] = sentence.split(" ");
        String result = " ";
        for(int i = 0; i < arr.length;i++){
            result += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1) + " ";
        }
        return result;
    }
}
