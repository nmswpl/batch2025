package in.co.nmsworks.week3.day4;

import javax.sound.midi.Track;
import java.io.*;

public class FileReadWriteExample
{


    public static void main(String[] args)
    {
        FileReadWriteExample fRWE = new FileReadWriteExample();

        fRWE.writeToFile("/tmp/myInfo.txt","My Name Is Gsjendran I'm From Madurai");
        fRWE.readFromFile("/tmp/myInfo.txt");


        fRWE.writeToFile("/tmp/myInfo.txt"," I studied at MIT Chennai");
        fRWE.readFromFile("/tmp/myInfo.txt");

        System.out.println();
        System.out.println("Buffer : \n");
        fRWE.writeToFileUsingBuffer("/tmp/myInfo.txt","My Name Is Gsjendran I'm From Madurai");
        fRWE.readFromFileUsingBuffer("/tmp/myInfo.txt");

        fRWE.writeToFileUsingBuffer("/tmp/myInfo.txt"," I studied at MIT Chennai");
        fRWE.readFromFileUsingBuffer("/tmp/myInfo.txt");
    }

    private void readFromFileUsingBuffer(String fileName)
    {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)))
        {
            String s;
            System.out.println();
            while( (s = bufferedReader.readLine()) != null){
                System.out.print(s);
            }
        }catch (Exception e){
            System.out.println("Error : "+e.toString());;
        }
    }

    private void writeToFileUsingBuffer(String fileName, String text)
    {
        try (BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(fileName, true))) {
            bufferWriter.write(text);
            bufferWriter.flush();
        }catch (Exception e)
        {
            System.out.println("Error : "+e.toString());
        }
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
