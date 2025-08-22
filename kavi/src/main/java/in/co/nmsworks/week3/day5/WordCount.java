package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String filePath = "/home/nms-training/Downloads/countWords.txt";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                    }
                }
            }

            System.out.println("Total words" + wordCount);
        } catch (IOException e) {
            System.out.println("File not found or error reading file");
        }
    }
}

