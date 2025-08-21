package in.co.nmsworks.week3.day4;

import java.io.*;


public class FileReadWriteExample {
    public static void main(String[] args) throws FileNotFoundException {
        FileReadWriteExample frwe = new FileReadWriteExample();
        frwe.writeToFile("/tmp/myInfo.txt", "My name is Yamini. I'm fom Tiruvannamalai.");
        frwe.readFromFile("/tmp/myInfo.txt");
        frwe.writeToFile("/tmp/myInfo.txt", "I have studied in UCE - BIT Campus");
        frwe.readFromFile("/tmp/myInfo.txt");

        frwe.writeUsingBuffer("/tmp/myInfo2.txt","Welcome to Java Files.");
        frwe.readUsingBuffer("/tmp/myInfo2.txt");
        frwe.writeUsingBuffer("/tmp/myInfo2.txt","This is write by buffer.");
        frwe.readUsingBuffer("/tmp/myInfo2.txt");

    }

    public void readFromFile(String fileName) throws FileNotFoundException {
        try (FileReader fr = new FileReader(fileName)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void writeToFile(String fileName, String text) throws FileNotFoundException {
        try (FileWriter fw = new FileWriter(fileName, false)) {
            fw.write(text);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeUsingBuffer(String fileName,String text) throws FileNotFoundException {
        try(BufferedWriter bwr=new BufferedWriter(new FileWriter(fileName,true))){
            bwr.write(text);
            bwr.newLine();
            bwr.flush();
            bwr.write(text);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    public void readUsingBuffer(String fileName) throws FileNotFoundException {
        try(BufferedReader brr=new BufferedReader(new FileReader(fileName))){

            String result;
            while ((result=brr.readLine())!=null){
                System.out.println(result);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
