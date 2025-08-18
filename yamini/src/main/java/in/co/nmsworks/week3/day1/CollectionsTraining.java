package in.co.nmsworks.week3.day1;

import java.util.*;

public class CollectionsTraining {
    public static void main(String[] args) {
        listExample();

    }

    public static void listExample() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Yamini");
        list1.add("Heena");
        list1.add("Vishnu");
        list1.add("Pavi");
        list1.add("Vijay");

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Black");
        colors.add("White");
        iterateList(colors);
        System.out.println();

        insertElement(colors, 1, "Orange");
        System.out.println();

        retrieveElement(colors, 3);

        updateElements(colors, 2, "Wine");
        System.out.println();

        removeElements(colors, 2);
        System.out.println();

        searchElements(colors, "White");
        System.out.println();

        copyAnotherList(colors, list1);
        System.out.println();

        reversePrinting(colors);
        System.out.println();

        compareTwoArrayList(colors, colors);
        System.out.println();

        joinTwoArrayLists(colors, list2);

    }


    public static void iterateList(List<String> colors) {
        for (Object color : colors) {
            System.out.print(color + " ");
        }
    }

    public static void insertElement(List<String> colors, int index, String color) {
        colors.add(index, color);
        System.out.print(colors + " ");
    }

    public static void retrieveElement(List<String> colors, int index) {
        System.out.println("Color at index: " + colors.get(index));

    }

    public static void updateElements(List<String> colors, int index, String color) {
        colors.set(index, color);
        System.out.print(colors);
    }

    public static void removeElements(List <String>colors, int index) {
        System.out.print("Removed color :" + colors.remove(index));
    }

    public static void searchElements(List<String> colors, String element) {
        System.out.print(colors.contains(element));

    }

    public static void copyAnotherList(List<String> colors, List<String> list) {
        System.out.println(colors.addAll(list));
        System.out.print(colors);
    }

    public static void reversePrinting(List<String> colors) {
        for (int i = colors.size() - 1; i >= 0; i--) {
            System.out.print(colors.get(i) + " ");
        }
    }

    public static void compareTwoArrayList(List<String> colors, List<String> list) {
        System.out.print(colors.containsAll(list));
    }

    public static void joinTwoArrayLists(List<String> colors, List<String> list) {
        colors.addAll(list);
        System.out.println("join");
        System.out.println(colors);
        System.out.print(colors.addAll(list));
        System.out.println(colors);
    }

}


