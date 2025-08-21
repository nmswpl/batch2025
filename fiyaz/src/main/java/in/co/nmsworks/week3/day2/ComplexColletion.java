package in.co.nmsworks.week3.day2;

import java.util.*;

public class ComplexColletion {

    public static void main(String[] args) {
        List<Integer[]> list = new ArrayList<>();
        Integer[] arrChennai = new Integer[]{30,22,-1};
        Integer[] arrTrichy = new Integer[]{28,22,10};
        Integer[] arrTindivanam = new Integer[]{20,18,10};
        Integer[] arrViluppuram = new Integer[]{30,25,10};

        list.add(arrChennai);
        list.add(arrTrichy);
        list.add(arrTindivanam);
        list.add(arrViluppuram);

        Map<String,List<Integer[]>> cityToTempList = new HashMap<>();

        cityToTempList.put("Chennai", Collections.singletonList(arrChennai));
        cityToTempList.put("Trichy", Collections.singletonList(arrTrichy));
        cityToTempList.put("Tindivanam", Collections.singletonList(arrTindivanam));
        cityToTempList.put("Viluppuram", Collections.singletonList(arrViluppuram));


        System.out.println(cityToTempList.values());





    }
}
