package in.co.nmsworks.week3.day5;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

    public static void main(String[] args) {

        CountWords cw = new CountWords();

        String filename = "/home/nms-training/Downloads/countWords.txt";
        cw.printNumberOfWords(filename);
    }

    private void printNumberOfWords(String filename) {

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;
            int count = 0;
            while((line = br.readLine()) != null){
                String[] words = line.replace(',',' ').split(" ");
                for (String word : words) {
                    count++;
                }
            }
            System.out.println("Number of Words are : " + count);
        }

        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
