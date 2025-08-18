package in.co.nmsworks.week3.day1;

import java.util.*;

public class CollectionTraining {
    public static void main(String[] args) {

        List <String> colors = new ArrayList<>();
        List <String> colors2 = new ArrayList<>();
        colors2.addAll(colors);
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Orange");
        listExample(colors);
        question2(colors);
        question3(colors);
        question4(colors);
        question5(colors);
        question6(colors);
        question7(colors);
        question8(colors);
        question9(colors);
        question10(colors, colors2);
        question11(colors);



    }

    private static void question11(List<String> colors) {
        List <String> colors3 = new ArrayList<>();
        colors3.add("Violet");
        colors3.add("Maroon");
        colors3.add("Cyan");
        colors3.addAll(3,colors);
        System.out.println(colors3);
    }

    private static void question10(List<String> colors, List<String> colors2) {
        System.out.println(colors.containsAll(colors2));
    }

    private static void question9(List<String> colors) {
        System.out.println(colors.reversed());
    }

    private static void question8(List<String> colors) {
        List <String> colorscp = new ArrayList<>();
        colorscp.addAll(colors);
        System.out.println(colorscp);
    }

    private static void question7(List<String> colors) {
        System.out.println(colors.indexOf("Yellow"));
    }

    private static void question6(List<String> colors) {
        colors.remove(2);
        System.out.println(colors);
    }

    private static void question5(List<String> colors) {
        colors.set(4,"Rose");
        System.out.println(colors);
    }

    private static void question4(List<String> colors) {
        System.out.println(colors.get(4));
    }

    static void listExample(List<String> colors){
//        List <String> list1 = new ArrayList<>();
//        list1.add("luffy");
//        list1.add("Zoro");
//        list1.add("sanji");
//        list1.add("usopp");
//        list1.add("Franky");
//        list1.add("Nami");
//        list1.add("Robin");
//        list1.add("Brook");
//        list1.add("Jinbei");
//        System.out.println(list1);
//        List <String> list2 = new ArrayList<>();
//        list2.addAll(0,list1);
//        System.out.println(list2);
//        list2.add("Vivi");
//        System.out.println(list2);
//        list2.set(9,"Loki");
//        System.out.println(list2);
//        System.out.println(list2.get(5));
//        System.out.println(list2.size());
//        System.out.println(list1.isEmpty());
////        list1.clear();
////        System.out.println(list1);
////        list2.remove("Loki");
////        System.out.println(list2);
////        list2.remove(2);
////        System.out.println(list2);
////        list2.removeAll(list1);
////        System.out.println(list2);
//        System.out.println(list2.contains("luffy"));
//        System.out.println(list2.containsAll(list1));
//        System.out.println(list2.indexOf("Zoro"));
//        System.out.println(list2.subList(0,7));
//        System.out.println(list2.lastIndexOf("Franky"));
//        System.out.println(list2.toArray(new String[0]));
//
//        Set <String> set1 = new HashSet<>();
//
//        list1.addAll(set1);

        //1st Question
        System.out.println(colors);

    }

    static void question2(List <String> colors){
        //2nd Question
        for (Object color : colors) {
            System.out.println(color);
        }
    }

    static void question3(List <String> colors){
        //3rd Question
        colors.add(1,"Black");
        System.out.println(colors);
    }
}
