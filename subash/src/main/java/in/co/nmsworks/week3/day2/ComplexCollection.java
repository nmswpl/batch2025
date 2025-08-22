package in.co.nmsworks.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexCollection {

    private static Map<String,List<Integer[]>> cityToTempList = new HashMap<>();


    public static void main(String[] args) {

        List<Integer[]> chennaiTempList=new ArrayList<>();
        chennaiTempList.add(new Integer[]{29,30});

        List<Integer[]> trichyTempList=new ArrayList<>();
        trichyTempList.add(new Integer[]{31,32});

        List<Integer[]> villuTempList=new ArrayList<>();
        villuTempList.add(new Integer[]{33,34});

        List<Integer[]> dinTempList=new ArrayList<>();
        dinTempList.add(new Integer[]{35,36});

        cityToTempList.put("Chennai",chennaiTempList);
        cityToTempList.put("Trichy",trichyTempList);
        cityToTempList.put("Villupuram",villuTempList);
        cityToTempList.put("Dindivanam",dinTempList);

        System.out.println(cityToTempList);



    }

}
