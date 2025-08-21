package in.co.nmsworks.week3.day2;

import java.util.*;

public class MapPractice {

    public Map<String, Integer> addingValue() {
        Map<String, Integer> vehicleMap = new HashMap<>();

        vehicleMap.put("Car", 4);
        vehicleMap.put("Bike", 2);
        vehicleMap.put("Bus", 6);
        vehicleMap.put("Cycle", 2);
        vehicleMap.put("Plane", 6);
        vehicleMap.put("Jeep", 4);
        vehicleMap.put("Ship", 0);
        vehicleMap.put("Auto", 3);
        vehicleMap.put("Boat", 0);
        vehicleMap.put("Helicopter", 3);
        return vehicleMap;
    }

    public Map<String, Boolean> addingColors() {
        Map<String, Boolean> colorMap = new LinkedHashMap<>();

        colorMap.put("Red", true);
        colorMap.put("Green", true);
        colorMap.put("Blue", true);
        colorMap.put("Yellow", true);
        colorMap.put("Green", true);
        colorMap.put("Blue", true);

        return colorMap;

    }

    public void printColorsInRange(List<String> colorList, int start, int end) {
        List<String> subList = colorList.subList(start, end + 1);
        for (String color : subList) {
            System.out.println(color);
        }
    }

    public String findLongestColorName(List<String> colorList) {
        String longestColor = "";
        for (String color : colorList) {
            if (color.length() > longestColor.length()) {
                longestColor = color;
            }
        }
        return longestColor;
    }

    public void printColorCounts(List<String> colorList) {
        Map<String, Integer> colorCountMap = new HashMap<>();

        for (String color : colorList) {
            int currentCount = colorCountMap.getOrDefault(color, 0);
            colorCountMap.put(color, currentCount + 1);
        }

        for (Map.Entry<String, Integer> entry : colorCountMap.entrySet()) {
            String color = entry.getKey();
            int count = entry.getValue();
            System.out.println(color + " " + count);
        }
    }

    //Qquestion:6
    public List<String> createList1() {
        List<String> list1 = new LinkedList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");
        return list1;
    }

    public List<String> createList2() {
        List<String> list2 = new LinkedList<>();
        list2.add("Yellow");
        list2.add("Black");
        list2.add("White");
        return list2;
    }

    public void mergeAndPrintLists(List<String> list1, List<String> list2) {
        list1.addAll(list2);
        System.out.println("Merged List" + list1);
    }

    //Question:7
    public LinkedList<String> createList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.add("Black");
        return list;
    }
    public void reverseList(LinkedList<String> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            String lastElement = list.removeLast();
            list.addFirst(lastElement);
        }
    }
    public void printList(LinkedList<String> list) {
        System.out.println("List" + list);
    }

    //Question:8
    public ArrayList<String> createList3() {
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Red");
        list3.add("Green");
        list3.add("Blue");
        return list3;
    }
    public ArrayList<String> createList4() {
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Yellow");
        list4.add("Black");
        list4.add("White");
        return list4;
    }

    public ArrayList<String> mergeLists(ArrayList<String> list3, ArrayList<String> list4) {
        ArrayList<String> mergedList = new ArrayList<>(list3);
        mergedList.addAll(list4);
        return mergedList;
    }

    //Question:9
    public List<Integer> createNumberList() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(3);
        numberList.add(7);
        numberList.add(2);
        numberList.add(9);
        numberList.add(6);
        return numberList;
    }
    public List<Integer> removeEvensAndSort(List<Integer> numbers) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer num : numbers) {
           if(num % 2!=0){
                resultList.add(num);
            }
        }
        Collections.sort(resultList);
        return resultList;
    }

    //Question 10:
    public Map<String, Integer> getUniqueNameMap() {
        List<String> nameList = new ArrayList<>();
        nameList.add("anu");
        nameList.add("durga");
        nameList.add("viji");
        nameList.add("Aarthi");
        nameList.add("durga");
        nameList.add("kavi");

        Set<String> uniqueNames = new LinkedHashSet<>(nameList);

        Map<String, Integer> nameIndexMap = new LinkedHashMap<>();

        for (String name : uniqueNames) {
            int index = nameList.indexOf(name);
            nameIndexMap.put(name, index);
        }
        return nameIndexMap;

    }
    //Question 11
    public Set<String> createFirstSet() {
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");
        return set1;
    }

    public Set<String> createSecondSet() {
        Set<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Elderberry");
        set2.add("Fig");
        return set2;
    }
    public Set<String> getIntersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
    //Question 12
    public Map<String, Integer> createNameAgeMap() {
        Map<String, Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("karthika", 25);
        nameAgeMap.put("keerthana", 30);
        nameAgeMap.put("mahi", 28);
        nameAgeMap.put("anitha", 22);
        return nameAgeMap;
    }


    public Map<String, Integer> getNameLengthMap(Map<String, Integer> nameAgeMap) {
        Map<String, Integer> nameLengthMap = new HashMap<>();

        for (String name : nameAgeMap.keySet()) {
            nameLengthMap.put(name, name.length());
        }
        return nameLengthMap;
    }
    //Question 13

    public Map<String, String> createSampleStringMap() {
        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("A101", "Alice");
        sampleMap.put("A102", null);
        sampleMap.put("A103", "Bob");
        sampleMap.put("A104", null);
        sampleMap.put("A105", "Charlie");
        return sampleMap;
    }


    public Map<String, String> replaceNullValues(Map<String, String> inputMap) {
        Map<String, String> resultMap = new HashMap<>();

        for (Map.Entry<String, String> entry : inputMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (value == null) {
                resultMap.put(key, "Unknown");
            } else {
                resultMap.put(key, value);
            }
        }

        return resultMap;



    }











}
