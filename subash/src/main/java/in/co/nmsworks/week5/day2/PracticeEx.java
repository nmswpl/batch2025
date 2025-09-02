package in.co.nmsworks.week5.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeEx
{
    public static void main(String[] args) {


        Map<String, List<Integer>> map = new HashMap<>();

        List<Integer> listOnt = new ArrayList<>();
        map.put("name",listOnt);

        System.out.println(map);

        listOnt.add(1);
        listOnt.add(2);
        listOnt.add(3);

        System.out.println(map);
    }
}
