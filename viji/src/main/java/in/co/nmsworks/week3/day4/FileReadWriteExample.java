package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {

        FileReadWriteExample frwe = new FileReadWriteExample();

        frwe.writeToFile("/tmp/myInfo.txt","My name is Vijayalakshmi. I am from Kallakurichi. " );
        frwe.readFromFile("/tmp/myInfo.txt");

        frwe.writeToFile( "/tmp/myInfo.txt","I Studied  at University college of Engineering villupuram");
        frwe.readFromFile("/tmp/myInfo.txt");

        frwe.writeToFileBuffered("/tmp/myInfo.txt","I Like to Play Badminton." );
        frwe.readFromFileBuffered("/tmp/myInfo.txt");

        frwe.writeToFileBuffered( "/tmp/myInfo.txt","I Like to play carrom.");
        frwe.readFromFileBuffered("/tmp/myInfo.txt");



    }


    public void readFromFile(String fileName) {
         try(FileReader fr = new FileReader(fileName)){
             int ch ;
             while((ch = fr.read()) != -1){
                 System.out.print((char) ch);
             }

         } catch (IOException e) {
            e.printStackTrace();
         }

    }

    public  void writeToFile(String fileName ,String  text ) {

          try( FileWriter fw = new FileWriter(fileName , true)) {
              fw.write(text);
          }
          catch (IOException e) {
              e.printStackTrace();
          }


    }

    public void writeToFileBuffered(String fileName , String text){

        try( BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true ))){
            bw.write(text);
            bw.newLine();
            bw.flush();

        } catch (Exception e) {
           e.printStackTrace();
        }

    }

    public void readFromFileBuffered(String fileName) {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line ;
            while( ( line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
