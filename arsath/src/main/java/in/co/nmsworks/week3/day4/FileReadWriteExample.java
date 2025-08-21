package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        FileReadWriteExample obj = new FileReadWriteExample();

//        obj.write("/tmp/myinfo.txt","My name is Arsath Ahamed.\nI am from Tiruppur.");
//        obj.readFromFile("/tmp/myinfo.txt");
//
//        obj.write("/tmp/myinfo.txt","\nI studied in UCE - Trichy.\nI studied Computer Science Engieering.");
//        obj.readFromFile("/tmp/myinfo.txt");

        obj.writeUsingBuffer("/tmp/myinfo.txt","\nI am working at NMSWorks Software.");
        obj.readUsingBuffer("/tmp/myinfo.txt");

        obj.writeUsingBuffer("/tmp/myinfo.txt","I am working as SWE Trainee.");
        obj.readUsingBuffer("/tmp/myinfo.txt");
    }

    private void write(String filename, String text) {
        try(FileWriter fw = new FileWriter(filename,true)){
            fw.write(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readFromFile(String filename) {
        try(FileReader fr = new FileReader(filename)){
            int ch;
            String ans = "";
            while((ch=fr.read())!=-1){
                ans += (char)ch;
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeUsingBuffer(String filename,String text) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename,true))){
            bw.write(text);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readUsingBuffer(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            String ans = "";
            while((line=br.readLine())!=null){
                ans+=line;
            }
            System.out.println(ans);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

}
