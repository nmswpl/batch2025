package in.co.nmsworks.week3.day2;

import java.util.*;

public class CollectionPractice
{
    public static void main(String[] args) {
        Map<String,Integer> vehicles = new HashMap<>();
        vehicles.put("Car" , 4);
        vehicles.put("bike" , 2);
        vehicles.put("Bus" , 4);
        vehicles.put("Cycle" , 2);
        vehicles.put("Plane" , 2);
        vehicles.put("Jeep", 4);
        vehicles.put("Ship" ,0);
        vehicles.put("Auto" , 3);
        vehicles.put("Boat" , 0);
        vehicles.put("Helicopter" , 0);
        System.out.println("TwoWheelers:");
        getTwoWheeler(vehicles);

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Removed Duplicate color:");
        removeDuplicate(colors);

        List<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Blue");
        colors1.add("Yellow");
        colors1.add("Orange");
        System.out.println("SubList:");
        subListOfList(colors1 ,3);

        longestColor(colors1);


       /* Map<Integer,String> nos = new HashMap<>();
        nos.put(1,"Red");
        nos.put(2,"Green");
        nos.put(3,"Blue");
        nos.put(4,"Yellow");
        nos.put(5,"Green");
        nos.put(6,"Blue");
        printNoOfTimes(nos);

        */
        printNoOfTimes(colors);


        //set two

        System.out.println(" ");
        List<String> list1 =Arrays.asList("Red" ,"Blue","Green");
        List<String> list2 = Arrays.asList("Yellow", "Black" ,"White");
        mergeTwoList(list1,list2);

        List<String> col1 = new LinkedList<>();
        col1.add("Red");
        col1.add("Blue");
        col1.add("Green");
        col1.add("Black");
        reverseTheLinkedList(col1);

        List<String> col = new ArrayList<>();
        col.add("Red");
        col.add("Blue");
        col.add("Green");
        col.add("Black");
        List<String> col2 = new ArrayList<>();
        col2.add("Pink");
        col2.add("Brown");
        col2.add("Grey");
        col2.add("Yellow");
        mergeTwoArrayList(col,col2);

        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(2);
        num.add(6);
        num.add(4);
        num.add(1);
        num.add(3);
        List<Integer> remEven =removeEvenAndSort(num);
        Collections.sort(remEven);
        System.out.println(remEven);


        List<String> names = new ArrayList<>();
        names.add("Fayas");
        names.add("Sheik");
        names.add("Ram");
        names.add("Som");
        names.add("Kumar");
        Map<String , Integer> maping = removeDuplcateAndMap(names);
        System.out.println(maping);
        //removeDuplcateAndMap(names);


        Set<String> set1 = new HashSet<>();
        set1.add("abc");
        set1.add("def");
        set1.add("ghi");
        Set<String> set2 = new HashSet<>();
        set2.add("ghi");
        set2.add("abc");
        set2.add("kln");
        Set<String> set3 = intersectionOfTwoSet(set1,set2);
        System.out.println(set3);



        Map<String , Integer> info = new HashMap<>();
        info.put("Fayas",21);
        info.put("Sheik" ,20);
        info.put("Ram", 19);
        info.put("Gokul" , 22);

        //Map<String ,Integer> newInfo = newMapping(info);
        //System.out.println(newInfo);



    }




    public static void getTwoWheeler(Map<String,Integer> vehicles){
        for (Map.Entry<String, Integer> wheels : vehicles.entrySet()) {
             if(wheels.getValue() == 2){
                 System.out.println(wheels.getKey());
             }
        }

    }

    public static void removeDuplicate(List<String> colors){
        List<String> newColors = new ArrayList<>();
        for(int i=0;i<colors.size();i++){
            if(!newColors.contains(colors.get(i))){
                newColors.add(colors.get(i));
            }
        }
        System.out.println(newColors);
    }

    public static void subListOfList(List<String> colors1 , int index){
        System.out.println(colors1.subList(1,index+1));
    }

    public static void longestColor(List<String> colors){
        int maxLength = 0;
        int i =0;
        for (String color : colors) {
            if(color.length()>maxLength){
                maxLength = color.length();
                i++;
            }
        }
        System.out.println("Max Length Color :" + colors.get(i));
    }

    public static void printNoOfTimes(List<String> colors){
        List<String> myColor = new ArrayList<>();
        for(int i=0;i<colors.size()-1;i++){
           if(!myColor.contains(colors.get(i))){
               myColor.add(colors.get(i));
               int count =0;
               for(int j=0;j<colors.size();j++){
                   if(colors.get(i).equals(colors.get(j))){
                       count++;
                   }
               }
               System.out.println(colors.get(i) + " : " + count + " Times");
           }

       }
    }



    // Set two

    public static void mergeTwoList(List<String> list1 , List<String> list2){
        List<String> mergedList1 = new ArrayList<>();
        mergedList1.addAll(list1);
        mergedList1.addAll(list2);
        System.out.println(mergedList1);
    }

    public static void reverseTheLinkedList(List<String> col){
        System.out.println("Actual list : "  + col);
        System.out.println("Reversed : " + col.reversed());
    }

    public static void mergeTwoArrayList(List<String> col ,List<String> col2){
        List<String> merge = new ArrayList<>();
        col.addAll(col2);
        merge.addAll(col);
        System.out.println(merge);
    }

    public static List<Integer> removeEvenAndSort(List<Integer> num){
        List<Integer> afterRemovedEven = new ArrayList<>();
        for(int i=0;i<num.size();i++) {
            if (num.get(i) % 2 !=0){
                afterRemovedEven.add(num.get(i));
            }
        }
        return afterRemovedEven;
    }

    public static Map<String , Integer> removeDuplcateAndMap(List<String> names){
        Map<String , Integer> map = new HashMap<>();
        Set<String> name = new HashSet<>(names);
        System.out.println(name);
        Integer i = 1;
        for (String s : name) {
            map.put(s,i);
            i++;
        }
        return map;
    }

    public static Set<String> intersectionOfTwoSet(Set<String> set1, Set<String> set2) {
        Set<String> intersectinSet = new HashSet<>();
        for (String s : set1) {
            if(set2.contains(s)){
                intersectinSet.add(s);
            }
        }
        return intersectinSet;
    }

   // public static Map<String, Integer> newMapping(Map<String, Integer> info) {

    ///}

}
