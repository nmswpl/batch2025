package in.co.nmsworks.week3.day4;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

class TFileWriter implements Writer{
    BufferedWriter br;
    @Override
    public void open() {

        try {
            br = new BufferedWriter(new FileWriter("/tmp/employee.csv"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void write(List<Trainee>trainees) throws IOException {
        String line = "";
        for (Trainee trainee : trainees) {
            line=trainee.getId()+trainee.getName()+trainee.getDept();
        }
        br.write(line);

    }

    @Override
    public void close() throws IOException {
         br.close();
    }
}
