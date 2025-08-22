package in.co.nmsworks.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexCollection {

    static Map<String,List<Float[]>> cityToTempList = new HashMap<>();
    public static void main(String[] args) {

        List<Float[]> chnTempList = new ArrayList<>();
        chnTempList.add(new Float[]{23.3f , 24.4f});
        chnTempList.add(new Float[]{24.3f , 25.4f});
        chnTempList.add(new Float[]{26.3f , 24.4f});
        cityToTempList.put("chennai",chnTempList);

        List<Float[]> tryTempList = new ArrayList<>();
        tryTempList.add(new Float[]{23.3f , 24.4f});
        tryTempList.add(new Float[]{24.3f , 25.4f});
        tryTempList.add(new Float[]{26.3f , 24.4f});

        cityToTempList.put("trichy",tryTempList);


    }
}
