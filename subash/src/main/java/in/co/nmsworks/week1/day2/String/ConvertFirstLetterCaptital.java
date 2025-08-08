package in.co.nmsworks.week1.day2.String;

public class ConvertFirstLetterCaptital {

    public static void main(String[] args) {

        String sentence="the quick brown fox jumps over the lazy dog";
        convertToCapital(sentence);
    }
    public static void convertToCapital(String sentence)
    {
        String result="";
        String arr[]=sentence.split(" ");
        for(int i=0;i< arr.length;i++)
        {
            String word=arr[i];
            String firstltr = word.substring(0,1).toUpperCase();
            String lastltr = word.substring(1).toLowerCase();
            result+=firstltr+lastltr+" ";
        }
        String finalResult=result.trim();
        System.out.println(finalResult);
    }
}
