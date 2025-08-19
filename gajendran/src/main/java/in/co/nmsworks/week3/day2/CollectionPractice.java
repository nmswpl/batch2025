package in.co.nmsworks.week3.day2;

import java.util.*;

public class CollectionPractice {


    public void printANameBasedOnWheel(Map<String , Integer> vehicles, Integer wheel){

        for (Map.Entry<String, Integer> stringIntegerEntry : vehicles.entrySet()) {
            if (stringIntegerEntry.getValue().equals(wheel)){
                System.out.println(stringIntegerEntry.getKey() +" is a Two Wheeler");
            }
        }
    }

public void printWithOutDuplicate(String[] colors){

    Set<String > colorSInSet = new HashSet<>();
    System.out.println();
    System.out.println("Print unique Element");
    for (String color : colors) {
        if (colorSInSet.add(color)){
            System.out.println(color);
        }
    }
    colorSInSet.clear();

}


    private static void printOccurrenceOfWordInStringArray(String[] colors) {

        Map<String, Integer> colorsInMap = new HashMap<>();

        for (String color : colors) {
            Integer val = colorsInMap.get(color);

            if (val == null){
                val = 0;
            }

            colorsInMap.put(color,++val);

        }

        System.out.println();
        System.out.println("Print Occurrence Of Word In String Array");

        for (Map.Entry<String, Integer> stringIntegerEntry : colorsInMap.entrySet()) {

            System.out.println(stringIntegerEntry.getKey() + " : "+ stringIntegerEntry.getValue());

        }

    }

    private static void printALongestWordInList(List<String> colorsInList) {
        String result = "";
        int highestLengthOfWord = 0;
        for (String color : colorsInList) {

            if (highestLengthOfWord < color.length()){
                result = color;
                highestLengthOfWord = color.length();
            }

        }

        System.out.println();
        System.out.println("Printing Longest Word In List");
        System.out.println(result);
    }

    public static void printAsubList(List<String> colorsInList, int startIndex, int endIndex) {
        System.out.println();
        System.out.println("Printing SubList from "+startIndex+" to "+endIndex);
        System.out.println(colorsInList.subList(startIndex,endIndex+1));
    }




    public static void main(String[] args) {

        Map<String,Integer> vehicles = new HashMap<>();
        vehicles.put("Car",4);
        vehicles.put("Bke", 2);
        vehicles.put("Bus", 6);
        vehicles.put("Cycle",2);
        vehicles.put("Plane", 3);
        vehicles.put("Jeep", 4);
        vehicles.put("Ship", 0);
        vehicles.put("Auto", 3);
        vehicles.put("Boat", 0);
        vehicles.put("Helicopter", 0);


        CollectionPractice collectionPractice = new CollectionPractice();
        collectionPractice.printANameBasedOnWheel(vehicles, 2);

        String[] colors = new String[] {"Red", "Green", "Blue", "Yellow", "Green", "Blue"};
        collectionPractice.printWithOutDuplicate(colors);

        List<String > colorsInList = new ArrayList<>();
        colorsInList.add("Red");
        colorsInList.add("Green");
        colorsInList.add("Blue");
        colorsInList.add("Yellow");
        colorsInList.add("Orange");

        printAsubList( colorsInList,1,  3);

        printALongestWordInList(colorsInList);

        printOccurrenceOfWordInStringArray(colors);


    }


}
