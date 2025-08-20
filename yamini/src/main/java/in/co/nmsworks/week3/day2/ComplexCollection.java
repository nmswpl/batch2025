package in.co.nmsworks.week3.day2;

import java.util.*;
import java.util.List;

public class ComplexCollection {
    public static void main(String[] args) {

        List<Integer[]>chList=new ArrayList<>();
        List<Integer[]> trList =new ArrayList<>();
        List<Integer[]>dinList=new ArrayList<>();
        List<Integer[]> villList =new ArrayList<>();
        chList.add(new Integer[]{70,100});
        chList.add(new Integer[]{60,110});
        chList.add(new Integer[]{80,130});

        trList.add(new Integer[]{60,130});
        trList.add(new Integer[]{70,100});
        trList.add(new Integer[]{75,110});




        cityToTempList.put("Chennai",chList);
        cityToTempList.put("Trichy", trList);
        cityToTempList.put("Dindivanam",dinList);
        cityToTempList.put("Villupuram", villList);
        System.out.println(cityToTempList);

    }

   static Map<String, List<Integer[]>> cityToTempList=new HashMap<>();

}
