package in.co.nmsworks.week3.day5;

import com.google.protobuf.MapEntry;

import java.util.*;

public class StudentAverageArray {
    public static void main(String[] args) {
        StudentAverageArray studentAverageArray = new StudentAverageArray();
        studentAverageArray.getHighestAverage();
    }

    private void getHighestAverage() {
        List<Integer> john = Arrays.asList(85,90,88);
        List<Integer> alice = Arrays.asList(90,91,92);
        List<Integer> bob = Arrays.asList(70,75,80);

        Map<String,List<Integer>> students = new LinkedHashMap<>();
        students.put("John",john);
        students.put("Alice",alice);
        students.put("Bob",bob);
        double highestAverage = 0.0;
        String topStudent = null;

        for (Map.Entry<String, List<Integer>> entry : students.entrySet()){
            String name = entry.getKey();
            List<Integer> grades = entry.getValue();
            int sum = 0;
            for (Integer grade : grades) {
                sum += grade;
            }
            double average = sum / grades.size();
            System.out.println(name+" => "+" Average : "+average);

            if (average > highestAverage){
                highestAverage = average;
                topStudent = name;
            }
        }

        System.out.println("Highest Average : "+topStudent+" ("+highestAverage+")");
    }
}
