package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        FileReadWriteExample fileReadWriteExample = new FileReadWriteExample();
//        fileReadWriteExample.writeToFile("/tmp/myInfo.txt","My name is Monkey.D.Luffy. ");
//        fileReadWriteExample.readFromFile("/tmp/myInfo.txt");
//        fileReadWriteExample.writeToFile("/tmp/myInfo.txt","I'm gonna be the King of Pirates");
//        fileReadWriteExample.readFromFile("/tmp/myInfo.txt");

        fileReadWriteExample.writeToFileBuffer("/tmp/bufferMyInfo.txt","The salesman gave us a demo of the new vacuum cleaner.");
        fileReadWriteExample.readFromFileBuffer("/tmp/bufferMyInfo.txt");
    }

    private void readFromFileBuffer(String filename) {
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void writeToFileBuffer(String filename, String text) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(text);
            bw.newLine();
            bw.flush();
            bw.write(text);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void readFromFile(String fileName) {
        try(FileReader fr = new FileReader(fileName)) {
            int ch;
            while ((ch = fr.read()) != -1){
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void writeToFile(String fileName, String text) {
        try(FileWriter fw = new FileWriter(fileName,false)){
            fw.write(text);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
