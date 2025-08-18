package in.co.nmsworks.week2.exam.set1;

public class TestRunner {
    public static void main(String[] args) {
        new TestRunner().convertTitleCase("java programming hello world");
        new TestRunner().printIntern();
    }

    public  int  printIntern() {

    }

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

}
