package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.List;

public class CollectionPractice {

    public static void printArrayList(List<String> colors){
        System.out.println(colors);
    }

    public static void iterateArrayList(List<String> colors){
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }

    public static void insertIntoArrayList(List<String> colors){
        colors.add(0,"Yellow");
        System.out.println(colors);
    }

    public static void retrieveFromArrayList(List<String> colors){
        ;
        System.out.println(colors.get(2));
    }

    public static void updateElementInArrayList(List<String> colors){
        colors.set(3,"Violet");
        System.out.println(colors);
    }

    public static void removeFromArrayList(List<String> colors){
        colors.remove(3);
        System.out.println(colors);
    }

    public static void searchInArrayList(List<String> colors){
        System.out.println( colors.contains("Yellow"));
    }

    public static void copyToArrayList(List<String> colors, List<String> colors1){
        colors.addAll(colors1);
        System.out.println( colors);
    }

    public static void reverseElementsInArrayList(List<String> colors){
        System.out.println(colors.reversed());
    }

    public static void compareArrayLists(List<String> colors, List<String> colors1){
        System.out.println(colors);
        System.out.println(colors1);
        System.out.println(colors.containsAll(colors1));
    }

    public static void joinArrayLists(List<String> colors, List<String> colors1){
        List<String> list = new ArrayList<>();
        list.addAll(colors);
        list.addAll(colors1);
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();


        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        printArrayList(colors);
        iterateArrayList(colors);
        insertIntoArrayList(colors);
        retrieveFromArrayList(colors);
        updateElementInArrayList(colors);
        removeFromArrayList(colors);
        searchInArrayList(colors);

        List<String> colors1 = new ArrayList<>();
        colors1.add("Maroon");
        colors1.add("Orange");
        colors1.add("Turquoise");

        copyToArrayList(colors,colors1);
        reverseElementsInArrayList(colors);

        System.out.println();
        compareArrayLists(colors,colors1);

        System.out.println();
        joinArrayLists(colors,colors1);

    }
}
