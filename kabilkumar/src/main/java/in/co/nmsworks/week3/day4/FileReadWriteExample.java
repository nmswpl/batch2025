package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample
{
    public static void main(String[] args)
    {
        FileReadWriteExample frwe = new FileReadWriteExample();
        frwe.writeToFile("/tmp/myInfo.txt","this is java programs ");
        frwe.readTOFile("/tmp/myInfo.txt");
        frwe.writeToFile("/tmp/myInfo.txt ","This is Kabilkumar  ");

        frwe.readUsingBuffer("/tmp/myInfo.txt");
        frwe.writeUsingBuffer("/tmp/myInfo.txt","name is kabil");
    }
    private  static void  writeToFile(String fileName , String txt)
    {
        try (FileWriter fw = new FileWriter(fileName,true))
        {
            fw.write(txt);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private  void readTOFile(String fileName)
    {

        try (FileReader fr = new FileReader(fileName)){

        int ch;
        String getSentense = "";
        while ((ch = fr.read()) != -1)
        {
            getSentense = getSentense + (char)ch;
        }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  void  readUsingBuffer(String fileName)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public  void  writeUsingBuffer(String fileName ,String txt)
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)))
        {
            bw.write(txt);
           bw.newLine();
            bw.write("success");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
