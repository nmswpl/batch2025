package in.co.nmsworks.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexCollection {

    private static HashMap<String, List<Float[]>> cityToTempList = new HashMap<>();

    public static void main(String[] args) {

        List<Float[]> chnTempList = new ArrayList<>();
        chnTempList.add(new Float[]{31.2f,30f,33.4f,35f});
        chnTempList.add(new Float[]{31.2f,30f,33.4f,35f});
        chnTempList.add(new Float[]{31.2f,30f,33.4f,35f});
        cityToTempList.put("Chennai",chnTempList);

        cityToTempList.put("Thindivanam",new ArrayList<>());
        cityToTempList.put("Villupuram",new ArrayList<>());
        cityToTempList.put("Trichy",new ArrayList<>());

//       cityToTempList.values().add(new Float[]{30.2f,236.7f,33.4f,34.5f});

    }
}
