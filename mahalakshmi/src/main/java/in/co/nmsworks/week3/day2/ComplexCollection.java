package in.co.nmsworks.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexCollection {
    private static Map<String, List<Float[]>> cityWiseTempArr = new HashMap<>();

    public static void main(String[] args) {

        List<Float[]> vpmList = new ArrayList<>();
        vpmList.add(new Float[]{21.4f,24.6f});
        vpmList.add(new Float[]{27.4f,29.6f});
        vpmList.add(new Float[]{24.2f,26.8f});
        cityWiseTempArr.put("Villupuram",vpmList);

        List<Float[]> chennaiList = new ArrayList<>();
        chennaiList.add(new Float[]{24.5f,32.6f});
        chennaiList.add(new Float[]{24.8f,31.4f});
        chennaiList.add(new Float[]{25.7f,26.3f});
        cityWiseTempArr.put("Chennai",chennaiList);

        List<Float[]> trichyList = new ArrayList<>();
        trichyList.add(new Float[]{25.7f,26.3f});
        trichyList.add(new Float[]{20.7f,22.3f});
        trichyList.add(new Float[]{29.7f,30.3f});
        cityWiseTempArr.put("Trichy",trichyList);

        List<Float[]> tindivanamList = new ArrayList<>();
        trichyList.add(new Float[]{29.7f,30.3f});
        trichyList.add(new Float[]{25.7f,26.3f});
        trichyList.add(new Float[]{29f,30f});
        cityWiseTempArr.put("Tindivanam",tindivanamList);

        System.out.println(cityWiseTempArr);
    }
}
