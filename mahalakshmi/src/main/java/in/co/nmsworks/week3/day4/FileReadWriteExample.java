package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) throws IOException {
        FileReadWriteExample frwe = new FileReadWriteExample();
//        frwe.writeToFile("/tmp/myInfo.txt","My name is Mahalakshmi.\nI am from Villupuram.");
//        frwe.readFromFile("/tmp/myInfo.txt");
//        frwe.writeToFile("/tmp/myInfo.txt","I am studied in University College of Engineering Villupuram.\nI am from CSE department");
//        frwe.readFromFile("/tmp/myInfo.txt");
        frwe.writeToFileUsingBUffer("/tmp/myInfo.txt","My name is Mahalakshmi. I am from Villupuram.");
        frwe.readFromFileUsingBuffer("/tmp/myInfo.txt");
        frwe.writeToFileUsingBUffer("/tmp/myInfo.txt","I am studied in University College of Engineering Villupuram. I am from CSE department");
        frwe.readFromFileUsingBuffer("/tmp/myInfo.txt");

    }

    private void readFromFileUsingBuffer(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String ch = br.readLine();
            System.out.println(ch);
        }
    }

    private void writeToFileUsingBUffer(String fileName, String text) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(text);
            bw.newLine();
            bw.flush();
        }

    }

    public void readFromFile(String FileName) throws IOException {
        try (FileReader fr = new FileReader(FileName)) {
            int ch;
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
        }
    }

    public void writeToFile(String fileName, String text) throws IOException {
        try (FileWriter fw = new FileWriter(fileName, false)) {
            fw.write(text);
        }
    }


}
