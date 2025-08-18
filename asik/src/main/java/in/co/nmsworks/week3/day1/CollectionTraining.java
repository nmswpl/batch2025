package in.co.nmsworks.week3.day1;

import java.util.*;

public class CollectionTraining
{
    public static void main(String[] args)
    {
        ListExample();
    }

    public static void ListExample()
    {
        List<String> colors = new ArrayList<>();

        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");

        System.out.println(colors);

        iterateElements(colors);

        insertAtFirstPosition(colors);

        System.out.println(retrieveElementAtSpecifiedIndex(colors, 1));

        UpdateAnArrayElement(colors);
        System.out.println(colors);

        removeTheThirdElement(colors);
        System.out.println(colors);

        System.out.println("If Element is found :" + searchAnElement(colors, "Red"));

        List<String> colorCopy = copyIntoAnotherList(colors);

        printTheListInReverse(colorCopy);

        System.out.println(compareTwoList(colors, colorCopy));

        List<String> colorList = new ArrayList<>();
        joinTwoList(colors, colorList);

        System.out.println(colorList);

    }

    private static List<String> joinTwoList(List<String> colors, List<String> colorList) {

        colorList.add("Yellow");
        colorList.add("Silver");
        colorList.add("Lavender");

        colorList.addAll(colors);
        return colorList;
    }

    private static boolean compareTwoList(List<String> colors, List<String> colorCopy) {
        return colors.containsAll(colorCopy);
    }

    private static void printTheListInReverse(List<String> colors) {
        for (int i = colors.size() - 1; i >= 0; i--)
        {
            System.out.println(colors.get(i));
        }
    }

    private static List<String> copyIntoAnotherList(List<String> colors) {
        List<String> colorCopy = new ArrayList<>();
        colorCopy.addAll(colors);
        return colorCopy;
    }

    private static boolean searchAnElement(List<String> colors, String color) {
        return colors.contains(color);
    }

    private static void removeTheThirdElement(List<String> colors) {
        colors.remove(2);
    }

    private static void UpdateAnArrayElement(List<String> colors) {
        colors.set(2, "Green");
    }

    private static String retrieveElementAtSpecifiedIndex(List<String> colors, int i)
    {
        return colors.get(i);
    }

    private static void insertAtFirstPosition(List<String> colors) {
        colors.add(0, "Grey");

        System.out.println(colors);
    }

    private static void iterateElements(List<String> colors) {
        for (String color : colors)
        {
            System.out.println(color);
        }
    }

}
