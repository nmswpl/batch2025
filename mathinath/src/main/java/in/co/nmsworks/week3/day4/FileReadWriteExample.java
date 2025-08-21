package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) throws IOException {
        FileReadWriteExample frwe = new FileReadWriteExample();
//        frwe.writeToFile("/tmp/myInfo.txt","My name is Mathi,\nI am from salem");
//        frwe.readFromFile("/tmp/myInfo.txt");
//        frwe.writeToFile("/tmp/myInfo.txt","\ni stuided in bit campus and i am from Salem");
//        frwe.readFromFile("/tmp/myInfo.txt");

        frwe.writeUsingBuffer("/tmp/myInfo.txt","My name is Vimal,I am from trichy");
        frwe.readUsingBuffer("/tmp/myInfo.txt");
        frwe.writeUsingBuffer("/tmp/myInfo.txt","My name is Kanna,I am from Salem");
        frwe.readUsingBuffer("/tmp/myInfo.txt");
    }

    private void readUsingBuffer(String filename) throws FileNotFoundException {

        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String line;
            while((line = br.readLine()) != null )
            {
                System.out.println(line);
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeUsingBuffer(String filename, String file) throws IOException {
        try ( BufferedWriter br = new BufferedWriter(new FileWriter(filename,true))){
           br.write(file);
           br.flush();
           br.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void readFromFile(String fileName) throws IOException {
        try (FileReader fr = new FileReader(fileName)){

            int ch;
            while ((ch = fr.read()) != -1)
            {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    private void writeToFile(String fileName, String text) throws IOException {
        FileWriter fw = new FileWriter(fileName,true);
        fw.write(text);
        fw.close();

    }

}
