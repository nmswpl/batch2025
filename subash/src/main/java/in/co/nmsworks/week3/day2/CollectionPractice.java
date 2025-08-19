package in.co.nmsworks.week3.day2;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        CollectionPractice c=new CollectionPractice();

        c.printTwoWheelers();
        c.printColors();
        c.longestColorName();
        c.removeDuplicates();
        c.printFrequency();
        c.mergeList();
        c.reverseList();
        c.mergeTwoArrayList();
        c.removeEvenNumbersAndSortThem();
        c.removeDuplicatesAndMakeMap();
       Set<String> set =  c.intersectionOfSets();
        System.out.println("After Intersection "+set);
        System.out.println();
        Map<String,Integer> map= new HashMap<>();
        map = c.printNameAsKeyAndLenAsValue();
        System.out.println(map);
        System.out.println();
        Map<String,String> map1= new HashMap<>();
        map1=c.replaceNullValues();
        System.out.println(map1);

    }


    public void printTwoWheelers()
    {
        Map<String,Integer> map1=new HashMap<>();

        map1.put("Car",4);
        map1.put("Bike",2);
        map1.put("Bus",4);
        map1.put("Cycle",2);
        map1.put("Plane",3);
        map1.put("Jeep",4);
        map1.put("ship",0);
        map1.put("Auto",3);
        map1.put("Boat",0);
        map1.put("Helicopter",0);

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if(entry.getValue()==2)
                System.out.println(entry.getKey()+" is a Two Wheeler");
        }
        System.out.println();
    }

    public void printColors()
    {
        List<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("After Indexing : "+colors.subList(1,4));
        System.out.println();
    }


    public void longestColorName()
    {
        List<String> colors=new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        int max=0;
        String longest="";

        for (String color : colors)
        {
            if(color.length()>longest.length())
                longest=color;
        }
        System.out.println("The Longest Word is : "+longest);
        System.out.println();

    }

      public void removeDuplicates()
    {
        List<String> colors=new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        List<String> colors2=new ArrayList<>();
        for (String color : colors) {
            if(colors2.contains(color)==false)
                colors2.add(color);
            else
                continue;
        }
        System.out.println("Before Removong Duplicates");
        System.out.println(colors);
        System.out.println("After Removing duplicates");
        System.out.println(colors2);
        System.out.println();
    }


    public void printFrequency()
    {

        List <String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        Map<String,Integer> colorCount=new HashMap<>();

        for (String color : colors) {
            colorCount.put(color,colorCount.getOrDefault(color,0)+1);
        }
        System.out.println("Elements  :  Frequency");

        for (Map.Entry<String, Integer> entry : colorCount.entrySet()) {

            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
        System.out.println();

    }

    public void mergeList()
    {
        List<String> list1 = Arrays.asList("Red", "Green", "Blue");
        List<String> list2 = Arrays.asList("Yellow", "Black", "White");

        List<String> list3=new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("Before merge List 1 and List 2\n___________");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("After merging List 1 and List 2\n___________");
        System.out.println(list3);
        System.out.println();

    }


    public void reverseList()
    {
        List <String> ll=new LinkedList<>();
        ll.add("Subash");
        ll.add("Abi");
        ll.add("s1");
        ll.add("s2");
        ll.add("s3");

        System.out.println("Before Reversing");
        System.out.println(ll);
        List <String> ll2=ll.reversed();
        System.out.println("After Reversing");
        System.out.println(ll2);
        System.out.println();
    }


    public void mergeTwoArrayList()
    {
        List <String> arrayList1=new ArrayList<>();
        arrayList1.add("Subash");
        arrayList1.add("Abi");
        arrayList1.add("s1");
        arrayList1.add("s2");
        arrayList1.add("s3");

        List <String> arrayList2=new ArrayList<>();
        arrayList2.add("Red");
        arrayList2.add("Green");
        arrayList2.add("Blue");
        arrayList2.add("Yellow");
        arrayList2.add("Green");
        arrayList2.add("Blue");

        arrayList1.addAll(arrayList2);
        List <String> mergedList = new ArrayList<>();
        System.out.println("Merged ArrayList : "+arrayList1);
        System.out.println();
    }

    private void removeEvenNumbersAndSortThem() {

        List <Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(457);
        intList.add(5);
        intList.add(1);
        intList.add(67);
        intList.add(44);

        List<Integer> sortedList = new ArrayList<>();

        for (Integer i : intList) {
            if(i%2!=0)
                sortedList.add(i);
            else
                continue;
        }
        Collections.sort(sortedList);
        System.out.println(sortedList);
        System.out.println();
    }

    private void removeDuplicatesAndMakeMap()
    {
        List<String> nameList = new ArrayList<>();
        nameList.add("Subash");
        nameList.add("Mathi");
        nameList.add("Tempo");
        nameList.add("Arsath");
        nameList.add("Abi");
        nameList.add("Subash");
        nameList.add("Mathi");

        Set<String> nameSet = new HashSet<>();

        for (String s : nameList) {
            nameSet.add(s);
        }

        Map<String,Integer> nameMap = new HashMap<>();
        int i=0;
        for (String name : nameSet) {
            i=i+1;
            nameMap.put(name,i);
        }
        System.out.println("Before Duplicates Removal");
        System.out.println(nameList);
        System.out.println("After Duplicates Removal and map making");
        System.out.println(nameMap);
        System.out.println();
    }

    private Set<String> intersectionOfSets()
    {
        Set<String> set1 = new HashSet<>();
        set1.add("Subash");
        set1.add("Mathi");
        set1.add("Tempo");
        set1.add("Arsath");
        set1.add("Abi");

        Set<String> set2 = new HashSet<>();
        set2.add("Subash");
        set2.add("Mathi");

        Set<String> intersectionSet = new HashSet<>();

        Set <String> set4 = new HashSet<>();

        for (String s : set2) {
            if(!(set1.add(s)));
            intersectionSet.add(s);
        }
        return  intersectionSet;

    }

    public Map<String,Integer> printNameAsKeyAndLenAsValue()
    {
        Map<String,Integer> nameAndAgeMap = new HashMap<>();
        nameAndAgeMap.put("Subash",21);
        nameAndAgeMap.put("Mathi",20);
        nameAndAgeMap.put("Tempo",19);
        nameAndAgeMap.put("Arsath",18);

        Map<String,Integer> newMap= new HashMap<>();

        for (Map.Entry<String, Integer> entry : nameAndAgeMap.entrySet())
        {
            newMap.put(entry.getKey(),entry.getKey().length());
        }
        System.out.println("Map with name length");
        return newMap;
    }

    public Map<String,String> replaceNullValues()
    {
        Map<String,String> map1=new HashMap<>();

        map1.put("Car",null);
        map1.put("Bike","bmw");
        map1.put("Bus","benz");
        map1.put("Cycle",null);
        map1.put("Plane","air india");
        map1.put("Jeep","Thar");
        map1.put("ship",null);
        map1.put("Auto","ola");
        map1.put("Boat",null);
        map1.put("Helicopter",null);

        String value="Unknown";

        for (Map.Entry<String, String> entry : map1.entrySet())
        {
            if(entry.getValue()==null)
                map1.replace(entry.getKey(),value);
        }
        return map1;
    }
}
