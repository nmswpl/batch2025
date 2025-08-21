package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {

        FileReadWriteExample frwe = new FileReadWriteExample();
        frwe.writeToFile("/tmp/myinfo.txt","My name is Tharun. I am From Kallakurichi");
        frwe.readFromFile("/tmp/myinfo.txt");

        frwe.writeToFile("/tmp/myinfo.txt","I am studied Information Technology at  UCET ");
        frwe.readFromFile("/tmp/myinfo.txt");

        System.out.println("--------------Buffer Reader--------------");
        frwe.writeUsingBuffer("/tmp/myinfo.txt","My name is Tharun. I am From Kallakurichi");
        frwe.readUsingBuffer("/tmp/myinfo.txt");

        frwe.writeUsingBuffer("/tmp/myinfo.txt","I am studied Information Technology at  UCET ");
        frwe.readUsingBuffer("/tmp/myinfo.txt");

    }

    private void readUsingBuffer(String fileName) {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null){
                System.out.print(line);
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeUsingBuffer(String fileName, String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(text);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readFromFile(String fileName) {

        try(FileReader fr = new FileReader(fileName)){
            int ch;
            while((ch = fr.read())!= -1){
                System.out.print((char)ch);
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public void writeToFile(String fileName, String text) {

        try(FileWriter fw = new FileWriter(fileName,false)){
            fw.write(text);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
