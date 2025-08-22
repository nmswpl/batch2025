package in.co.nmsworks.week3.day5;

public class WordCount {

    public static void printWordCount() {
        int wordCount=0;
        String para = " Hello, world! This is a test paragraph. It contains various punctuation marks: commas, periods, exclamation points, and question marks. How many words will be counted? Let's find out!\n" +
                " \n" +
                "In addition to punctuation, this paragraph also includes some numbers: 123, 456.7, and special characters like @, #, and $.\n" +
                " \n" +
                "The quick brown fox jumps over the lazy dog. This is a classic sentence used to display all the letters of the alphabet. It’s often used in typewriters and computer fonts to showcase typefaces.\n" +
                " \n" +
                "Programming languages such as Python, Java, and C++ are used to create software. Each language has its own syntax and rules, but they all serve the purpose of making computers perform tasks.\n" +
                " \n" +
                "Testing edge cases is important: consider phrases like \"hello-world,\" \"it's a test,\" and \"one-two-three.\" These examples help ensure the word count algorithm works correctly under various conditions.";
        para.toLowerCase();
        for(int i=0; i<para.length();i++){
            char ch=para.charAt(i);
            wordCount++;
        }
        System.out.println("Total Word count is : "+ wordCount);

    }

    public static void main(String[] args) {
        printWordCount();

    }
}
