package in.co.nmsworks.week3.day1;

import in.co.nmsworks.week1.day3.Candidate;

import java.util.*;

public class CollectionTraining {

   public static void main(String[] args)
   {
       List <String> l1= new ArrayList<>();
       l1.add("blue");
       l1.add("red");
       l1.add("yellow");
       l1.add("green");
       l1.add("black");
       l1.add("white");
       l1.add("violet");
       listExample(l1);



       iterationList(l1);
       updateElement(l1);
       getElement(l1);
       removeThirdElement(l1);
       searchElement(l1);

       List<String> l2= new ArrayList<>();
       l2.add("Subash");
       l2.add("Mathi");
       l2.add("fiyas");
       l2.add("Temopo");
       l2.add("Arsath");

       List<String> l3=new ArrayList<>();


       copyArray(l1,l3);
       reverseElement(l1);
       compareArrayList(l1,l2);
       joinTwoArray(l1,l2);
    }
    public static void listExample(List<String> l1) {
        System.out.println(l1);
    }
    public static void iterationList(List<String> l1)
    {
        for (String s : l1)
        {
            System.out.println(s);
        }
    }
    public static void addElement(List<String> l1)
    {
        l1.add(0,"mejantha");
        System.out.println(l1);
    }
    public static void getElement(List<String> l1)
    {
        System.out.println(l1.get(0));
    }
    public static void updateElement(List<String> l1)
    {
        l1.set(0,"no color");
        System.out.println(l1);
    }
    public static void removeThirdElement(List<String> l1)
    {
        System.out.println(l1.remove(2));
        System.out.println(l1);
    }
    public static void searchElement(List<String> l1)
    {
        System.out.println(l1.indexOf("red"));
    }
    public static void copyArray(List<String> l1,List<String> l3)
    {
        System.out.println(l3.addAll(l1));
        System.out.println(l3);
    }
    public static void reverseElement(List<String> l1)
    {
        for(int i=l1.size()-1;i>0;i--)
        {
            System.out.println(l1.get(i));
        }
    }
    public static void compareArrayList(List<String> l1,List<String> l2)
    {
        System.out.println(l1.containsAll(l2));
    }
    public static void joinTwoArray(List<String> l1,List<String> l2)
    {
        l1.addAll(l2);
        System.out.println(l1);
    }

}
