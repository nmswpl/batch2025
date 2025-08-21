package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        FileReadWriteExample frwe = new FileReadWriteExample();
        String infoFile = "/tmp/myInfo";
        frwe.writeToFile(infoFile,"My name is Harish, And I am from Kallakurichi");
        frwe.readFromFile(infoFile);
        frwe.writeToFile(infoFile,"And I studied from the UCE-BIT and completed the IT department ");
        frwe.readFromFile(infoFile);
        frwe.writeToFileUsingBuffer(infoFile,"AND HE IS AN TALENTED WRITER");
        frwe.readFromFileUsingBuffer(infoFile);
    }

    private void readFromFileUsingBuffer(String infoFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(infoFile))) {
            String name;
            while ((name = bufferedReader.readLine()) != null) {
                System.out.println(name);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeToFileUsingBuffer(String infoFile, String test) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(infoFile,true))) {
            bufferedWriter.write(test);
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void readFromFile(String filename) {
        try(FileReader fileReader = new FileReader(filename)) {
            int ch;
            String sentence = "";
            int i = 0;
            while((ch = fileReader.read()) != -1){
                System.out.println(i++);
                sentence = sentence + (char)ch;
            }
            System.out.println("Text in the file : " + sentence);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void writeToFile(String fileName, String test) {
        try (FileWriter fileWriter = new FileWriter(fileName,true)) {

            fileWriter.write(test);
        }
        catch (FileNotFoundException fe){
            throw new RuntimeException(fe);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
