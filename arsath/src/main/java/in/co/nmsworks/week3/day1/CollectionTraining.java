package in.co.nmsworks.week3.day1;

import java.util.*;

public class CollectionTraining {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        ListExample(list1,list2);
    }

    public static void ListExample(List<String> list1, List<String> list2){
        list1.add("Arsath");
        list1.add("Madhan");
        list1.add("Mathi");

        System.out.println(list1);
        System.out.println(list1.size());

        list2.add("Subash");
        list2.add("Fiyas");

        list1.addAll(3,list2);

        System.out.println(list1);
        System.out.println(list1.size());

        list1.set(4,"Kavi");
        System.out.println(list1);

        System.out.println(list1.get(4));

        System.out.println(list2.isEmpty());

//        list2.clear();
        System.out.println(list2.isEmpty());

        list1.remove(1);
        System.out.println(list1);

        list1.removeAll(list2);
        System.out.println(list1);

        System.out.println( list1.contains("Arsath"));

        System.out.println( list1.containsAll(list2));

        System.out.println(list1.indexOf("Arsath"));

        System.out.println(list1.lastIndexOf("Kavi"));

        System.out.println(list1.subList(1,2));

        String[] array = list1.toArray(new String[0]);

        System.out.println(array[0]);
       ;
    }
}