package in.co.nmsworks.week3.day2;

import javax.swing.*;
import java.util.*;

public class MapPractice {

    public void printTwoWheelVehicles() {

        Map<String, Integer> vehicles = new HashMap<>();
        vehicles.put("Car", 4);
        vehicles.put("Bus", 12);
        vehicles.put("Cycle", 2);
        vehicles.put("Bike", 2);
        vehicles.put("Plane", 3);
        vehicles.put("Jeep", 4);
        vehicles.put("Ship", 0);
        vehicles.put("Auto", 3);
        vehicles.put("Boat", 0);
        vehicles.put("Helicopter", 3);

        for (Map.Entry<String, Integer> vehicle : vehicles.entrySet()) {

            if (vehicle.getValue().equals(2)) {
                System.out.println(vehicle.getKey() + " is a Two Wheeler");
            }
        }

    }

    public void removeDuplicateColors() {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original list with duplication : " + colors);

        Set<String> colorsWithoutDuplication = new HashSet<>();

        System.out.print("After removing duplication : ");
        for (String color : colors) {
            if (colorsWithoutDuplication.add(color)) {
                System.out.print(color + " ");
            }
        }
    }

    public void extractAndPrintColors() {

        System.out.println();
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("List from 1 to 3 is : " + colors.subList(1, 4));
    }

    public String getLongestColor() {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        String maxLengthColor = "";
        int maxLength = 0;
        for (String color : colors) {
            if (color.length() > maxLength) {
                maxLengthColor = color;
            }
        }
        return maxLengthColor;
    }

    public void printFrequencyOfColor() {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        Map<String, Integer> colorsWithTHeirFrequency = new HashMap<>();

        for (String color : colors) {
            colorsWithTHeirFrequency.put(color, colorsWithTHeirFrequency.getOrDefault(color, 0) + 1);
        }

        System.out.println("Colors with their Frequency : " + colorsWithTHeirFrequency);

    }

    public void mergeAndPrintTwoLists() {

        List<String> list1 = new ArrayList<>(Arrays.asList("Red","Green","blue"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Yellow", "Black", "White"));

        list1.addAll(list2);
        System.out.println("Merged list : " + list1);

    }

    public void reverseAndPrintLinkedList() {

        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Before Reversing a list : " + numbers);

        for (int i = 0; i < numbers.size()/2; i++) {
            Collections.swap(numbers,i,numbers.size()-1-i);
        }

        System.out.println("After Reversing a list : " + numbers);
    }

    public void mergeAndPutInThirdList() {

        List<String> list1 = new ArrayList<>(Arrays.asList("Red","Green","blue"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Yellow", "Black", "White"));
        list1.addAll(list2);

        List<String> mergedList = new ArrayList<>(list1);

        System.out.println("Merged and put into third list is : " + mergedList);
    }

    public void removeEvenAndPrintInAscendingOrder() {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(1);


        for (int i = 0; i < numbers.size()-1; i++) {
            if(numbers.get(i) % 2 == 0){
                numbers.remove(i);
            }
        }
        Collections.sort(numbers);

        System.out.println("List in reverse order without having EVEN elements : " + numbers);
    }

    public void removeDuplicateValues() {

        List<String> names = new ArrayList<>();
        names.add("Anu");
        names.add("Sakthi");
        names.add("Anu");
        names.add("Rexi");
        names.add("Rexi");

        Set<String> namesSet = new HashSet<>();
        for (String name : names) {
            namesSet.add(name);
        }

        Map<String, Integer> namesMap = new HashMap<>();
        for (String name : namesSet) {
            namesMap.put(name, names.indexOf(name));
        }

        System.out.println("Names without Duplication : " + namesMap);
    }

    public void printIntersectedValuesOfTwoSets() {

        Set<String> brightColors = new HashSet<>();
        brightColors.add("Orange");
        brightColors.add("Yellow");
        brightColors.add("MintGreen");

        Set<String> fantasyColors = new HashSet<>();
        fantasyColors.add("Lavendar");
        fantasyColors.add("Pista Green");
        fantasyColors.add("Yellow");
        fantasyColors.add("MintGreen");

        if(!Collections.disjoint(brightColors,fantasyColors)){
            System.out.print("Common colors are : ");
            for (String color : brightColors) {
                if(fantasyColors.contains(color)){
                    System.out.print(color + " ");
                }
            }
        }
        else{
            System.out.println("No common colors in both lists");
        }
    }

    public void printMapValueAsLengthOfKeys() {

        Map<String, Integer> students = new HashMap<>();
        students.put("Anu",21);
        students.put("Sakthi", 22);
        students.put("Rexi", 20);

        Map<String, Integer> newStudents = new HashMap<>();

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            newStudents.put(student.getKey(), student.getKey().length());
        }

        System.out.println("New Map having values as their Key length : " + newStudents);
    }

    public void changeNullValueToUnknownAndPrint() {

        Map<String, String> namesToDesignation = new HashMap<>();
        namesToDesignation.put("Anu","SD");
        namesToDesignation.put("Rexi",null);
        namesToDesignation.put("Sakthi","BDS");
        namesToDesignation.put("Kavi",null);

        for (Map.Entry<String, String> name : namesToDesignation.entrySet()) {
            if(namesToDesignation.getOrDefault(name.getKey(),"a") == null){
                name.setValue("Unknown");
            }
        }
        System.out.println("New Map with UNKNOWN values : " + namesToDesignation);
    }
}
