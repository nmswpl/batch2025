package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TraineeFileWriter implements Writer
{
    private BufferedWriter bw;
    private FileWriter fw;
    private String fileName;

    public TraineeFileWriter()
    {}

    public TraineeFileWriter(String fileName)
    {
        this.fileName = fileName;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
        try
        {
            fw = new FileWriter(fileName);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void open()
    {
        bw = new BufferedWriter(fw);
    }

    @Override
    public void write(List<TraineePersister> trainees)
    {
        for (TraineePersister trainee : trainees)
        {
            String line = trainee.getId() + ", " + trainee.getName() + ", " + trainee.getDept();
            try
            {
                bw.write(line);
                bw.newLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void close()
    {
        try
        {
            fw.close();
            bw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
