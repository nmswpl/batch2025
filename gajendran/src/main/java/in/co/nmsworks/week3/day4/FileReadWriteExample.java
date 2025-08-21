package in.co.nmsworks.week3.day4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample
{


    public static void main(String[] args)
    {
        FileReadWriteExample fRWE = new FileReadWriteExample();

        fRWE.writeToFile("/tmp/myInfo.txt","My Name Is Gsjendran I'm From Madurai");
        fRWE.readFromFile("/tmp/myInfo.txt");


        fRWE.writeToFile("/tmp/myInfo.txt"," I studied at MIT Chennai");
        fRWE.readFromFile("/tmp/myInfo.txt");
    }

    private void readFromFile(String fileName)
    {
        try (FileReader reader = new FileReader(fileName))
        {
            int ch;
            System.out.println("Content in File"+fileName);
            while ((ch = reader.read()) != -1)
            {
                System.out.print((char) ch);
            }
            System.out.println("\n");
        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeToFile(String fileName, String text)
    {
        try (FileWriter writer = new FileWriter(fileName, false))
        {
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
