package in.co.nmsworks.week3.day2;

import java.util.*;

public class ComplexCollection {
    static Map<String, List<Integer[]>> cityToTempList = new HashMap<>();

    public static void main(String[] args) {
      List<Integer[]> chennaiTempList = new ArrayList<>();
      List<Integer[]> trichyTempList = new ArrayList<>();
      List<Integer[]> tindivanamTempList = new ArrayList<>();
      List<Integer[]> villupuramTempList = new ArrayList<>();

      Integer[] integer1 = new Integer[]{1,2,4};
      Integer[] integer2 = new Integer[]{2,4,8};
      Integer[] integer3 = new Integer[]{4,6,9};
      Integer[] integer4 = new Integer[]{10,23,45,};

      chennaiTempList.add(integer1);
      trichyTempList.add(integer2);
      tindivanamTempList.add(integer3);
      villupuramTempList.add(integer4);


      cityToTempList.put("Chennai",chennaiTempList);
      cityToTempList.put("Trichy", trichyTempList);
      cityToTempList.put("Tindivanam", tindivanamTempList);
      cityToTempList.put("Villuppuram",villupuramTempList);

      System.out.println(cityToTempList);

    }
}
