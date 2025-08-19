package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.List;

public class CollectionTraining {
    public static void main(String[] args) {

        List<String> colorList = new ArrayList<>();
        List<String> copyList = new ArrayList<>();

        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Orange");

        printTheColor(colorList); // 1
        iterateTheColor(colorList); // 2
        addTheElementInFirst(colorList); // 3
        retrieveTheElement(colorList,2); // 4
        updateArray(colorList, "Road"); // 5
        removeThirdElement(colorList,2); // 6
        searchElement(colorList,"Orange"); // 7
        copyTheArrayList(colorList, copyList );  // 8
        reverseArrayList(colorList); // 9
        compareTwoArrayList(colorList,copyList); // 10
        joinTwoArrayList(colorList,copyList); // 11


    }

    private static void joinTwoArrayList(List<String> colorList, List<String> copyList) {
        colorList.addAll(copyList);
        System.out.println(colorList);
        System.out.println();
    }

    private static void compareTwoArrayList(List<String> colorList, List<String> copyList) {

        System.out.println();
        if (colorList.containsAll(copyList)) {
            System.out.println("Same");
        }else {
            System.out.println("Not Same");
        }
        System.out.println();
    }

    private static void reverseArrayList(List<String> colorList) {
        String[] str = colorList.toArray(new String[0]);

        System.out.println(colorList.reversed());

        for (int i=str.length-1; i>=0; i--) {
            System.out.print(str[i] + " ");
        }

    }

    private static void copyTheArrayList(List<String> colorList, List<String> copyList) {
        copyList.addAll(colorList);
        System.out.println(copyList);
        System.out.println();
    }

    private static void searchElement(List<String> colorList, String orange) {
        System.out.println(colorList.contains(orange));
        System.out.println();
    }

    private static void removeThirdElement(List<String> colorList, int i) {
        System.out.println(colorList.remove(i));
        System.out.println(colorList);
        System.out.println();
    }

    private static void updateArray(List<String> colorList, String road) {
        System.out.println(colorList.set(0,road));
        System.out.println(colorList);
        System.out.println();
    }

    private static void retrieveTheElement(List<String> colorList, int i) {

        System.out.println(colorList.get(i));

    }

    private static void addTheElementInFirst(List<String> colorList) {
        colorList.add(0,"Yellow");
        System.out.println(colorList);
        System.out.println();
    }

    private static void iterateTheColor(List<String> colorList) {
        for (String s : colorList) {
            System.out.println(s);
            System.out.println();
        }
    }

    private static void printTheColor(List<String> colorList) {

        System.out.println(colorList);
        System.out.println();
    }

}
