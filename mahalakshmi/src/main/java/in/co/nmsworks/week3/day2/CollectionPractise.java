package in.co.nmsworks.week3.day2;

import java.util.*;

public class CollectionPractise {
    public static void main(String[] args) {
        MapPractise mp = new MapPractise();
        Map<String,Integer> vehicle = new HashMap<>();
        vehicle.put("Car",4);
        vehicle.put("Bike",2);
        vehicle.put("Bus",4);
        vehicle.put("Cycle",2);
        vehicle.put("Plane",4);
        vehicle.put("Jeep",4);
        vehicle.put("Ship",0);
        vehicle.put("Auto",3);
        vehicle.put("Boat",0);
        vehicle.put("Helicopter",0);
        mp.printVehiclesWithTwoWheelers(vehicle);

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("After removal of duplicates" + mp.removeDuplicates(colors));

        int start = 1, end = 3;
        System.out.println("Colors from index " + start + " from " + end + ": " + mp.printColorsFromIndex(colors,start,end) );

        System.out.println("The longest color in colors list is: " + mp.printLongestColor(colors));
        mp.printColorAndOccurrence(colors);

        List<String> list1 = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Yellow", "Black", "White"));
        mp.mergeList1(list1,list2);

        System.out.println(mp.mergeList2(list1,list2));

        List<String> llist = new LinkedList<>();
        llist.add("Yellow");
        llist.add("Black");
        llist.add("White");
        llist.add("Blue");
        System.out.println(llist);
        mp.reverseLinkedList(llist);

        List<Integer> num = new ArrayList<Integer>(Arrays.asList(12,8,1,9,2,8,90,55,34,11));
        System.out.println("List with Odd Numbers: " + mp.oddListNumbers(num));

        List<String> names = new ArrayList<>(Arrays.asList("Maha","Lakshmi","Nandhini","Ananthy","Maha","Nandhini"));
        System.out.println("Printing names with its length: \n " + mp.printMapWithNames(names));

        Set<String> set1 = new HashSet<>(Arrays.asList("Red", "Green", "Blue","White","Violet"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Red","Blue","Black","Violet"));
        System.out.println("Intersection Elements are: " + mp.printIntersectElements(set1,set2));

        Map<String,Integer> map2 = new HashMap<>();
        map2.put("Maha",21);
        map2.put("Lakshmi",22);
        map2.put("Nandhini",19);
        map2.put("Mala",38);
        map2.put("Ananthy",40);
        System.out.println("Printing names with its size: "+mp.mapWithNamesAndLetters(map2));

        Map<String,String> map3 = new HashMap<>();
        map3.put("Maha","Dev");
        map3.put("Lakshmi",null);
        map3.put("Logeswari","Dev");
        map3.put("Ramya","QA");
        map3.put("Elakkiya",null);
        System.out.println("Before: " + map3);
        System.out.println("After null Replacement: "+ mp.replaceUnknown(map3));
}
}
