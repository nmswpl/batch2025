package in.co.nmsworks.week3.day1;

import javax.management.AttributeList;
import java.util.*;

public class CollectionTraining
{
    public static void main(String[] args)
    {

        List <String> colors = new ArrayList<>();
        List <String> colors1 = new ArrayList<>();

        colors.add("red");
        colors.add("green");
        colors.add("yellow");
        colors.add("blue");


       // listExample();

        addPosition(colors);
        iterateList(colors);
        updatePosition(colors);
        retervieIndex(colors);
        remove(colors);
        search(colors);
        oneToAnother(colors , colors1);
        reverseColors(colors);
        compareTwoArray(colors1,colors);
        joinTwoArrayList(colors,colors1);

    }
    /*
    public  static void listExample()
    {
        List <Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
       // add
        System.out.println(l1);

        l1.add(4,5);
        System.out.println(l1);

        System.out.println(l1.size());
        System.out.println(l1.get(4));
        l1.remove(3);
        System.out.println(l1);



        l1.subList(0,2);
        System.out.println(l1);
        List <String> s1 = new ArrayList<>();
        s1.add("kabil");
        s1.add("kumar");
        s1.add("kavi");

        System.out.println(s1);
        System.out.println(s1.contains("kumar"));
        s1.set(1,"krish");
        System.out.println(s1);
        s1.add(3,"kumar");
        System.out.println(s1);

        System.out.println(s1.contains("kumar"));
        System.out.println(s1.size());
        System.out.println(s1.lastIndexOf("kavi"));

        s1.toArray(new String[0]);




    }*/
    public  static  void  joinTwoArrayList(List colors,List colors1)
    {
        colors.addAll(colors1);
        System.out.println(colors);

    }
    public  static  void compareTwoArray(List colors,List colors1)
    {
        System.out.println("Compare two array list :" +colors.containsAll(colors1));
    }

    public  static  void  reverseColors(List colors)
    {
        for (int i = colors.size() - 1; i >= 0; i--) {
            System.out.println("Reverse The Colors : "+ colors.get(i));
        }
    }


    public static  void retervieIndex(List colors)
    {
        System.out.println("reterive : "+colors.indexOf("gray"));

    }
    public static void addPosition(List colors)
    {
        colors.add(0,"gray");
        System.out.println(colors);
     }
     public static void  iterateList(List colors)
     {
         for (int i = 0; i < colors.size(); i++) {
             System.out.println(colors.get(i));
         }
     }

     public  static  void updatePosition(List colors)
     {
         System.out.println( colors.set(2,"black"));
     }
     public  static void remove(List colors)
     {
         colors.remove(3);
         System.out.println("remove "+ colors);
     }
     public  static void search(List colors)
     {
         System.out.println("search: " + colors.contains("red"));
     }
     public static void oneToAnother(List colors,List colors1)
     {
        colors1.addAll(colors);
         System.out.println("Copy one to Another :" +colors1);

     }


}
