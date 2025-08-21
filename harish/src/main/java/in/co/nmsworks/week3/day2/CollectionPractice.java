package in.co.nmsworks.week3.day2;

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

        c1.printNumberOfTimesTheSameObjectPresent(colors);


        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        list2.add("Yellow");
        list2.add("Black");
        list2.add("White");

        list1.addAll(list2);
        System.out.println("The Merged list " + list1);
        c1.mergeList(list1,list2);

        List<String> list3 = new LinkedList<>();
        list3.add("Red");
        list3.add("Green");
        list3.add("Blue");
        list3.add("Yellow");
        list3.add("Green");
        list3.add("Blue");
        list3 = c1.reverseList(list3);
        System.out.println("Original List "+ list3);
        System.out.println("Reversed List" + list3);

       List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        c1.printTheNewListWithOddNumbers(integerList);

        c1.listToSetToMap();

        Set<String> first = new HashSet<>();
        Set<String> second= new HashSet<>();
        first.add("Harish");
        first.add("Kabil");
        first.add("anusuya");
        first.add("sheik");

        second.add("Kanagu");
        second.add("Kabil");
        second.add("Harish");
        second.add("Arun");

        Set<String> intersected = new HashSet<>();
        intersected = c1.intersect(first,second);
        System.out.println("Intersected Set :" + intersected);



        Map<String,Integer> names = new HashMap<>();
        names.put("harish",21);
        names.put("Logesh",23);
        names.put("Balaji",18);
        names.put("Mukkesh",16);
        Map<String,Integer> newName = new HashMap<>();
        newName = returnKeyLengthAsValues(names);
        System.out.println("The Map with name length as values " + newName);


        Map<String,String> name = new HashMap<>();
        name.put("harihs",null);
        name.put("Kabil","1");
        name.put("kanagu",null);
        c1.replaceNullValuesWithUnknown(name);
        System.out.println(name);
    }

    private void replaceNullValuesWithUnknown(Map<String, String> name) {

        for (Map.Entry<String, String> names : name.entrySet()) {
           if (names.getValue() == null){
               name.replace(names.getKey(),null,"Unknown");
           }
        }
    }

    private static Map<String, Integer> returnKeyLengthAsValues(Map<String, Integer> names) {
        Map<String,Integer> nameLength = new HashMap<>();
        for (Map.Entry<String, Integer> entrySet : names.entrySet()) {
            int i = entrySet.getKey().length();
            nameLength.put(entrySet.getKey(),i);
        }
        return nameLength;
    }

    private Set<String> intersect(Set<String> first, Set<String> second) {
        Set<String> intersectedSet = new HashSet<>();
        for (String s : first) {
            if (second.contains(s)){
                intersectedSet.add(s);
            }
        }
        return intersectedSet;
    }

    private void listToSetToMap() {
        List<String> name = new ArrayList<>();
        name.add("Harish");
        name.add("Kabil");
        name.add("Harish");
        name.add("Anusuya");
        name.add("Sheik");
        name.add("Kabil");

        Set<String> nameSet = new HashSet<>();
        Map<String,Integer> nameMap = new HashMap<>();
        for (int i = 0; i < name.size(); i++){

            if (nameSet.add(name.get(i))){
                nameMap.put(name.get(i),i);
            }
        }
        System.out.println("Name list is " + name);
        System.out.println("The Name Set without duplicates " + nameSet);
        System.out.println("The Name Map :" + nameMap.entrySet());

    }

    private void printTheNewListWithOddNumbers(List<Integer> integerList) {
        List<Integer> listWithoutEvenNumbers = new ArrayList<>();
        for (Integer i : integerList) {
            if (i % 2 != 0){
                listWithoutEvenNumbers.add(i);
            }
        }
        Collections.sort(listWithoutEvenNumbers);
        System.out.println("The List without even numbers " + listWithoutEvenNumbers);

    }

    private List<String> reverseList(List<String> list3) {
        List<String> reversedList = new LinkedList<>();
        for (int i = list3.size() - 1; i >= 0; i--) {
            reversedList.add(list3.get(i));
        }
        return reversedList;
    }

    private void mergeList(List<String> list1, List<String> list2) {
        List<String> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        System.out.println("Merged list :" + mergedList);
    }

    private void printNumberOfTimesTheSameObjectPresent(List<String> colors) {
        Map<String,Integer> count = new HashMap<>();
        for (String color : colors) {
            int def = count.getOrDefault(color,0);
            if (def == 0){
                count.put(color,def+1);
            }
            else{
                count.put(color,def+1);
            }
        }
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println("The colour " + entry.getKey() + " is " + entry.getValue() + " Number of times");
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

        System.out.println("The sublist from " + startIndex + " to " + endIndex + " is " + colors.subList(startIndex,endIndex+1));

//        for (int i = startIndex; i <= endIndex; i++) {
//            System.out.print(colors.get(i) + " ");
//        }
//        System.out.println();
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
