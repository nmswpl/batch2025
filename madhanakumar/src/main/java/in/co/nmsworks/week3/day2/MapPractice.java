package in.co.nmsworks.week3.day2;

import java.util.*;

public class MapPractice {
//    public static void main(String[] args) {
//        Map<String,Integer> map1 = new HashMap<>();
////        System.out.println(map1.put("Lucifer",1));
////        System.out.println(map1.put("Lucifer",2));
////        Integer id = map1.get("Lucifer");
////        System.out.println(id);
////        id = map1.get("India");
////        System.out.println(id);
////
////        System.out.println(map1.containsKey("Lucifer"));
////        System.out.println(map1.containsKey("India"));
////
////        Boolean contains = map1.containsKey("Lucifer");
////        System.out.println(contains);
//        map1.put("Lucifer",1);
//        map1.put("Ronaldo",2);
//        map1.put("Ben10",3);
//
//        System.out.println(map1);
//
//        map1.remove("Ben10");
//        System.out.println(map1);
//
//        System.out.println(map1.keySet());
//        System.out.println(map1.values());
//        System.out.println(map1.hashCode());
//        System.out.println(map1.entrySet());
//
//        System.out.println(map1.size());
//
//        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
//            System.out.println(entry.getKey());
//        }
//
//        map1.putIfAbsent("Ben10",3);
//        System.out.println(map1);
//
//        System.out.println(map1.getOrDefault("Dhoni",-1));
//
//        System.out.println(map1.get("Dhoni"));
//
//    }
    public void vehichleType(){
        Map<String,Integer> vehicle = new HashMap<>();
        vehicle.putIfAbsent("Car",4);
        vehicle.putIfAbsent("Bike",2);
        vehicle.putIfAbsent("Bus",4);
        vehicle.putIfAbsent("Cycle",2);
        vehicle.putIfAbsent("Plane",6);
        vehicle.putIfAbsent("Jeep",4);
        vehicle.putIfAbsent("Ship",0);
        vehicle.putIfAbsent("Auto",3);
        vehicle.putIfAbsent("Boat",0);
        vehicle.putIfAbsent("Helicopter",6);

        for (Map.Entry<String, Integer> entry : vehicle.entrySet()) {
            if (entry.getValue() == 2){
                System.out.println(entry.getKey() + " is a Two-Wheeler");
            }
        }
    }

    public void removeDuplicates(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        List<String> tempColor = new ArrayList<>();
        System.out.println("With Duplicates : " +colors);
        for (int i = 0; i < colors.size() ; i++){
            if(tempColor.contains(colors.get(i))){
                break;
            } else {
                tempColor.add(colors.get(i));
            }
        }
        colors = tempColor;
        System.out.println("Without Duplicates : " +colors);
    }

    public void extractColors(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        List<String> colours = colors.subList(1,4);
        System.out.println(colours);
    }

    public void longestColorName(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        int length = 0;
        List<String> longestColors = new ArrayList<>();
        for (String color : colors) {
            int len = color.length();
            if (len > length) {
                length = len;
                longestColors.clear();
                longestColors.add(color);
            } else if (len == length) {
                longestColors.add(color);
            }
        }
        for (String color : longestColors) {
            System.out.println(color);
        }
    }

    public void colorOccurance() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        Map<String,Integer> colours = new HashMap<>();
        for (String color : colors) {
            colours.put(color, colours.getOrDefault(color, 0) + 1);
        }
        System.out.println(colours);
    }


    public void mergeTheArraysAsList() {
        List<String> colors1 = Arrays.asList("Red", "Green", "Blue");
        List<String> colors2 = Arrays.asList("Yellow", "Black", "White");
        List<String> colors3 = new ArrayList<>();
        colors3.addAll(colors1);
        colors3.addAll(colors2);
        System.out.println("Merged List : "+colors3);
    }

    public void reverseTheLinkedList() {
        List<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        int left = 0;
        int right = colors.size()-1;
        while (left < right){
            String swap = colors.get(left);
            colors.set(left,colors.get(right));
            colors.set(right,swap);
            left++;
            right--;
        }
        System.out.println(colors);
    }

    public void mergeToArrayList() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list3.size()-1,list2);

        System.out.println(list3);

    }

    public void removeEvenNumberWithSorting() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(22);
        list1.add(1);
        list1.add(25);
        list1.add(2);
        list1.add(3);
        for (int i = 0; i < list1.size()-1; i++) {
            if(list1.get(i) % 2 == 0){
                list1.remove(i);
            }
        }
        Collections.sort(list1);
        System.out.println(list1);
    }

    public void removeDuplicateName(){
        List<String> nameInList = new ArrayList<>();
        nameInList.add("Lucifer");
        nameInList.add("Luffy");
        nameInList.add("Lucifer");
        nameInList.add("Lousis");
        nameInList.add("Luffy");

        Set<String> nameInSet = new LinkedHashSet<>(nameInList);

        Map<String, Integer> nameInMap = new LinkedHashMap<>();

        for (String name : nameInSet) {
            int index = nameInList.indexOf(name);
            nameInMap.put(name, index);
        }

        System.out.println(nameInMap);
    }

    public void setIntersection(){
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Hi");
        set1.add("Hello");
        set1.add("Bye");
        set1.add("Hola Amigo");


        set2.add("Wathasiva");
        set2.add("Hola Amigo");
        set2.add("Bye");

        set1.retainAll(set2);
        System.out.println(set1);
    }



    public Map<String,Integer> printNamesNoOfLetters() {
        Map<String , Integer> map = new HashMap<>();
        map.put("Madhan",7);
        map.put("Inosuke",2);
        Map<String,Integer> nameAndLetters = new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            nameAndLetters.put(stringIntegerEntry.getKey(),stringIntegerEntry.getKey().length());
        }
        return nameAndLetters;
    }

    public Map<String , String> replaceNullValue(){
        Map<String, String> map = new HashMap<>();
        map.put("Madhan","One");
        map.put("Beckam",null);
        for (Map.Entry<String , String> entry : map.entrySet()){
            map.replace(entry.getKey(), null,"Unknown");
        }

        return map;
    }
}

