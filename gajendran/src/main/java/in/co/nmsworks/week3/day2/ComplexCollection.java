package in.co.nmsworks.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexCollection {

    static Map<String, List<Integer[]>> cityToTemp = new HashMap<>();

    public static void main(String[] args) {


        List<Integer[]> temp = new ArrayList<>();
        Integer[] tempInteger = new Integer[] {22,23};

        temp.add(tempInteger);



        cityToTemp.put("Chennai", new ArrayList<>());
        cityToTemp.put("Tindivanam", new ArrayList<>());
        cityToTemp.put("Villupuram", new ArrayList<>());
        cityToTemp.put("Trichy", new ArrayList<>());





    }

}
