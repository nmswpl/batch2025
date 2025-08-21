package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample
{
    public static void main(String[] args)
    {
       FileReadWriteExample frwe = new FileReadWriteExample();

       /*frwe.writeToFile("/tmp/MyInfo.txt", "My Name is Ashik, I am From Nagercoil. ");
       frwe.readFromFile("/tmp/MyInfo.txt");

       frwe.writeToFile("/tmp/MyInfo.txt", "I Graduated From UCE - Villupuram, I Was From Computer Science Department. ");
       frwe.readFromFile("/tmp/MyInfo.txt");*/

        frwe.writeUsingBufferToFile("/tmp/MyInfo.txt", "My Name is Ashik, I am From Nagercoil. ");
        frwe.readUsingBufferFromFile("/tmp/MyInfo.txt");

       frwe.writeUsingBufferToFile("/tmp/MyInfo.txt", "I Graduated From UCE - Villupuram, I Was From Computer Science Department. ");
       frwe.readUsingBufferFromFile("/tmp/MyInfo.txt");

    }

    private void readUsingBufferFromFile(String fileName)
    {
        try ( BufferedReader br = new BufferedReader(new FileReader(fileName)) )
        {
            String content;
            while ((content = br.readLine()) != null)
            {
                System.out.println(content);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void writeUsingBufferToFile(String fileName, String text)
    {
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)) )
        {
            bw.write(text);
            bw.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void readFromFile(String fileName)
    {
        try( FileReader fr = new FileReader(fileName))
        {
            int c;
            String content = "";
            while ( ( c = fr.read() ) != -1 )
            {
                content += (char) c;
            }
            System.out.print(content);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void writeToFile(String fileName, String text)
    {
        try( FileWriter fw = new FileWriter(fileName))
        {
            char[] chArr = text.toCharArray();
            fw.write(chArr);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }



}
