package in.co.nmsworks.week3.day1;
import in.co.nmsworks.week1.day3.Candidate;

import java.util.*;

public class CollectionTraining{
    public static void main(String[] args) {
//        listExample();
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Brown");
        colors.add("Red");
        colors.add("Violet");
        colors.add("Green");
        System.out.println("Colors are " + colors);
        printList(colors);
        inserAtFirst(colors,"Pink");
        System.out.println("Element at index 4 : "+ retrieveAtIndex(colors,4));
        updateArrayElement(colors,3,"Grey");
        removeElement(colors,3);
        System.out.println(searchForElement(colors,"White"));
        List<String> copy = copyArrayList(colors);
        System.out.println(copy);
        System.out.println("The reversed list is: ");
        printReverseElements(colors);
        System.out.println();
        System.out.println(compareArrayList(colors,copy));
        joinList(colors,copy);
        System.out.println(colors);
    }

    private static void joinList(List<String> colors, List<String> copy) {
        System.out.println("The joined list is: ");
        colors.addAll(copy);
    }

    public static String compareArrayList(List<String> colors, List<String> copy) {
        return (colors.containsAll(copy)) ? "Matched" : "Not Matched";
    }

    private static void printReverseElements(List<String> colors) {
        for(int i = colors.size()-1 ; i >= 0 ; i--) {
            System.out.print(colors.get(i) + "\t");
        }
    }

    private static List<String> copyArrayList(List<String> colors) {
        return colors.subList(0,colors.size());
    }

    private static String searchForElement(List<String> colors, String str) {
        return (colors.contains(str)) ? "Available" : "Not Available";
    }

    private static void removeElement(List<String> colors, int i) {
        System.out.println("Removed element is " + colors.remove(i));
    }

    private static void updateArrayElement(List<String> colors, int i, String str) {
        colors.set(i,str);
        System.out.println("Updated element at index "+ i + " is " + colors.get(i));
    }

    private static void printList(List<String> colors) {
        for (String color : colors) {
            System.out.println(" Colors is " + color);
        }
    }

    private static void inserAtFirst(List<String> colors, String str) {
        colors.add(0,str);
        System.out.println("First element is : "+ colors.get(0));
    }

    public static String retrieveAtIndex(List<String> colors, int index) {
        return colors.get(index);
    }

    public static void listExample() {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        l1.add("Mercury");
        l1.add("Venus");
        l1.add("Mars");
        l1.add("Jupiter");
        l1.add("Saturn");
        System.out.println(l1.add("Uranus"));
        System.out.println(l1);
       String[] arr =  l1.toArray(new String[0]);
        System.out.println();
//        l1.add(2,"Earth");
//        l2.addAll(l1);
//        l2.add("Neptune");
//        System.out.println(l1);
//        System.out.println(l2.get(5));
//        System.out.println(l1.size());
//        System.out.println(l1.isEmpty());
//        l1.clear();
//        l1.addAll(l2);
//        System.out.println(l1);
//        System.out.println(l1.contains("Pluto"));
//        System.out.println(l1.contains(l2));
//        l1.add("Earth");
//        System.out.println(l1.get(3));
//        System.out.println(l1.lastIndexOf("Earth"));
//
//        List<String> list = l1.subList(3,8);
//        System.out.println(list);
//        list.set(0,"Mercury");
//        System.out.println(list);
//        System.out.println(l1);
//        System.out.println(l2);
//        l1.remove(list);
//        System.out.println(l1);
    }
}
