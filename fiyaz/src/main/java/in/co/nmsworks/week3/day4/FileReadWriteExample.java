package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {

        FileReadWriteExample frwe = new FileReadWriteExample();

        frwe.writeToFile("/tmp/myinfo.txt","I'm Fiyaz Mohamed, coming from Salem");
        frwe.readFromFile("/tmp/myinfo.txt");

        frwe.writeToFile("/tmp/myinfo.txt","I study in CSC dept from MIT");
        frwe.readFromFile("/tmp/myinfo.txt");

        FileReadWriteExample bfrwe = new FileReadWriteExample();

        bfrwe.bwriteToFile("/tmp/Bmyinfo.txt","I love coding,So i like java");
        bfrwe.breadToFile("/tmp/Bmyinfo.txt");

    }

    private void breadToFile(String filename) {

        try (BufferedReader br = new BufferedReader((new FileReader(filename)))) {
            String line ;
            while ((line = br.readLine()) != null) {
                System.out.print(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private void bwriteToFile(String fileName, String text) {

        try (BufferedWriter bw = new BufferedWriter((new FileWriter(fileName)))) {
            bw.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private void readFromFile(String fileName) {

        try (FileReader fr = new FileReader(fileName)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private void writeToFile(String fileName, String text) {


        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}
