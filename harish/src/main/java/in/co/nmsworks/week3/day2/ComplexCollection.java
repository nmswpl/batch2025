package in.co.nmsworks.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexCollection {
    private static Map<String,List<Integer[]>> cityToTempList = new HashMap<>();
    public static void main(String[] args) {
        List<Integer[]> chennaiTempList = new ArrayList<>();
        Integer[] day1 = new Integer[]{10,35};
        Integer[] day2 = {15,25};
        Integer[] day3 = {14,35};
        chennaiTempList.add(day1);
        chennaiTempList.add(day2);
        chennaiTempList.add(day3);

        List<Integer[]> trichyTempList = new ArrayList<>();
        Integer[] ls2Day1 = {10,35};
        Integer[] ls2Day2 = {15,25};
        Integer[] ls2Day3 = {14,35};
        trichyTempList.add(ls2Day1);
        trichyTempList.add(ls2Day2);
        trichyTempList.add(ls2Day3);

        List<Integer[]> villupuramTempList = new ArrayList<>();
        Integer[] ls3Day1 = {10,35};
        Integer[] ls3Day2 = {15,25};
        Integer[] ls3Day3 = {14,35};
        villupuramTempList.add(ls3Day1);
        villupuramTempList.add(ls3Day2);
        villupuramTempList.add(ls3Day3);


        List<Integer[]> ls4 = new ArrayList<>();
        Integer[] ls4Day1 = {10,35};
        Integer[] ls4Day2 = {15,25};
        Integer[] ls4Day3 = {14,35};
        ls4.add(ls4Day1);
        ls4.add(ls4Day2);
        ls4.add(ls4Day3);


        cityToTempList.put("Chennai",chennaiTempList);
        cityToTempList.put("Tindivanam",trichyTempList);
        cityToTempList.put("Trichy",chennaiTempList);
        cityToTempList.put("Villupuram",villupuramTempList);


        System.out.println(cityToTempList.get("Chennai").get(0)[1]);
        Integer[] int2 = new Integer[50];
        int2 = cityToTempList.get("Chennai").get(0);
        System.out.println(int2[0]);

        String s = "harish";
        String v = "harish";
        if (s == v){
            System.out.println("Harii");
        }

        s = "kabi";
        System.out.println(v);

    }
}
