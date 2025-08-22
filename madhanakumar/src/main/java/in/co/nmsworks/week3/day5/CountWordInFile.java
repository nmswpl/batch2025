package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountWordInFile {
    public static void main(String[] args) {
        CountWordInFile countWordInFile = new CountWordInFile();
        countWordInFile.countWords("/home/nms-training/Documents/CountWords.txt");
    }

    private void countWords(String filename) {
        int wordCount = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s +");
                wordCount += words.length;
            }
            System.out.println(wordCount);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
