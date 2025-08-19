package in.co.nmsworks.week3.day1.da2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompleCollection {
    public static void main(String [] args) {
        Map<String, List<Integer []>> cityToTemp=new HashMap<>();
        List<Integer[]> chennai=new ArrayList<>();
        chennai.add(new Integer[]{22,32});
        chennai.add(new Integer[]{23,33});
        chennai.add(new Integer[]{24,34});

        cityToTemp.put("chennai",chennai);
        List<Integer[]> trichy=new ArrayList<>();
        trichy.add(new Integer[]{23,23});
        trichy.add(new Integer[]{24,23});
        trichy.add(new Integer[]{26,23});

        cityToTemp.put("trichy",trichy);

        List<Integer[]> thindivanam=new ArrayList<>();
        thindivanam.add(new Integer[]{23,23});
        trichy.add(new Integer[]{24,23});
        trichy.add(new Integer[]{26,23});

        cityToTemp.put("thindivanam",thindivanam);

        List<Integer[]> villupuram=new ArrayList<>();
        villupuram.add(new Integer[]{22,32});
        villupuram.add(new Integer[]{23,33});
        villupuram.add(new Integer[]{24,34});


        List<Integer[]> put = cityToTemp.put("villupuram", villupuram);

        System.out.println("temperature list for chennai : "+cityToTemp.get(chennai));




    }
}
