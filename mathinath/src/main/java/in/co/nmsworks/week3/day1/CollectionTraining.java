package in.co.nmsworks.week3.day1;

import java.util.*;

public class CollectionTraining {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("white");
        colors.add("Violet");
        colors.add("yellow");
        colors.add("blue");

        List<String> l2 = new ArrayList<>();
        l2.addAll(colors);
//      new CollectionTraining().listExample();
        new CollectionTraining().listExample1();
        new CollectionTraining().listExample2();
        new CollectionTraining().listExample3();
        new CollectionTraining().listExample4();
        new CollectionTraining().listExample5();
        new CollectionTraining().listExample6();
        new CollectionTraining().listExample7(colors);
        new CollectionTraining().listExample8(colors);
        new CollectionTraining().listExample9(colors);
        new CollectionTraining().listExample10(colors);
        new CollectionTraining().listExample11(colors,l2);
    }

    private void listExample11(List<String> colors,List<String> l2) {
        System.out.println(colors);
        System.out.println(l2);
        l2.addAll(colors);
        System.out.println(l2);

    }

    private void listExample10(List<String> colors) {
        List<String> l2 = new ArrayList<>();
        l2.addAll(colors);
        System.out.println(l2);
        System.out.println(colors.containsAll(l2));
    }

    private void listExample9(List<String> colors) {
        System.out.println(colors.reversed());
    }

    private void listExample8(List<String> colors) {
        List<String> l2 = new ArrayList<>();
        l2.addAll(colors);
        System.out.println(l2);
    }

    private void listExample7(List<String> colors) {

        colors.set(0,"pink");
        System.out.println(colors.contains("blue"));

    }

    public void listExample6() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("white");
        colors.add("Violet");
        colors.add("yellow");
        colors.add("blue");
        colors.set(0,"pink");
        colors.remove(2);
        System.out.println(colors);
    }

    private void listExample5() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("white");
        colors.add("Violet");
        colors.add("yellow");
        colors.add("blue");
        colors.set(0,"pink");
        System.out.println(colors);
    }

    private void listExample4() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("white");
        colors.add("Violet");
        colors.add("yellow");
        colors.add("blue");
        System.out.println( colors.get(2));
    }

    private void listExample3() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("white");
        colors.add("Violet");
        colors.add("yellow");
        colors.add("blue");
        colors.add(1,"Grey");
        System.out.println(colors);
    }

    private void listExample2() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("white");
        colors.add("Violet");
        colors.add("yellow");
        colors.add("blue");
        for(String i : colors)
        {
            System.out.println(i);
        }

    }

    private void listExample1() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("white");
        colors.add("Violet");
        colors.add("yellow");
        colors.add("blue");
        System.out.println(colors);
    }

    private void listExample() {
        List<String> l1 = new ArrayList<>();
     // add
        l1.add("Mathi");
        l1.add("Madan");
        l1.add("Subash");
        System.out.println(l1);

        //add index
        l1.add(1,"Arsath");
        System.out.println(l1);

        //add all last
        l1.addAll(l1);
        System.out.println(l1);

        //add all index
        l1.addAll(1,l1);
        System.out.println(l1);

       //set
        l1.set(1,"aaaaa");
        System.out.println(l1);

        //get

        System.out.println(l1.get(0));
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        l1.remove("Mathi");
        System.out.println(l1);

        List l2 = new ArrayList<>();
        l2.add("Mathi");
        l2.add("Subash");
        l1.removeAll(l2);
        System.out.println(l1);

        System.out.println(l1.contains("Mathi"));
        System.out.println(l1.containsAll(l2));

        System.out.println(l1.indexOf("Mathi"));
        System.out.println(l1.indexOf("aaaaa"));

        System.out.println(l1.lastIndexOf("Arsath"));
        System.out.println(l1.subList(1,3));

        String[] array=l1.toArray(new String[0]);
        System.out.println(array);


    }
}
