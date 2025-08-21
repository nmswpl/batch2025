package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {

    public static void main(String[] args) {
        FileReadWriteExample frwe = new FileReadWriteExample();
        String filePath = "/tmp/myinfo.txt";
        frwe.writeToFile(filePath, "my name is kavi ");
        frwe.readFromFile(filePath);
        frwe.writeToFile(filePath, "I from thanjavur ");
        frwe.readFromFile(filePath);
        frwe.writeUsingBuffer(filePath, "my name is kavi");
        frwe.readUsingBuffer(filePath);

        frwe.writeUsingBuffer(filePath, "I from thanjavur");
        frwe.readUsingBuffer(filePath);
    }


    private void writeToFile(String filename, String text) {
        try (FileWriter fw = new FileWriter(filename, true)) { // true = append mode
            fw.write(text);
            System.out.println("Written to file (normal): " + text.trim());
        } catch (IOException e) {
            System.out.println("Error writing to file (normal): " + e.getMessage());
        }
    }

    // ✅ Read from file using FileReader (no buffer)
    private void readFromFile(String filename) {
        System.out.println("Reading from file (normal):");
        try (FileReader fr = new FileReader(filename)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); // Reads character by character
            }
            System.out.println(); // new line after reading
        } catch (IOException e) {
            System.out.println("Error reading from file (normal): " + e.getMessage());
        }
    }


    private void writeUsingBuffer(String filename, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(text);
            System.out.println("Written to file" + text.trim());
        } catch (IOException e) {
            System.out.println("Error writing to file" + e.getMessage());
        }
    }


    private void readUsingBuffer(String filename) {
        System.out.println("Reading from file");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file " + e.getMessage());
        }
    }
}
