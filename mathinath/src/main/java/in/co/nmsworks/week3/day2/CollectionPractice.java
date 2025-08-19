package in.co.nmsworks.week3.day2;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Car",4);
        map.put("Bike",2);
        map.put("Bus",4);
        map.put("Cycle",2);
        map.put("Plane",3);
        map.put("Jeep",4);
        map.put("Ship",0);
        map.put("Auto",3);
        map.put("Boat",0);
        map.put("Helicopter",0);
        new CollectionPractice().printVehicleName(map);
        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");
        list1.add("Yellow");
        list1.add("Green");
        list1.add("Blue");
        new CollectionPractice().removeDuplicate(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Blue");
        list2.add("Yellow");
        list2.add("Orange");
       new CollectionPractice().extractAndPrintColors(list2);
       new CollectionPractice().printLongestColorName(list2);
       List<String> l3 = new ArrayList<>();
       l3.add("red");
       l3.add("green");
       l3.add("blue");
       l3.add("yellow");
       l3.add("green");
       l3.add("blue");
       l3.add("green");
        Map<String,Integer> map2 = new HashMap();
        new CollectionPractice().printColorAndTimes(l3,map2);

        List<String> listmerge1 = Arrays.asList("Red", "Green", "Blue");
        List<String> listmerge2 = Arrays.asList("Yellow", "Black", "White");
        new CollectionPractice().mergeList(listmerge1,listmerge2);

        List<String> newList1 = new LinkedList<>();
        newList1.add("Mathi");
        newList1.add("Madan");
        newList1.add("Subash");
        new CollectionPractice().printReverseList(newList1);
        new CollectionPractice().mergeTwoObjects(listmerge1,listmerge2);

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(23);
        listInteger.add(30);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        new CollectionPractice().printListEvenRemoved(listInteger);

        List<String> names = new ArrayList<>();
        names.add("Mathi");
        names.add("Subash");
        names.add("Madan");
        names.add("Mathi");
        names.add("Madan");
        new CollectionPractice().printConvertCollection(names);

        Set<String> instance1 = new HashSet<>();
        instance1.add("Mathi");
        instance1.add("Madan");
        instance1.add("Subash");
        Set<String> instance2 = new HashSet<>();
        instance2.add("Mathi");
        instance2.add("Madan");
        System.out.println(  new CollectionPractice().printIntersection(instance1,instance2));

        Map<String,Integer> mapQues7 = new HashMap<>();
        mapQues7.put("Mathi",20);
        mapQues7.put("Subash",30);
        mapQues7.put("Madan",25);
        System.out.println(new CollectionPractice().printNamesNoOfLetters(mapQues7));

        System.out.println(new CollectionPractice().printNullReplaced());
    }

    private Map<String,String> printNullReplaced() {
        Map<String,String> map = new HashMap<>();
        map.put("Mathi","one");
        map.put("Subash",null);
        map.put("Madan","three");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            map.replace(entry.getKey(),null,"unknown");
        }
        return map;
    }

    private Map<String,Integer> printNamesNoOfLetters(Map<String, Integer> mapQues7) {
        Map<String,Integer> nameAndLetters = new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : mapQues7.entrySet()) {
            nameAndLetters.put(stringIntegerEntry.getKey(),stringIntegerEntry.getKey().length());
        }
        return nameAndLetters;
    }

    private Set<String> printIntersection(Set<String> instance1, Set<String> instance2) {
        Set<String> finalIntersection = new HashSet<>();
        for (String string : instance1) {
            if (instance2.contains(string))
            {
                finalIntersection.add(string);
            }
        }
        return finalIntersection;
    }

    private void printConvertCollection(List<String> names) {
        Set<String> namesInSet = new HashSet<>();
        Map<String,Integer> map = new HashMap<>();
        for (String name : names) {
            System.out.println(name);
            namesInSet.add(name);
            map.put(name, names.indexOf(name));
        }
        System.out.println(namesInSet);
        System.out.println(map);
    }

    private void printListEvenRemoved(List<Integer> listInteger) {
        List<Integer> evenInteger = new ArrayList<>();
        for (Integer i : listInteger)
        {
            if(i%2 == 0)
            {
                continue;
            }
            evenInteger.add(i);
        }
        System.out.println(evenInteger);
        Collections.sort(evenInteger);
        System.out.println(evenInteger);


    }

    private void mergeTwoObjects(List<String> listmerge1, List<String> listmerge2) {
        List<String> thirdList = new ArrayList<>();
        thirdList.addAll(listmerge1);
        thirdList.addAll(listmerge2);
        System.out.println(thirdList);

    }

    private void printReverseList(List<String> newList1) {
        System.out.println(newList1.reversed());
    }

    private void mergeList(List<String> listmerge1, List<String> listmerge2) {
       List<String> resultList = new ArrayList<>();
       resultList.addAll(listmerge1);
       resultList.addAll(listmerge2);
        System.out.println(resultList);
    }

    private void printColorAndTimes(List<String> l3, Map<String, Integer> map2) {
       for (String color : l3)
       {
           System.out.println(color);
//           map2.put(color,1);
           if (map2.containsKey(color))
           {
//               System.out.println(map2.get(color)+1);
               map2.put(color,map2.get(color)+1);
           }
           else
           {
               map2.put(color,1);
           }
       }
        System.out.println(map2);

    }


    private void printLongestColorName(List<String> list2) {
        String longest = "";
        for(String i : list2)
        {
            if(i.length() > longest.length())
            {
                longest = i;
            }
        }
        System.out.println("The Longest color name: "+longest);
    }

    private void extractAndPrintColors(List<String> list2) {
        System.out.println(list2.subList(1,4));
    }

    private void removeDuplicate(List<String> list1) {
       List<String> anotherList = new ArrayList<>();
        for (String i : list1)
        {
           if(anotherList.contains(i))
           {
               continue;
           }
           else
           {
               anotherList.add(i);
           }
        }
        System.out.println(anotherList);

    }

    private void printVehicleName(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> i : map.entrySet()) {
            if(i.getValue()==2)
            {
                System.out.println(i.getKey()+" is a two wheeler");
            }
        }
    }
}
