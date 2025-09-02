package in.co.nmsworks.week5.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewClass
{
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        map.put("fayas" ,list);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(map);

    }
}
