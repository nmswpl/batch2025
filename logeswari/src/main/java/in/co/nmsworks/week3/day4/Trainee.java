package in.co.nmsworks.week3.day4;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Trainee {

    public Trainee(String s, String s1, String s2) {
    }


    public static void main(String[] args) {
        List<Trainee> traineeList=new ArrayList<>();
        Trainee trainee=new Trainee("1","logu","it");
        trainee.getFromFile("/home/nms-training/Downloads/employee.txt");
//        trainee.sortAndSave(traineeList);
        traineeList.add(trainee);

        System.out.println("value");
    }


    private Set<Trainee> getFromFile(String filename) {
        Set<Trainee> trainees=new HashSet<>();
        String line = "";
            try {
                BufferedReader br=new BufferedReader(new FileReader(filename));

                while ((line=br.readLine())!=null) {
                    String[] word = line.split(",");

                    trainees.add(new Trainee(word[0],word[1],word[2]));
                            System.out.println(line);
                }
            } catch (Exception e) {
               e.printStackTrace();
            }

        return trainees;
    }
    public void save(Writter writter,List<Trainee> trainees,String filename) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filename));

        List<Trainee> traineeList=new ArrayList<>();
        String sql="SELECT * FROM Trainee";
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps= connection.prepareStatement(sql)){
            try(ResultSet resultSet= ps.executeQuery()){
                while (resultSet.next()){
                    traineeList.add((Trainee) trainees);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void sortAndSave(List<Trainee> trainees){

        Set<Integer> see=new HashSet<>();
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        String sql="insert into Trainee values(?,?,?)";
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps= connection.prepareStatement(sql)){
            ResultSet resultSet = null;
                while (resultSet.next()){
                   if(resultSet.getInt(1)%2==0){

                       odd.add(resultSet.getInt(2));
                       even.add(resultSet.getInt(3));
                   }
                }
                ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
