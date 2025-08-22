package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadErite {
    public static void main(String[] args) throws IOException {

        FileReadErite frw=new FileReadErite();
        frw.writetoFile("/tmp/myinfo.txt","i am logeswari.");
        frw.readFromFile("/tmp/myinfo.txt");
        frw.writetoFile("/tmp/myinfo.txt"," i from ariyalur");
        frw.readFromFile("/tmp/myinfo.txt");

        frw.writetoFile("/tmp/myinfo.txt","currently completed IT");
        frw.readFrombufferFile("/tmp/myinfo.txt");
        frw.writetoFile("/tmp/myinfo.txt","i from ariyalur");
        frw.readFrombufferFile("/tmp/myinfo.txt");
        frw.writetobufferFile("/tmp/myinfo.txt","world");

    }

    private void readFrombufferFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String ch;
            while ((ch = br.readLine()) != null) {
                System.out.println(ch);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writetobufferFile(String filename,String text) {
        try(BufferedWriter bw= new BufferedWriter(new FileWriter(filename,true))){
            bw.write("hello ");

            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private void readFromFile(String fileName) {
        try {
            FileReader fileReader=new FileReader(fileName);
            int ch;
            while ((ch=fileReader.read())!=-1){
                System.out.print((char) ch);

            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void writetoFile(String filename, String text) throws IOException {
        FileWriter fw=new FileWriter(filename,false);
        fw.write(text);
        fw.close();
    }
}
