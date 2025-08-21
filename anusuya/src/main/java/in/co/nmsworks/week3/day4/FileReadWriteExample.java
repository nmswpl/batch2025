package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {

    public static void main(String[] args) {

        FileReadWriteExample frwe = new FileReadWriteExample();

        frwe.writeToFile("/tmp/myinfo.txt","My name is Anusuya Devi. I am coming from Sankarankovil");
        frwe.readFromFile("/tmp/myinfo.txt");

        frwe.writeToFile("/tmp/myinfo.txt","I have completed my Bachelor's degree in the stream of Information Technology");
        frwe.readFromFile("/tmp/myinfo.txt");

        frwe.writeUsingBuffer("/tmp/myinfo.txt","I am working in NMSWorks");
        frwe.readUsingBuffer("/tmp/myinfo.txt");

        frwe.writeUsingBuffer("/tmp/myinfo.txt","Almost 1 month training is over!!");
        frwe.readUsingBuffer("/tmp/myinfo.txt");

    }

    private void writeToFile(String filename, String text) {

        try(FileWriter fw = new FileWriter(filename,true)) {
            fw.write(text);
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void readFromFile(String filename) {

        try(FileReader fr = new FileReader(filename)) {
            int ch;
            while((ch = fr.read()) != -1){
                System.out.print((char)ch);
            }
            System.out.println();
        }

        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeUsingBuffer(String filename, String text) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename,true))){
            bw.write(text);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void readUsingBuffer(String filename) {

        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
