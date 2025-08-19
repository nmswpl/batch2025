package in.co.nmsworks.weel3.day2;

import in.co.nmsworks.week2.day2.Vehicle;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        Map<String ,Integer> vehichles = new HashMap<>();
        vehichles.put("Car",4);
        vehichles.put("Bike",2);
        vehichles.put("Bus",6);
        vehichles.put("Cycle",2);
        vehichles.put("Plane",10);
        vehichles.put("ship",0);
        vehichles.put("jeep",4);
        vehichles.put("Auto",3);
        vehichles.put("boat",0);
        vehichles.put("helicopter",0);

        CollectionPractice c1 = new CollectionPractice() ;
        c1.printTwoWheeler(vehichles);


        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        c1.removeTheDuplicatesAndPrint(colors);
        c1.printColors(colors,1,3);

        c1.printLargestObjectInlist(colors);


        Map<String,Integer> mapColors = new HashMap<>();
        mapColors.putIfAbsent("Red",1);
        mapColors.putIfAbsent("Green",2);
        mapColors.putIfAbsent("Blue",3);
        mapColors.putIfAbsent("Yellow",4);
        mapColors.putIfAbsent("Green",5);
        mapColors.putIfAbsent("Blue",6);

        c1.printNumberOfTimesTheSameObjectPresent(mapColors);
    }

    private void printNumberOfTimesTheSameObjectPresent(Map<String, Integer> mapColors) {

        for (Map.Entry<String, Integer> colors : mapColors.entrySet()) {
            System.out.println("The number of " + colors.getKey() + " present is " + mapColors.get(colors.getKey()) + " times");
        }
    }

    private static void printLargestObjectInlist(List<String> colors) {
        String longestColor = colors.get(0);

        for (String color : colors) {
            if (color.length() >= longestColor.length()){
                longestColor = color;
            }
        }
        System.out.println("The longest color in the list is :" + longestColor);
    }

    private void printColors(List<String> colors, int startIndex , int endIndex) {

        System.out.println("The sublist from " + startIndex + " to " + endIndex);
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(colors.get(i) + " ");
        }
        System.out.println();
    }

    private void removeTheDuplicatesAndPrint(List<String> colors) {
        System.out.println("origianl list :" + colors);
        Set<String> set = new HashSet<>();
        System.out.print("Duplicate removed list :");
        for (int i = 0; i < colors.size(); i++) {
            if (set.add(colors.get(i))){
                System.out.print(colors.get(i) + " ");
            }
        }
        System.out.println(" ");
    }

    public void printTwoWheeler(Map<String,Integer> vehichles){

        for (Map.Entry<String, Integer> vehicle : vehichles.entrySet()) {
            if (vehicle.getValue() == 2){
                System.out.println(vehicle.getKey() + " is a Two Wheeler");
            }
        }
    }
}
