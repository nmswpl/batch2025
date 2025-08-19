package in.co.nmsworks.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        System.out.println(map1.put("Suddharshan", 1));
        System.out.println(map1.put("Suddharshan", 2));
        System.out.println(map1);
        System.out.println(map1.get("Suddharshan"));
        Integer id = map1.get("Suddharshan");
        System.out.println(id);
        id = map1.get("India");
        System.out.println(id);
        System.out.println(map1.containsKey("India"));
        boolean b = map1.containsKey("Suddharshan");
        System.out.println(b);
        map1.put("Hari",1);
        map1.put("Krishna", 3);
        map1.put("Ram", 4);
        map1.put("Gokul", 2);
        map1.put("Radha", 5);
        System.out.println(map1);
        map1.remove("Suddharshan");
        System.out.println(map1);
        System.out.println(map1.remove("Hari",6));
        System.out.println(map1);
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println(map1.entrySet());
        map1.replace("Ravi",9);
        System.out.println(map1);
        map1.replace("Hari",10,12);
        System.out.println(map1);
        System.out.println(map1.putIfAbsent("Sathiish",15));
        System.out.println(map1);
        System.out.println(map1.getOrDefault("Sathish",10000));
        map1.put("Sankar",null);
        System.out.println(map1);
        System.out.println(map1.getOrDefault("Sankar",-1));
        map1.put(null,55);
        System.out.println(map1);
        map1.put(null,99);
        System.out.println(map1);
    }
}
