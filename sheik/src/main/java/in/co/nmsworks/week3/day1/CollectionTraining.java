package in.co.nmsworks.week3.day1;

import in.co.nmsworks.week1.day2.string.Candidate;

import java.util.*;

public class CollectionTraining
{
    public static void main(String[] args) {

        //listExample();
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Violet");

        printCollection(colors);
        iterateList(colors);
        insertAtFirst(colors);
        retriveAtIndex(colors);
        updateAnElement(colors);
        removeAtIndex(colors);
        searchElement(colors);

        List<String> colors2 = new ArrayList<>();
        copyList(colors,colors2);
        reverseIterateList(colors);
        compareList(colors,colors2);
        joinList(colors,colors2);

    }

    public static void printCollection(List colors){


        System.out.println(colors);


    }

    public static void iterateList(List colors){
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
    }

    public static void insertAtFirst(List colors){
        colors.add(0,"Pink");
        System.out.println(colors);
    }

    public static void retriveAtIndex(List colors){
        System.out.println(colors.get(2));
    }

    public static void updateAnElement(List colors){
        colors.set(2,"Black");
        System.out.println(colors);
    }

    public static void removeAtIndex(List colors){
        colors.remove(2);
        System.out.println(colors);
    }

    public static void searchElement(List colors){
        System.out.println(colors.indexOf("Yellow"));
    }

    public static void copyList(List colors,List colors2){
       colors2.addAll(colors);
        System.out.println(colors2);
    }

    public static void reverseIterateList(List colors){
        for(int i=colors.size()-1;i>=0;i--){
            System.out.println(colors.get(i));
        }
    }

    public static void compareList(List colors , List colors2){
        //System.out.println(colors);
        //System.out.println(colors2);
        System.out.println(colors.containsAll(colors2));
    }

    public static void joinList(List colors , List colors2){
        colors.addAll(colors2);
        System.out.println(colors);
    }

}