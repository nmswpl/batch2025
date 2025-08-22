package in.co.nmsworks.week3.day5;

import java.awt.image.ImageProducer;
import java.util.*;

public class Student {
    public static void main(String[] args) {
        trackingStudentGrades();
    }

    private static void trackingStudentGrades() {
        int arr1[] = new int[]{85,90,88};
        int arr2[] = new int[]{90,91,92};
        int arr3[] = new int[]{70,75,80};
        int avg1 = 0;
        int avg2 = 0;
        int avg3 = 0;
        int marks1 = 0;
        int marks2 = 0;
        int marks3 = 0;
        for (int i=0;i<arr1.length;i++)
        {

            marks1 = marks1 + arr1[i];
            avg1 = marks1/arr1.length;
        }
        for (int i=0;i<arr2.length;i++)
        {

            marks2 = marks2 + arr2[i];
            avg2 = marks2/ arr2.length;
        }
        for (int i=0;i<arr3.length;i++)
        {

            marks3 = marks3 + arr3[i];
            avg3 = marks3/ arr3.length;
        }
        System.out.println(avg1);
        System.out.println(avg2);
        System.out.println(avg3);
        Map<String,Integer> map = new HashMap<>();
        map.put("John",avg1);
        map.put("Alice",avg2);
        map.put("Bob",avg3);
        System.out.println(map);
        int highestAvg = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(highestAvg < entry.getValue())
            {
                highestAvg = entry.getValue();
            }
        }
        System.out.println("Highest average: "+highestAvg);
//        Map<String,Integer[]> map = new LinkedHashMap<>();
//       List<Integer[]> list = new ArrayList<>();
//       map.put("John",new Integer[]{85,90,88});
//       map.put("Alice",new Integer[]{90,91,92});
//       map.put("Bob",new Integer[]{70,75,80});
//        System.out.println(map);
    }
}
