package in.co.nmsworks.week3.day2;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<String> colorsList = new ArrayList<>();
        String [] s1 = {"Red", "Green", "Blue", "Yellow", "Green", "Blue"};
        colorsList.addAll(List.of(s1));

        CollectionPractice collectionPractice = new CollectionPractice();
        collectionPractice.vechile();

        collectionPractice.removeDuplicateAndPrintColors(colorsList);

        List<String> colors = new ArrayList<>();
        String [] s2 ={"Red", "Green", "Blue", "Yellow", "Orange"};
        colors.addAll(List.of(s2));

        collectionPractice.printColorsFrom0To4(colors);
        System.out.println("Longest color Name : "+collectionPractice.longestColorName(colors));

        collectionPractice.printColorsAndRepeatationCount(colorsList);

        collectionPractice.mergeTwoList();

        collectionPractice.printReverseLinkedList();

        collectionPractice.mergeTwoArrayList();

        collectionPractice.evenAscendingOrder();

        collectionPractice.listToMap();

        System.out.println(collectionPractice.intersectionSet());

        System.out.println("-----------------------------");
        Map<String,Integer> problem7inputMap = new HashMap<>();
        problem7inputMap.put("Tharun",20);
        problem7inputMap.put("Kumar",21);
        problem7inputMap.put("Sathish",19);
        System.out.println(swapKeyAndValues(problem7inputMap));

        Map<String,String> problem8InputMap = new HashMap<>();
        problem8InputMap.put("Tharun",null);
        problem8InputMap.put("Kumar","ABC");
        problem8InputMap.put("Sathish",null);

        System.out.println(collectionPractice.replaceNullValues(problem8InputMap));

    }

    private Map replaceNullValues(Map<String, String> inputMap) {

        System.out.println("-----------------------------");

        for (Map.Entry<String, String> entries : inputMap.entrySet()) {

            if (entries.getValue() == null) {
                entries.setValue("Unknown");
            }
        }
        return inputMap;
    }

    private static Map swapKeyAndValues(Map<String, Integer> inputMap) {

        System.out.println("-----------------------------");
        Map<Integer,String> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> inputEntry : inputMap.entrySet()) {
            resultMap.put(inputEntry.getValue(),inputEntry.getKey());
        }
        return resultMap;
    }

    private Set intersectionSet() {

        System.out.println("-----------------------------");

        Set<String> inputSet1 = new HashSet<>(Arrays.asList("Tharun", "Kumar","Sathish"));
        Set<String> inputSet2 = new HashSet<>(Arrays.asList("Tharun", "praveen","Sathish"));

        Set<String> intersectionSet = new HashSet<>();

        for (String set1Name : inputSet1) {

            if (inputSet2.contains(set1Name)){
                intersectionSet.add(set1Name);
            }

        }

        return intersectionSet;
    }

    private void listToMap() {

        System.out.println("-----------------------------");
        List<String> nameList = new ArrayList<>(Arrays.asList("Tharun", "Kumar", "Tharun","Sathish"));
        Set<String> setNameList = new HashSet<>();
        Map<String,Integer> mapNameList = new HashMap<>();
        for (int i = 0; i < nameList.size(); i++) {
            if (setNameList.add(nameList.get(i))){
                mapNameList.put(nameList.get(i),i);
            }
        }
        System.out.println(mapNameList);
    }

    private void evenAscendingOrder() {
        System.out.println("-----------------------------");
        List<Integer> list = Arrays.asList(1,4,3,78,99,22,25,5);
        List<Integer> arrayList = new ArrayList<>(list);
        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) % 2 == 0){
                arrayList.remove(i);
            }
        }
        System.out.println("Unsorted array : "+arrayList);
        Collections.sort(arrayList);
        System.out.println("Sorted array : "+arrayList);
    }

    private void mergeTwoArrayList() {
        System.out.println("-----------------------------");

        Integer [] list1Element ={1,2,3,4};
        Integer [] list2Element ={5,6,7,8};

        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(list1Element));
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(list2Element));
        ArrayList<Integer> mergedArray = new ArrayList<>();

        mergedArray.addAll(arrayList1);
        mergedArray.addAll(arrayList2);
        System.out.println(mergedArray);

    }

    private void printReverseLinkedList() {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        LinkedList<Integer> linkedlist1 = new LinkedList<>(list1);

    }

    private void mergeTwoList() {

        System.out.println("-----------------------------");

        List<String> list1 = Arrays.asList("Red", "Green", "Blue");
        List<String> list2 = Arrays.asList("Yellow", "Black", "White");
        ArrayList<String> arrayList3 = new ArrayList<>();

        arrayList3.addAll(list1);
        arrayList3.addAll(list2);
        System.out.println(arrayList3);
    }

    private void printColorsAndRepeatationCount(List<String> colorsList) {
        
        System.out.println("-----------------------------");
        Map<String,Integer> mapColors = new HashMap<>();
        int count = 0;
        for (String color : colorsList) {
            mapColors.put(color,mapColors.getOrDefault(color,0)+1);
        }
        for (Map.Entry<String, Integer> color : mapColors.entrySet()) {
            if (color.getValue() > 1){
                System.out.println(color.getKey() + " color repeated in " + color.getValue());
            }
            
        }
    }

    private void removeDuplicateAndPrintColors(List<String> colorsList) {


        Set <String> colorSet = new HashSet<>();

        System.out.println("Non Repeating Color : ");
        for (String color : colorsList) {
            if (colorSet.add(color)){
                System.out.print(color+"\t");
            }
        }
        System.out.println();
        System.out.println("-----------------------------");


    }

    private String longestColorName(List<String> colors) {
        String word = colors.get(0) ;
        for (String color : colors) {

            if (color.length() > word.length()){
                word = color;
            }

        }
        return word;
    }

    private void printColorsFrom0To4(List<String> colors) {

        System.out.print("Colors from 1 to 4 : ");
        System.out.println(colors.subList(1,4));
//        for (int i = 0; i <= 3 ;i++){
//            System.out.print(colors.get(i)+"\t");
//        }
//        System.out.println();
        System.out.println("-----------------------------");

    }

    private void vechile() {
        Map<String,Integer> vechiles = new HashMap<>();
        vechiles.put("Car",4);
        vechiles.put("Bike",2);
        vechiles.put("Cycle",2);
        vechiles.put("Plane",6);
        vechiles.put("Jeep",4);
        vechiles.put("Ship",0);
        vechiles.put("Auto",3);
        vechiles.put("Boat",0);
        vechiles.put("Helicopter",0);

        for (Map.Entry<String, Integer> vechile : vechiles.entrySet()) {

            if (vechile.getValue() == 2){
                System.out.println(vechile.getKey()+" is a Two Wheeler");
            }

        }
        System.out.println("-----------------------------");
    }

}
