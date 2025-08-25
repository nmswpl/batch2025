package in.co.nmsworks.week3.day2;


import java.util.*;

import static java.lang.reflect.Array.set;
import static java.util.Collections.reverse;
import static java.util.Collections.swap;

class MapMethodsPractice {
    public void vehiclesCollection() {
        Map<String, Integer> vehicles = new HashMap<>();
        vehicles.put("Car", 4);
        vehicles.put("Bike", 2);
        vehicles.put("Bus", 4);
        vehicles.put("Cycle", 2);
        vehicles.put("Plane", 3);
        vehicles.put("Jeep", 2);
        vehicles.put("Ship", 0);
        vehicles.put("Auto", 3);
        vehicles.put("Boat", 0);
        vehicles.put("Helicopter", 4);

        for (Map.Entry<String, Integer> entry : vehicles.entrySet()) {
            if (entry.getValue().equals(2)) {
                System.out.println(entry.getKey() + " is a two wheeler ");
            }
        }

    }


    public void removeDuplicatesColor(List<String> colors) {

        List<String> uniqueColor = new ArrayList<>();
        for (String color : colors) {
            if (!uniqueColor.contains(color)) {
                uniqueColor.add(color);
            }
        }
        System.out.println(uniqueColor);
    }


    public void extractAndPrintColorsFrom1To3(List<String> color1) {

        System.out.println(color1.subList(1, 4));

    }


    public void printLongestLengthColorName(List<String> color1) {
        int length = 0;
        String longestColor = "";
        for (String color : color1) {
            if (color.length() >= length) {
                longestColor = color;
            }
        }
        System.out.println(longestColor);
    }


    public void printColorWithNoOfTimes(List<String> colors) {
        Map<String, Integer> map = new HashMap<>();

        for (String color : colors) {
            if (map.containsKey(color)) {
                Integer i = map.get(color) + 1;
                map.put(color, i);
            }
            else {
                map.put(color, 1);
            }
        }
        System.out.println(map);


    }
    public void mergesTwoList(List<String> list1, List<String> list2) {

        list1.addAll(list2);
        System.out.println(list1);
    }

    public void reverseElementsInLinkedList(List<String> reverseList) {
             int i = 0 ;
             int j = reverseList.size() - 1 ;
             String temp ;
             while(i < j){
                 temp = reverseList.get(i) ;
                 reverseList.set(i , reverseList.get(j) ) ;
                 reverseList.set(j , temp) ;
             }
        System.out.println(reverseList);
    }


}
public class CollectionsPractice {
    public static void main(String[] args) {

        MapMethodsPractice mp = new MapMethodsPractice();

     /* Add the Following Vehicles to a Collection.
	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".*/
        mp.vehiclesCollection();


        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        mp.removeDuplicatesColor(colors);

        /*Given a collection of colors: "Red", "Green", "Blue", "Yellow", "Orange", write a method to extract and print colors from index 1 to index 3 (inclusive).*/
        List<String> color1 = new ArrayList<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Blue");
        color1.add("Yellow");
        color1.add("Orange");
        mp.extractAndPrintColorsFrom1To3(color1);

        /* Write a method to find the longest color name in a group of colors and return it.*/
        mp.printLongestLengthColorName(color1);

        /*Given a Collection of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue". write a method to print color and number of times it is present in the collection.*/
        mp.printColorWithNoOfTimes(colors);

        /* Write a method that merges two lists of colors, one being List<String> list1 = Arrays.asList("Red", "Green", "Blue") and another being List<String> list2 = Arrays.asList("Yellow", "Black", "White"), such that the resulting list contains all elements from both lists with list1 elements coming before list2 elements. Print the merged list.*/

        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        List<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Black");
        list2.add("White");

        mp.mergesTwoList(list1, list2);








    }

}

