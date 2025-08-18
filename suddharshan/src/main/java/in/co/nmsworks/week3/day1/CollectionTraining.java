package in.co.nmsworks.week3.day1;

//import in.co.nmsworks.week1.day3.CandidateArray;

import java.util.*;

public class CollectionTraining {
    public static void main(String[] args) {
        //listExample();
        List <String> colors = new ArrayList<>();
        colors.add("Violet");
        colors.add("Green");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        List <String> colornew = colors;
        for (String color : colors) {
            System.out.println(color);
        }
        iterateColors(colors);
        System.out.println(insertAtFirst(colors,"Orange"));
        System.out.println(retreiveAtSpecificPos(2,colors));
        System.out.println(updateElement("Orange","Grey",colors));
        System.out.println(removeElementAtThird(colors));
        System.out.println(searchForElement(colors,"Grey"));
        System.out.println(copyList(colors));
        System.out.println(reverseList(colors));
        System.out.println(compareList(colornew,colors));
        System.out.println(joinList(colors,colors));
    }

    public static void listExample(){
        List <String> l1 = new ArrayList<>();
        List <String> l2 = new ArrayList<>();

        Set <String> s1 = new HashSet<>();
        s1.add("abc");
        s1.add("def");

        l1.add("Hello");
        l1.add("World");
        l1.add("Java");

        l2.add("One");
        l2.add("Two");

        l1.addAll(s1);
        System.out.println(l1);

        l1.add(1,"Example");
        System.out.println(l1);

        l1.addAll(l2);
        System.out.println(l1);

        l1.addAll(2,l2);
        System.out.println(l1);

        l1.set(1,"Four");
        System.out.println(l1);

        System.out.println(l1.get(1));

        System.out.println(l1.size());

        System.out.println(l1.isEmpty());

        //l1.clear();
        l1.remove("One");
        System.out.println(l1);

        l1.removeAll(l2);
        System.out.println(l1);

        System.out.println(l1.contains("Four"));
        System.out.println(l1.contains(l2));

        System.out.println(l1.indexOf("Four"));

        List <String> lnew = new ArrayList<>();
        lnew = l1.subList(1,2);
        System.out.println(lnew);
        lnew.set(0,"Six");

        System.out.println(lnew);
        System.out.println(l1);

        l1.add("Six");
        System.out.println(l1);
        System.out.println(l1.lastIndexOf("Six"));

        System.out.println(l1);

        String str = l1.get(1).toUpperCase();
        System.out.println(str);

        String [] arr = l1.toArray(new String[0]);
        for (String s : arr) {
            System.out.println(s);
        }

    }
    public static void iterateColors(List <String> l){
        for (String s : l) {
            System.out.println(s);
        }
    }
    public static List <String> insertAtFirst(List <String> l, String str){
        l.add(0,str);
        return l;
    }
    public static String retreiveAtSpecificPos(int pos, List <String> l){
        return l.get(pos);
    }
    public static List <String> updateElement(String oldOne, String newOne, List <String> l){
        int pos = l.indexOf(oldOne);
        l.set(pos,newOne);
        return l;
    }
    public static List <String> removeElementAtThird(List <String> l){
        l.remove(2);
        return l;
    }
    public static int searchForElement(List <String> l, String str){
        return l.indexOf(str);
    }
    public static List <String> copyList(List <String> l){
        List <String> colornew = new ArrayList<>();
        colornew.addAll(l);
        return colornew;
    }
    public static List <String> reverseList(List <String> l){
        return l.reversed();
    }
    public static boolean compareList(List <String> l1, List <String> l2){
        return l1.equals(l2);
    }
    public static List <String> joinList(List <String> l1, List <String> l2){
        l1.addAll(l2);
        return l1;
    }
}
