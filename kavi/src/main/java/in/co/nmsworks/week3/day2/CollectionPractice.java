package in.co.nmsworks.week3.day2;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        MapPractice mapPractice = new MapPractice();
        Map<String, Integer> vehicles = mapPractice.addingValue();

        for (Map.Entry<String, Integer> entry : vehicles.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey() + "Two Wheeler");
            }
        }

        MapPractice mapPractice1 = new MapPractice();
        Map<String, Boolean> uniqueColors = mapPractice1.addingColors();

        for (String color : uniqueColors.keySet()) {
            System.out.println(color);
        }


        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");


        MapPractice mapPractice3 = new MapPractice();

        mapPractice3.printColorsInRange(colors, 1, 3);


        MapPractice mapPractice4 = new MapPractice();

        String longestColor = mapPractice4.findLongestColorName(colors);

        System.out.println("The longest color " + longestColor);

        MapPractice mapPractice5 = new MapPractice();
        mapPractice5.printColorCounts(colors);


        MapPractice mapPractice6 = new MapPractice();
        List<String> list1 = mapPractice6.createList1();
        List<String> list2 = mapPractice6.createList2();
        mapPractice6.mergeAndPrintLists(list1,list2);


        //question:7
        MapPractice mapPractice7 = new MapPractice();
        LinkedList<String> list = mapPractice.createList();
        System.out.println("Original List");
        mapPractice7.printList(list);
        mapPractice7.reverseList(list);
        System.out.println("Reversed List");
        mapPractice.printList(list);

        //question:8
        MapPractice mapPractice8 = new MapPractice();
        ArrayList<String> list3= mapPractice.createList3();
        ArrayList<String> list4 = mapPractice.createList4();
        ArrayList<String> mergedList = mapPractice.mergeLists(list3, list4);
        System.out.println("Merged List: " + mergedList);

        //question:9
        MapPractice mapPractice9 = new MapPractice();

        List<Integer> numbers = mapPractice9.createNumberList();
        List<Integer> result = mapPractice9.removeEvensAndSort(numbers);
        System.out.println("orginal list" + numbers);
        System.out.println("odd number sorted" + result);

        //Question 10:

        MapPractice mapPractice10=new MapPractice();
        System.out.println(mapPractice10.getUniqueNameMap());

        //Question 11
        MapPractice mapPractice11= new MapPractice();
        Set<String> set1 = mapPractice11.createFirstSet();
        Set<String> set2 = mapPractice11.createSecondSet();
        Set<String> intersection = mapPractice11.getIntersection(set1, set2);


        System.out.println("set1" + set1);
        System.out.println("set2" + set2);
        System.out.println("intersection" + intersection);

        //Question 12
        MapPractice mapPractice12 = new MapPractice();
        Map<String, Integer> nameAgeMap = mapPractice.createNameAgeMap();
        Map<String, Integer> nameLengthMap = mapPractice.getNameLengthMap(nameAgeMap);

        System.out.println("name to name mapping");
        for (Map.Entry<String, Integer> entry : nameLengthMap.entrySet()) {
            System.out.println(entry.getKey()+ entry.getValue());
        }

    }
    //Question 13








}
