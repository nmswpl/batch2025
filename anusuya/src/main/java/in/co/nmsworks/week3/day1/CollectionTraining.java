package in.co.nmsworks.week3.day1;

import java.util.*;

public class CollectionTraining {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("White");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Purple");
        colors.add("Orange");
        printCollection(colors);

        iterateAndPrintCollection(colors);

        insertAtFirstPosition(colors, "Lavender");

        printElementAtGivenIndex(3, colors);

        printAfterUpdatingElement(4, "Rose", colors);

        printAfterRemovingElementAtIndex(3, colors);

        searchAndPrintElement("Yellow", colors);

        List<String> newColors = new ArrayList<>();
        copyAndPrintList(colors, newColors);

        printReverseElements(colors);

        compareTwoList(colors, newColors);

        List<String> addedColors = new ArrayList<>();
        addedColors.add("MINT GREEN");
        addedColors.add("GREY");
        joinAndPrintTwoList(colors, addedColors);
    }

    private static void printCollection(List<String> colors) {

        System.out.println();
        System.out.println("Colors : " + colors);
    }

    private static void iterateAndPrintCollection(List<String> colors) {

        System.out.println();
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();
    }

    private static void insertAtFirstPosition(List<String> colors, String newColor) {

        System.out.println();
        colors.add(0, newColor);
        System.out.println(colors);
    }

    private static void printElementAtGivenIndex(int index, List<String> colors){

        System.out.println();
        System.out.println("Element at " + index + " is : " + colors.get(index));
    }

    private static void printAfterUpdatingElement(int index, String newElement, List<String> colors){

        System.out.println();
        System.out.println("Before Updation : " + colors);
        colors.set(index, newElement);
        System.out.println("After Updation : " + colors);
        System.out.println();
    }

    private static void printAfterRemovingElementAtIndex(int index, List<String> colors) {

        System.out.println("Before removing element at " + index + " is : " +colors);
        colors.remove(index);
        System.out.println("After removing : " + colors);
    }

    private static void searchAndPrintElement(String searchColor, List<String> colors) {

        System.out.println();
        int index = colors.indexOf(searchColor);
        if (index > 0){
            System.out.println("Color " + searchColor + " at : " + index);
        }
        else{
            System.out.println("Color " + searchColor + " is Not Present");
        }

    }

    private static void copyAndPrintList(List<String> colors, List<String> newColors) {

        System.out.println();
        System.out.println("Old list : " + colors);
        colors.addAll(newColors);
        System.out.println("Copied List : " + colors);
    }

    private static void printReverseElements(List<String> colors) {

        System.out.println();
        System.out.print("List in reverse order : ");
        for(int i = colors.size()-1; i >= 0; i--){
            System.out.print(colors.get(i) + " ");
        }
        System.out.println();

//        List<String> temp =colors.reversed();
//        System.out.println(temp);
    }

    private static void compareTwoList(List<String> colors, List<String> newColors){

        System.out.println();
        System.out.println("Colors list contains newColors is : " + colors.containsAll(newColors));
    }

    private static void joinAndPrintTwoList(List<String> colors, List<String> addedColors) {

        System.out.println();
        colors.addAll(addedColors);
        System.out.println("After joining two lists : " + colors);
    }
}
