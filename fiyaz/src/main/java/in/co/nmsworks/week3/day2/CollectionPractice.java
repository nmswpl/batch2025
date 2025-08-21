package in.co.nmsworks.week3.day2;


// Add the Following Vehicles to a Collection.
//       Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
//  Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".


import java.util.*;

//import static com.sun.tools.javac.jvm.ClassFile.Version.MAX;

public class CollectionPractice {
    public static void main(String[] args) {


        Map<String, Integer> mapWheels = new HashMap<>();
        mapWheels.put("Car",4);
        mapWheels.put("Bike",2);
        mapWheels.put("Bus",8);
        mapWheels.put("Cycle",2);
        mapWheels.put("Plane",4);
        mapWheels.put("Jeep",4);
        mapWheels.put("Ship",0);
        mapWheels.put("Auto",3);
        mapWheels.put("Boat",0);
        mapWheels.put("Helicopter",7);

        printTwoWheelsVehicles(mapWheels);

        List<String> listColor = new ArrayList<>();
        listColor.add("Red");
        listColor.add("Green");
        listColor.add("Blue");
        listColor.add("Yellow");
        listColor.add("Green");
        listColor.add("Blue");

        printWithOutDupInList(listColor);

        List<String> listToExtract = new ArrayList<>();
        listToExtract.add("Red");
        listToExtract.add("Green");
        listToExtract.add("Blue");
        listToExtract.add("Yellow");
        listToExtract.add("Orange");

        printTheSubList(listToExtract,1,4);
        findTheLargestName(listToExtract);

        List<String> listForCount = new ArrayList<>();
        listForCount.add("Red");
        listForCount.add("Green");
        listForCount.add("Blue");
        listForCount.add("Yellow");
        listForCount.add("Green");
        listForCount.add("Blue");

        findTheCountOfColor(listForCount);

//       6

        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        List<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Black");
        list2.add("White");

        mergeTheTwoList(list1,list2);

//        7
        List<String> linkList = new LinkedList<>();
        linkList.add("Red");
        linkList.add("Green");
        linkList.add("Blue");
        linkList.add("Yellow");
        linkList.add("Green");
        linkList.add("Blue");


        reversesTheLinkedList(linkList);

//        8
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("I");
        arrayList1.add("Love");
        arrayList1.add("Coding");

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add(" So");
        arrayList2.add("I");
        arrayList2.add("Love java");

        mergeTwoArrayList(arrayList1,arrayList2);

//        9

        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(2);
        integerList.add(3);
        integerList.add(10);
        integerList.add(22);
        integerList.add(0);
        integerList.add(4);
        integerList.add(-1);

        System.out.println("Final List :: " + printTheOddNumList(integerList));
        System.out.println();

//        10
        List<String> nameList = new ArrayList<>();
        nameList.add("Fiyaz");
        nameList.add("Riyaz");
        nameList.add("CRF");
        nameList.add("Ram");
        nameList.add("Riyaz");
        nameList.add("Ram");

        printInMap(nameList);

//      11

        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        Set<String> set2 = new HashSet<>();
        set2.add("C");
        set2.add("E");
        set2.add("V");

        intersectionOfSet1Set2(set1,set2);

//        12
        Map<String,Integer> mapNameAndAge = new HashMap<>();
        mapNameAndAge.put("Fiyaz",23);
        mapNameAndAge.put("Ram",32);
        mapNameAndAge.put("Gaja",21);

        changeTheMap(mapNameAndAge);






    }

    private static void changeTheMap(Map<String, Integer> mapNameAndAge) {

        Map<Integer,Integer> integerIntegerMap = new HashMap<>();

        for (Integer s : integerIntegerMap.keySet()) {
            integerIntegerMap.put(mapNameAndAge.get(s),1);


        }
        System.out.println(integerIntegerMap);

    }

    private static void intersectionOfSet1Set2(Set<String> set1, Set<String> set2) {

        Set<String> set3 = new HashSet<>(set1);
        set2.addAll(set3);

        System.out.println("Intersection :: " + set3);
        System.out.println();



    }

    private static void printInMap(List<String> nameList) {

        Set<String> nameSet = new HashSet<>();
        nameSet.addAll(nameList);

        Map<String, Integer> nameMap = new HashMap<>();

        int i = 1;
        for (String s : nameSet) {
            nameMap.put(s,i);
            i++;
        }

        System.out.println("Map :: " + nameMap);
        System.out.println();

    }

    private static List<Integer> printTheOddNumList(List<Integer> integerList) {

        List<Integer> finalInt = new ArrayList<>();

        for (Integer in : integerList) {
            if (in%2 != 0) {
                finalInt.add(in);
            }
        }
        Collections.sort(finalInt);

        return finalInt;
    }

    private static void mergeTwoArrayList(List<String> arrayList1, List<String> arrayList2) {
        List<String> mergeTwoList = new ArrayList<>();

        mergeTwoList.addAll(arrayList1);
        mergeTwoList.addAll(arrayList2);

        System.out.println("The Final ArrayList :: " + mergeTwoList);
        System.out.println();

    }

    private static void reversesTheLinkedList(List<String> linkList) {
        System.out.println("Reverses the Linked List :: " + linkList.reversed());
        System.out.println();
    }

    private static void mergeTheTwoList(List<String> list1, List<String> list2) {
        list1.addAll(list2);
        System.out.println("Merge List :: " + list1);
        System.out.println();
    }

    private static void findTheCountOfColor(List<String> listForCount) {
        Map<String, Integer> mapCount = new HashMap<>();

        for (String s : listForCount) {
            if (!mapCount.containsKey(s)) {
                mapCount.put(s,1);
            }
            else if(mapCount.containsKey(s)) {
                mapCount.put(s,mapCount.getOrDefault(s,0) + 1);
            }
        }

        System.out.println("Color and Count :: " + mapCount);
        System.out.println();

    }


    private static void findTheLargestName(List<String> listToExtract) {

        String s = listToExtract.get(0);
        int n = listToExtract.toArray().length;



        for (int i = 1; i < n-1; i++) {
            if (listToExtract.get(i).length() > (s.length())) {
                s = listToExtract.get(i);
            }
        }

        System.out.println("Longest Color :: " + s);
        System.out.println();


    }

    private static void printTheSubList(List<String> listToExtract, int i, int j) {
        System.out.println(listToExtract.subList(i,j));
        System.out.println();

    }


    private static void printWithOutDupInList(List<String> listColor) {

        List<String> finalList = new ArrayList<>();

        for (String l : listColor) {
            if (!finalList.contains(l)) {
                finalList.add(l);
            }

        }

        System.out.println("Remove duplicate :: " + finalList);
        System.out.println();

    }

    private static void printTwoWheelsVehicles(Map<String, Integer> mapWheels) {

        for (Map.Entry<String, Integer> stringIntegerEntry : mapWheels.entrySet()) {

            if (stringIntegerEntry.getValue().equals(2)) {
                System.out.println(stringIntegerEntry.getKey() + " is a Two Wheeler");
            }


        }
        System.out.println();
    }
}
