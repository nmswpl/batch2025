package in.co.nmsworks.week3.set1;

public class ConvertTitleCase {
    public void convertTitleCase(String str) {
        String result = "";
        String string1[] = str.split(" ");
        for(int i = 0;i<string1.length;i++)
        {
            String singleWord = string1[i];
            String firstLetter = singleWord.substring(0,1).toUpperCase();
            String remainingLetters = singleWord.substring(1).toLowerCase();
            result = result + firstLetter + remainingLetters+" ";
        }
        System.out.println(result.trim());
    }

    public static void main(String[] args) {
        ConvertTitleCase convertCase = new ConvertTitleCase();

        convertCase.convertTitleCase("The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.");

    }
}



