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

        List<String> colors1 = new ArrayList<>();
        List<String> colors2 = new ArrayList<>();
        //"Red", "Green", "Blue"
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Blue");

        colors2.add("Yellow");
        colors2.add("Black");
        colors2.add("White");

        System.out.println();
        System.out.println("Merge Array List");
        System.out.println(collectionPractice.mergeArrayList(colors1, colors2));

        List<String> colorInLinkedList = new LinkedList<>();

        colorInLinkedList.add("Red");
        colorInLinkedList.add("Green");
        colorInLinkedList.add("Blue");
        colorInLinkedList.add("Yellow");
        colorInLinkedList.add("Black");
        colorInLinkedList.add("White");

        System.out.println();
        System.out.println("Reverse The LinkedList");
        collectionPractice.reverseTheLinkedList(colorInLinkedList);
        for (String color : colorInLinkedList) {
            System.out.println(color);
        }

        System.out.println();
        System.out.println("merge two `ArrayList` objects into a third `ArrayList`");
        List<String> color3 = new ArrayList<>(collectionPractice.mergeArrayList(colors1, colors2));
        System.out.println(color3);

        List<Integer> numbersInList = new ArrayList<>();
        numbersInList.add(10);
        numbersInList.add(9);
        numbersInList.add(8);
        numbersInList.add(7);
        numbersInList.add(6);
        numbersInList.add(5);
        numbersInList.add(4);
        numbersInList.add(3);
        numbersInList.add(2);
        numbersInList.add(1);

        System.out.println();
        System.out.println("Print Ascending Odd List");
        for (Integer i : ascendingOddList(numbersInList)) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("List to Map");

        colorInLinkedList.add("White");
        colorInLinkedList.add("Red");
        colorInLinkedList.add("Green");
        listToMap(colorInLinkedList);


        Set<String> set1ToCompare = new HashSet<>();
        set1ToCompare.add("Red");
        set1ToCompare.add("Green");
        set1ToCompare.add("Blue");
        set1ToCompare.add("Yellow");
        set1ToCompare.add("Orange");

        Set<String> set2ToCompare = new HashSet<>();
        set2ToCompare.add("Red");
        set2ToCompare.add("Green");
        set2ToCompare.add("Black");
        set2ToCompare.add("White");
        set2ToCompare.add("Orange");

        System.out.println();
        System.out.println("intersection a Two Set");
        Set<String> resultSetTOPrint = intersectionOfTwoSet(set1ToCompare, set2ToCompare);
        System.out.println(resultSetTOPrint);

        System.out.println();
        System.out.println("number of letters in a key as a value in Map");
        Map<String, Integer> resultMap = numOfLetterInKeyAsVal(vehicles);
        System.out.println(resultMap);

    }

    private static Map<String, Integer> numOfLetterInKeyAsVal(Map<String, Integer> vehicles) {

        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : vehicles.entrySet()) {

            result.put(stringIntegerEntry.getKey(), stringIntegerEntry.getKey().length());

        }
        return result;

    }


    private static Set<String> intersectionOfTwoSet(Set<String> set1ToCompare, Set<String> set2ToCompare) {

        Set<String> result = new HashSet<>();

        for (String color : set1ToCompare) {

            if (set2ToCompare.contains(color)){
                result.add(color);
            }

        }
        return result;

    }

    private static void listToMap(List<String> colorInLinkedList) {

        Map<String, Integer> colorsInMap = new HashMap();
        for (int i = 0; i < colorInLinkedList.size(); i++){
            String temp = colorInLinkedList.get(i);
            if (!(colorsInMap.containsKey(temp))){
                colorsInMap.put(temp, i+1);
            }
        }

        System.out.println("List to Array");
        for (Map.Entry<String, Integer> stringIntegerEntry : colorsInMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }

    }


    private static List<Integer> ascendingOddList(List<Integer> numbersInList) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer number : numbersInList) {
            if (number % 2 == 0){
                resultList.add(number);
            }
        }
            Collections.sort(resultList);
        return resultList;
    }

    private void reverseTheLinkedList(List<String> colorInLinkedList) {

        int startPointer = 0;
        int endPointer = colorInLinkedList.size()-1;

        while (startPointer < endPointer){
            String temp = colorInLinkedList.get(startPointer);
            colorInLinkedList.set(startPointer, colorInLinkedList.get(endPointer));
            colorInLinkedList.set(endPointer, temp);
            startPointer ++;
            endPointer --;
        }

    }

    private List<String> mergeArrayList(List<String> colors1, List<String> colors2) {
        List<String > colors3 = new ArrayList<>();
        colors3.addAll(colors1);
        colors3.addAll(colors2);

        return colors3;
    }


}
