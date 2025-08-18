package in.co.nmsworks.week3.day1;

import java.util.*;

public class CollectionTraining {
    public static void main(String[] args) {
        List<String> colors= new ArrayList<>();
        List<String> colors2= new ArrayList<>();
//        listExample();
          passColor(colors);
          printColors("yellowPink",colors);
          specific();
          insetFirst(3,"yellopink",colors);
          thirdElement(3,colors);
          searching(colors);
          copyDisplay(colors,colors2);
          compareToArray(colors,colors2);
          concateArray(colors,colors2);

    }
//    }
//    public static void listExample(){
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new LinkedList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        System.out.println(list1);
//        System.out.println(list2.addAll(list1));
//        System.out.println(list1.addAll(2,list1));
//        System.out.println(list1.set(0,21));
//        System.out.println(list1.get(2));
//        System.out.println(list1.size());
//        System.out.println(list1.isEmpty());
//        System.out.println(list2.indexOf(2));
//        System.out.println(list1.contains(2));
//        System.out.println(list1.containsAll(list2));
//        System.out.println(list1.lastIndexOf(2));
//        System.out.println("List 2 :"+ list2);
//        System.out.println(list1.subList(0,2));
//        System.out.println("remove : "+ list1.remove(1));
//        System.out.println("removeAll : "+ list1.removeAll(list2));
//        System.out.println(list1);
//        System.out.println(list2);
//        list2.clear();
//        System.out.println(list2);
//        String[] ar=list1.toArray(new String[0]);
//
//
//    }


    public static void printColors(String yellowPink, List<String> colors){

        colors.add("green");
        colors.add("yellow");
        colors.add("pink");
        colors.add("blue");
        colors.add("orange");
        System.out.println("Colors : "+colors);
    }
    public static void passColor(List<String> colors){
        for (Object color : colors) {
            System.out.println("colors : "+ color);

        }

    }
    public static void insetFirst(int index, String yellopink, List<String> colors){

        colors.set(0,"purple");
    }

    public static void specific(){
        List<String> colors= new ArrayList<>();
        colors.add(3,"yellopinkk");
    }

    public static void thirdElement(int index,List<String> colors){
        colors.remove(3);
        System.out.println("remove");
    }

    public static void searching(List<String> colors){
        colors.contains("pink");
        System.out.println("search");
    }

    public static void copyDisplay(List<String> colors,List<String> colors2){
        colors.addAll(colors2);

        System.out.println(colors2);
    }
    public static void compareToArray(List<String> colors,List <String> colors2){
        colors.contains(colors2);
        System.out.println("compare");
    }
    public static void concateArray(List<String> colors,List<String> colors2){

        colors.addAll(2,colors2);
        System.out.println("join of two array");
    }

}
