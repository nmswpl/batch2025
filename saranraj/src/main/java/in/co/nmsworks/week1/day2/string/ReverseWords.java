package in.co.nmsworks.week1.day2.string;

public class ReverseWords {

    public static void main(String[] args) {

        String str = "India is my country";
        printReverseWord(str);

    }
    private static void printReverseWord(String word)
    {

        String [] splitWords = word.split(" ");
        int left = 0; int right = splitWords.length-1;
        while(left < right)
        {
            String temp = splitWords[left];
            splitWords[left] = splitWords[right];
            splitWords[right] = temp;
            left++;
            right--;
        }
        for(String printWord : splitWords)
        {
            System.out.print(printWord + " ");
        }
    }
}
