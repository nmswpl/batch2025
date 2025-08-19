package in.co.nmsworks.week3.day2;

import java.util.*;

public class MapPractice {
//    public static void main(String[] args) {
//        Map<String, Integer> map1 = new HashMap<>();
//
//        map1.put("Arsath",1);                    //PUT
//        map1.put("Madhan",2);
//        map1.put("Mathi",3);
//
//        Integer id = map1.get("Arsath");         // GET
//
//        System.out.println(id);
//
//        id = map1.get("India");
//
//        System.out.println(id);
//
//        Boolean contains = map1.containsKey(""); //CONTAINSKEY
//        System.out.println(contains);
//
//        contains = map1.containsKey("Arsath");
//        System.out.println(contains);
//
//        System.out.println(map1);
//        map1.remove("Arsath");              //REMOVE
//        System.out.println(map1);
//
//        map1.remove("Arsath",1);                //REMOVE WITH KEY AND VALUE
//        System.out.println(map1);
//
//        System.out.println("\n");
//
//        System.out.println(map1.keySet());      //KEYSET
//
//        System.out.println(map1.size());        //SIZE
//
////        map1.clear();                         //CLEAR
////
////        System.out.println(map1.isEmpty());   //ISEMPTY
//
//        System.out.println(map1.values());      //VALUES
//
//
//        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
//            entry.setValue(5);
//            System.out.println(entry); //SETVAlUE //(others: GETKEY, GETVALUE)
//        }
//
//        System.out.println(map1.entrySet());    //ENTRYSET
//
//        map1.replace("MAdhan", 3);//REPLACE (update)
//        map1.replace("Mathi",5,2);//REPLACE OLD WITH NEW ()
//        //PUT (add OR update)
//        System.out.println(map1);
//
//        map1.putIfAbsent("Arsath",1);//PUT IF ABSENT (add)
//        System.out.println(map1);
//
//        System.out.println(map1.getOrDefault("Arsath",0)); //GETORDEFAULT
//
//        System.out.println(map1.getOrDefault("Ahamed",-1));
//
//
//    }

    public void vehicleType(){
        Map<String,Integer> vehicle = new HashMap<>();
        vehicle.put("Car",4);
        vehicle.put("Bike",2);
        vehicle.put("Bus",4);
        vehicle.put("Cycle",2);
        vehicle.put("Plane",6);
        vehicle.put("Jeep",4);
        vehicle.put("Ship",0);
        vehicle.put("Auto",3);
        vehicle.put("Boat",0);
        vehicle.put("Helicopter",0);

        for (Map.Entry<String, Integer> stringEntry : vehicle.entrySet()) {
            if(stringEntry.getValue()==2){
                System.out.println(stringEntry.getKey() + " is a two wheeler.");
            }
        }
    }

    public void removeDuplicate(){
        List<String> colors = new ArrayList<>();
        Set<String>  colorSet = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

//        for (String color : colors) {
//            if(Collections.frequency(colors,color) > 1){
//                colors.remove(color);
//            }
//        }

        System.out.println("Before removing duplicates: " + colors);

        for (int i = 0; i < colors.size(); i++) {
            if(colorSet.contains(colors.get(i))){
                continue;
            }
            else{
                colorSet.add(colors.get(i));
            }
        }
        System.out.println("After removing Duplicates: " + colorSet);
    }

    public void printColors(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Colors at indices 1, 2 and 3 are " + colors.subList(1,4) + " respectively");
    }

    public void longestColor(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        int max = 0;

        for(int i=0;i<= colors.size()-1;i++){
            if(colors.get(i).length() > max){
                max = colors.get(i).length();
            }
        }

        System.out.println("Longest Colors: ");

        for(int i=0;i<= colors.size()-1;i++){
            if(colors.get(i).length()== max){
                System.out.println(colors.get(i));
            }
        }
    }

    public void frequencyOfColor(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Red");

        Map<String,Integer> colorsMap = new HashMap<>();

        for (String color:colors){
            colorsMap.put(color, colorsMap.getOrDefault(color,0)+1);
        }

        System.out.println(colorsMap);
    }

    public void mergeLists(){
        List<String> list1 = Arrays.asList("Red", "Green", "Blue");
        List<String> list2 = Arrays.asList("Yellow", "Black", "White");
        List<String> list3 = new ArrayList<>();


        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println("Mereged Arrays as Lists: " + list3);
    }

    public void reverseLinkedList(){
        List<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Before reverse: " + colors);

        int left = 0;
        int right = colors.size()-1;

        while(left < right){
            String temp = colors.get(left);
            colors.set(left, colors.get(right));
            colors.set(right,temp);

            left++;
            right--;
        }
        System.out.println("After reverse: " + colors);
    }

    public void mergeArrayList(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Array List 1: " + colors);

        List<String> colors1 = new ArrayList<>();
        colors1.add("Violet");
        colors1.add("Maroon");
        colors1.add("Turquoise");
        colors1.add("White");

        System.out.println("Array List 2: " + colors1);

        colors.addAll(colors1);

        System.out.println("Merged List:" + colors);
    }

    public void removeEvenNumbers(){
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(0);
        list.add(9);
        list.add(3);

        System.out.println("List: " + list);

        Collections.sort(list);

        for (int i=0; i<= list.size()-1; i++) {
            if (list.get(i) % 2 == 0){
                list.remove(list.get(i));
            }
        }
        System.out.println("List after removal of even numbers: " + list);
    }

    public void conversionBetweenCollections(){
        List<String> colors = new ArrayList<>();
        Set<String> colorSet = new HashSet<>();
        Map<String, Integer> colorMap = new HashMap<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Before removing duplicates: " + colors);

        for (int i = 0; i < colors.size(); i++) {
            if(colorSet.contains(colors.get(i))){
                continue;
            }
            else{
                colorSet.add(colors.get(i));
            }
        }
        System.out.println("After removing Duplicates: " + colorSet);

        for (String c :colorSet){
            colorMap.put(c, colorMap.getOrDefault(c,0)+1);
        }

        System.out.println("Unique elements of list: " + colorMap);


    }


}
