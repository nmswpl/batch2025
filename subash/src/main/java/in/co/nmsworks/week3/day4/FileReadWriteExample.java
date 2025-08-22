package in.co.nmsworks.week3.day4;

import java.io.*;

public class FileReadWriteExample {

   public static void main(String[] args) {

       FileReadWriteExample frwe = new FileReadWriteExample();

       String filename="/tmp/myinfo.text";
       frwe.toWrite(filename,"My Name is Subash");

       frwe.readFromFile(filename);

       frwe.toWrite(filename," Am From Vallam,Nice to meet you");

       frwe.readFromFile(filename);

       frwe.writeUsingBuffer(filename,"My Dog name is Mathi","His Fav food is Pedigree");

       frwe.readUsingBuffer(filename);

    }

    private void readUsingBuffer(String filename)
    {
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String res;

           while((res=br.readLine()) !=null)
           {
               System.out.print(res);
           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void writeUsingBuffer(String filename,String text,String text1)
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename,false))) {

            bw.write(text);
            bw.newLine();
            bw.write(text1);
//            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void toWrite(String filename, String text)
    {

        try (FileWriter fw = new FileWriter(filename,true)) {

            fw.write(text);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void readFromFile(String filename)
    {
        try (FileReader fr = new FileReader(filename)) {

            int ch;
            while((ch= fr.read())!=-1)
            {
                System.out.print((char)ch);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
