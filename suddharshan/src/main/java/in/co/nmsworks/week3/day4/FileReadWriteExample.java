package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {

        FileReadWriteExample frwe = new FileReadWriteExample();

        //frwe.writeToFile("/tmp/myinfo.txt","My name is Suddharshan. I am from Villupuram. ");
        //frwe.readFromFile("/tmp/myinfo.txt");

        //frwe.writeToFile("/tmp/myinfo.txt","I Studied at MIT, Chennai. I am from IT dept. ");
        //frwe.readFromFile("/tmp/myinfo.txt");

        frwe.writeUsingBuffer("/tmp/mynewinfo.txt","My name is Suddharshan. \n I am from Villupuram. \n ");
        frwe.readUsingBuffer("/tmp/mynewinfo.txt");

        frwe.writeUsingBuffer("/tmp/mynewinfo.txt","I Studied at MIT, Chennai. \n I am from IT dept. \n");
        frwe.readUsingBuffer("/tmp/mynewinfo.txt");


    }

    private void readFromFile(String filename) {
        try (FileReader fr = new FileReader(filename)){
            int ch;
            while((ch = fr.read()) != -1){
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeToFile(String filename, String text) {
        try (FileWriter fw = new FileWriter(filename,true)){
            fw.write(text);
            System.out.println("Content is Written in file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readUsingBuffer(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String res = "", data;
            while((data = br.readLine()) != null){
                res += data;
            }
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeUsingBuffer(String filename, String text){
         try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename,true))){
             bw.write(text);
             bw.flush();
         }
         catch(Exception e){
             e.printStackTrace();
         }
    }
}
