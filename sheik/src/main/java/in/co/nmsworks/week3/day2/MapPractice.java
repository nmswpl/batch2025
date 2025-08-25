package in.co.nmsworks.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapPractice
{
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        map1.put("Fayas" , 1);
        map1.put("Sheik" , 2);
        map1.put("Ram" , 3);
        map1.put("Gokul" ,3);
        map1.put("Ragul" , 4);

        System.out.println(map1);
        Integer id = map1.get("Fayas");
        System.out.println(id);
        id= map1.get("India");
        System.out.println(id);
        Boolean contains = map1.containsKey("India");
        System.out.println(contains);
        map1.remove("Fayas");
        System.out.println(map1);

        map1.remove("Gokul" , 4);
        System.out.println(map1);

        System.out.println(map1.keySet());
        System.out.println(map1.size());
        System.out.println(map1.isEmpty());

        System.out.println(map1.values());

        for (Map.Entry<String, Integer> stringIntegerEntry : map1.entrySet()) {
           // System.out.println(stringIntegerEntry.setValue(7));

        }
        System.out.println(map1.values());

        System.out.println(map1);

        map1.replace("Gokul" , 0);
        System.out.println(map1);

        map1.putIfAbsent("Kumar" , 6);
        System.out.println(map1);

        System.out.println(map1.getOrDefault("Kumar" ,8));
        System.out.println(map1);

        System.out.println(map1.containsValue(6));

        map2.putAll(map1);
        System.out.println("map2" + map2);

        map1.put("null" ,9);
        map1.put("null" ,9);

        System.out.println(map1);









    }
}
