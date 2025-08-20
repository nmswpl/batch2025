package in.co.nmsworks.week3.day1;

import java.lang.Integer;

import java.util.*;

public class CollectionTraining {

    public static void main(String[] args) {

//        CollectionTraining collectionTraining = new CollectionTraining();
//        collectionTraining.listMethod();
//      collectionTraining.listExample();

        List<String> color = new ArrayList<>();
        List<String> color1 = new ArrayList<>();

        listExample(color);
        printIterationOfColors(color);
        printAndDisplayElemntAddAtFirst(0,color);
        DisplaySpecificElementInArray(0,3,color);
        printAndUpdateElementInArray(3,color);
        removeAndPrintElementInArray(3,color);
        displayTheSearchElementInArray("indigo",color);
        printAndDisplayCopyOfOneListToOther(color,color1);
        printElementInReverse(color);
        compareAndDisplayTwoArrayList(color,color1);
        DisplayTheJoinOfTwoList(color,color1);

    }

    private static void DisplayTheJoinOfTwoList(List<String> color, List<String> color1) {
        color.addAll(color1);
        System.out.println(color);
    }

    private static void compareAndDisplayTwoArrayList(List<String> color, List<String> color1) {
        System.out.println(color.containsAll(color1));
    }

    private static void printElementInReverse(List<String> color) {
        System.out.println(color.reversed());
    }

    private static void printAndDisplayCopyOfOneListToOther(List<String> color, List<String> color1) {
        color1.addAll(color);
        System.out.println(color1);
    }

    private static void displayTheSearchElementInArray(String text, List<String> color) {
        System.out.println(color.contains(text));
    }

    private static void removeAndPrintElementInArray(int i, List<String> color) {
        color.remove(i);
        System.out.println(color);
    }

    private static void printAndUpdateElementInArray(int i, List<String> color) {
        color.set(3,"lavendar");
        System.out.println(color);
    }

    private static void DisplaySpecificElementInArray(int fromIndex, int toIndex, List<String> color) {
        System.out.println(color.subList(fromIndex,toIndex));
    }

    private static void printAndDisplayElemntAddAtFirst(int index,List<String> color) {

        color.add(index,"skyBlue");
        System.out.println(color);
    }

    private static void printIterationOfColors(List<String> color) {
        for (String colors : color) {
            System.out.println(colors);
        }
    }

    public  static void listExample(List<String> color) {

         color.add("red");
         color.add("blue");
         color.add("violet");
         color.add("yellow");
         color.add("black");
         color.add("orange");
         color.add("indigo");
        System.out.println("Colors are : "+ color);



    }








    private void listMethod() {
        List<String> listExample1 = new ArrayList<>();
        List<String> listExample2 = new ArrayList<>();

        listExample1.add("apple");
        listExample1.add("banana");
        listExample1.add("orange");
        listExample1.add("cherry");
        listExample1.add("jackFruits");
        System.out.println(listExample1);
        listExample1.add(2,"pineapple");
        System.out.println(listExample1);
        System.out.println("-------------------");
        listExample2.add("orange");
        listExample2.add("papaya");
        listExample1.addAll(listExample2);
        System.out.println(listExample1);
        System.out.println("---------------");
        listExample1.addAll(0,listExample2);
        System.out.println(listExample1);
        System.out.println("----------------");
        System.out.println(listExample2.contains(listExample1));
        System.out.println(listExample1.containsAll(listExample2));
        System.out.println("----------------");
        System.out.println(listExample1);
        listExample1.set(3,"lemon");
        System.out.println(listExample1);
        System.out.println("----------------");
        System.out.println(listExample1.size()+" "+listExample2.size());
        System.out.println("-----------------");
        System.out.println(listExample1.isEmpty());
        System.out.println("-----------------");
        listExample1.remove("papaya");
        System.out.println(listExample1);
        System.out.println("-----------------");
        System.out.println(listExample1.remove(3));
        System.out.println(listExample1);
        System.out.println("--------------------");
        System.out.println(listExample1.indexOf(4));
        System.out.println(listExample1.lastIndexOf(2));
        System.out.println("-----------------");
        System.out.println(listExample1.subList(2,3));


        Set<Integer> set = new HashSet<>();

        System.out.println(listExample1.toArray(new String[0]));;




    }
}
