package in.co.nmsworks.week3.day5.set1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Problem-6: Write a program to count the number of words in a given file countWords.txt
 * Hello, world! This is a test paragraph. It contains various punctuation marks: commas, periods, exclamation points, and question marks. How many words will be counted? Let's find out!
 *
 * In addition to punctuation, this paragraph also includes some numbers: 123, 456.7, and special characters like @, #, and $.
 *
 * The quick brown fox jumps over the lazy dog. This is a classic sentence used to display all the letters of the alphabet. It’s often used in typewriters and computer fonts to showcase typefaces.
 *
 * Programming languages such as Python, Java, and C++ are used to create software. Each language has its own syntax and rules, but they all serve the purpose of making computers perform tasks.
 *
 * Testing edge cases is important: consider phrases like "hello-world," "it's a test," and "one-two-three." These examples help ensure the word count algorithm works correctly under various conditions.
 */

public class WordCounter {
    public static void main(String[] args) {

        WordCounter wordCounter = new WordCounter();
        wordCounter.printWordCount();

    }

    private void printWordCount() {
        try(BufferedReader br = new BufferedReader( new FileReader("/home/nms-training/Downloads/countWords.txt")))
        {
            String line;
            int wordCount = 0;
            while ((line = br.readLine()) != null){
                wordCount += line.split(" ").length;
            }
            System.out.println("Word Count From countWord.txt file : "+wordCount);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
