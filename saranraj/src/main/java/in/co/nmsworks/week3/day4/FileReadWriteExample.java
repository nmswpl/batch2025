package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        FileReadWriteExample frwe = new FileReadWriteExample();
        frwe.writeToFile("/tmp/myinfo.txt", "My name is Saran Raj. I am from Tindivanam.");
        frwe.readFromFile("/tmp/myinfo.txt");

        frwe.writeToFile("/tmp/myinfo.txt", " I studied at University college of engineering,Tindivanam and My department is Information Technology.");
        frwe.readFromFile("/tmp/myinfo.txt");

//        frwe.writeUsingBuffer("/tmp/myinfo.txt", "My name is Saran Raj. I am from Tindivanam.");
//        frwe.readUsingBuffer("/tmp/myinfo.txt");

        frwe.writeUsingBuffer("/tmp/myinfo.txt", " I studied at University college of engineering,Tindivanam  and My department is Information Technology .");
        frwe.readUsingBuffer("/tmp/myinfo.txt");
    }

    private void readUsingBuffer(String fileName) {
        try (BufferedReader bw = new BufferedReader(new FileReader(fileName))) {
            String ch;
            String word = "";
            while ((ch = bw.readLine()) != null) {
                word += ch;
            }
            System.out.println(word);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeUsingBuffer(String fileName, String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(text);
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readFromFile(String fileName) {
        try (FileReader fr = new FileReader(fileName)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile(String fileName, String text) {
        try (FileWriter fw = new FileWriter(fileName, false)) {

            char[] characters = text.toCharArray();

            fw.write(characters);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
