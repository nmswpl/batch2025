package in.co.nmsworks.week3.day2;

import org.w3c.dom.Node;

import java.util.*;

public class MapPractise {

//    public static void main(String[] args) {
//        Map<String, Integer> map1 = new HashMap<>();
//        System.out.println(map1.put("Mahalakshmi",1));
//        System.out.println(map1.put("Mahalakshmi",2));
//        map1.put("Nandhini",2);
//        map1.put("Ananthy",3);
//        map1.put("Ranjitha",4);
//        System.out.println(map1);
//
////        System.out.println(map1.get("Mahalakshmi"));
//        Integer id = map1.get("Mahalakshmi");
//        System.out.println(id);
//
//        id = map1.get("India");
//        System.out.println(id);
//
//        Boolean contains = map1.containsKey("India");
//        System.out.println(contains);
//
//        Boolean contains1 = map1.containsKey("Mahalakshmi");
//        System.out.println(contains1);
//
//        System.out.println(map1.remove("Mahalakshmi"));
//        System.out.println(map1.keySet());
//
//        System.out.println(map1.values());
//        for (Map.Entry<String, Integer> stringIntegerEntry : map1.entrySet()) {
//            System.out.println(stringIntegerEntry.getKey());
//            System.out.println(stringIntegerEntry.getValue());
//            stringIntegerEntry.setValue(8);
//        }
//        System.out.println(map1);
//        System.out.println(map1.containsValue(8));
//
//        System.out.println(map1.put(null,10));
//        System.out.println(map1.replace(null,67));
//        map1.put(null,889);
//        System.out.println(map1);
//
//        map1.getOrDefault()
    public static void main(String[] args) {

    }

    public void printVehiclesWithTwoWheelers (Map<String , Integer> vehicle) {
        for (Map.Entry<String, Integer> stringIntegerEntry : vehicle.entrySet()) {
            if(stringIntegerEntry.getValue() == 2) {
                System.out.println(stringIntegerEntry.getKey() + " is a Two Wheeler");
            }
        }
    }

    public List<String> removeDuplicates(List<String> colors) {
        List<String> res = new ArrayList<>();
        for (String color : colors) {
            if(!res.contains(color)) {
                res.add(color);
            }
        }
        return res;
    }

    public List<String> printColorsFromIndex(List<String> colors,int start, int end) {
        return colors.subList(start, end+1);
    }

    public String printLongestColor(List<String> colors) {
        int max = Integer.MIN_VALUE;
        String res = "";
        for(int i = 0 ; i < colors.size() ; i++) {
            if(colors.get(i).length() > max) {
                max = Math.max(max, colors.get(i).length());
                res = colors.get(i);
            }
        }
        return res;
    }

    public void printColorAndOccurrence(List<String> colors) {
        Map<String,Integer> count = new HashMap<>();
        for (String color : colors) {
            count.put(color,count.getOrDefault(color,0) + 1);
        }
        System.out.println("Color\tOccurrence");
        for (Map.Entry<String, Integer> entry: count.entrySet()) {
            System.out.println(entry.getKey()+"\t\t"+ entry.getValue());
        }
    }

    public void mergeList1(List<String> list1, List<String> list2) {
        list1.addAll(list2);
        System.out.println("Merged list with list1 elements coming before list2 elements : "+ list1);
    }

    public ArrayList<String> mergeList2(List<String> list1, List<String> list2) {
        list1.addAll(list2);
        ArrayList<String> res = new ArrayList<>(list1);
        return res;
    }

    public void reverseLinkedList(List<String> llist) {
        int i = 0;
        int j = llist.size()-1;
        while(i < j) {
            Collections.swap(llist,i++,j--);
        }
        System.out.println(llist);
    }

    public List<Integer> oddListNumbers(List<Integer> num) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : num) {
            if(i % 2 != 0) {
                res.add(i);
            }
        }
        Collections.sort(res);
        return res;
    }

    public Map<String,Integer> printMapWithNames(List<String> names) {
        Set<String> nameSet = new HashSet<>();
        Map<String,Integer> res = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            if(!nameSet.contains(names.get(i))) {
                res.put(names.get(i),i);
                nameSet.add(names.get(i));
            }
        }
        return res;
    }

    public Set<String> printIntersectElements(Set<String> set1, Set<String> set2) {
        int n = Math.max(set1.size(),set2.size());
        Set<String> intersect = new HashSet<>();
        for (String s : set1) {
            if(set2.contains(s)) {
                intersect.add(s);
            }
        }
        return intersect;
    }

    public Map<String,Integer> mapWithNamesAndLetters(Map<String,Integer> map) {
        Map<String,Integer> result = new HashMap<>();
        for (String s : map.keySet()) {
           result.put(s,s.length());
        }
        return result;
    }

    public Map<String,String> replaceUnknown(Map<String,String> map) {
        Map<String,String> newMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(entry.getValue() == null) {
                newMap.put(entry.getKey(), "Unknown");
            }
            else {
                newMap.put(entry.getKey(),entry.getValue());
            }
        }
        return newMap;
    }
}
