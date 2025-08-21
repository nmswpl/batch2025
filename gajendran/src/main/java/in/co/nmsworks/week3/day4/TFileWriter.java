package in.co.nmsworks.week3.day4;

import javax.xml.stream.events.DTD;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TFileWriter implements Writer{
    @Override
    public void open()
    {
        System.out.println("Open function Called in T File Writer");
    }

    @Override
    public void getWrite(List<Trainee> data)
    {
        String filePath = "/home/nms-training/Documents/FileOfOddIdTrainee";
        if ((data.getFirst().getId() % 2 ) == 0){
            filePath = "/home/nms-training/Documents/FileOfEvenIdTrainee";
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
        {
            for (Trainee tempOfData : data) {
                writer.write(tempOfData.getId()+","+tempOfData.getName()+","+tempOfData.getDept());
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void close()
    {
        System.out.println("close function Called in T file Writer");
    }
}
