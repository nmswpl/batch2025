package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample
{
    public static void main(String[] args) throws FileNotFoundException {
        FileReadWriteExample frwe = new FileReadWriteExample();
       // frwe.writeToFile("/tmp/myinfo.txt","My name is Fayas,Im from Trichy. ");
        //frwe.readFromFile("/tmp/myinfo.txt");
        //frwe.writeToFile("/tmp/myinfo.txt","I studied in UCE , It department");
        //frwe.readFromFile("/tmp/myinfo.txt");

        //frwe.bufferedWrite("/tmp/myinfo2.txt","My name is Fayas,Im from trichy. ");
        //frwe.bufferedRead("/tmp/myinfo2.txt");


    }

    /*public void bufferedWrite(String fileName , String txt) throws FileNotFoundException {
        try(BufferedWriter bw = new BufferedWriter(new TraineeFileWritter(fileName));){
            bw.write(txt);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void bufferedRead(String file){
        try(BufferedReader br = new BufferedReader(new FileReader(file));){
            String line ;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void readFromFile(String file) throws FileNotFoundException{
        try(FileReader fr = new FileReader(file)){
            int ch ;
            while((ch=fr.read())!=-1){
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public void writeToFile(String fileName, String txt) throws FileNotFoundException {
        try (TraineeFileWritter fw = new TraineeFileWritter(fileName ,false);){
            fw.write(txt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     */
}
