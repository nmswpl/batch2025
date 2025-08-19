package in.co.nmsworks.weel3.day1;

import com.sun.security.jgss.GSSUtil;
import in.co.nmsworks.week1.day3.Candidate;

import javax.swing.plaf.ListUI;
import java.util.*;

public class CollectionTrainee {
    public static void main(String[] args) {
      //listExample();
        List<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        colors.add("White");
        colors.add("Pink");
        colors.add("Grey");
        colors.add("Light-green");
        colors.add("sky-blue");
        System.out.println(colors);
        printTheElements(colors);
        addFirstElement(colors);
        reteriveElement(colors,0);
        updateElement(colors,3,"blueee");
        removeElement(colors,2);
        searchElement(colors,"Yellow");
        copyList(colors);
        printTheElementsInReverse(colors);
        List<String> colorCopy = new ArrayList<>();
        colorCopy.addAll(colors);
        compareTwoArryalist(colors,colorCopy);


        List<String> color2 = new ArrayList<>();
        color2.add("brown");
        joinTwoList(colors,color2);
    }

    private static void joinTwoList(List<String> colors, List<String> color2) {
        color2.addAll(colors);
        System.out.println(color2);

    }

    private static void compareTwoArryalist(List<String> colors, List<String> colorCopy) {
        if (colors.containsAll(colorCopy)){
            System.out.println("The Both are same");
        }
    }

    private static void printTheElementsInReverse(List<String> colors) {

        for (int i = colors.size()-1 ; i >= 0  ; i--){
            System.out.println(colors.get(i));
        }
    }

    private static void copyList(List<String> colors) {
        List<String> colorCopy = new ArrayList<>();
        colorCopy.addAll(colors);
        System.out.println(colorCopy);
    }

    private static void searchElement(List<String> colors, String yellow) {
        if (colors.contains(yellow)){
            System.out.println("The element present");
        }
    }

    private static void removeElement(List<String> colors, int i) {
        colors.remove(3);
        System.out.println(colors);
    }

    private static void updateElement(List<String> colors, int i, String blueee) {

        colors.set(i,blueee);
        System.out.println(colors);
    }

    private static void reteriveElement(List<String> colors, int i) {
        System.out.println(colors.get(i));

    }

    private static void addFirstElement(List<String> colors) {
        colors.add(0,"Rose-colour");

    }

    public static void printTheElements(List<String> colors) {

        for (String color : colors) {
            System.out.println(color);

        }

        colors.add(0,"Rose-colour");

    }

    public static void listExample() {
        List<String> ls1 = new ArrayList<>();
        ls1.add("harish");
        ls1.add("Logesh");
        ls1.add("Balaji");
        ls1.add("Mukesh");
        ls1.add("Reena");

        System.out.println(ls1);

        ls1.add(1,"Alamelu");
        System.out.println(ls1);

        List<String> ls2 = new ArrayList<>();
        List<String> ls3 = new ArrayList<>();
        ls3.add("Muthiyalu");
        ls3.add("Married");

        ls2.addAll(ls1);
        System.out.println(ls2);

        ls2.addAll(1,ls3);
        System.out.println(ls2);

        ls2.set(2,"Apt");
        System.out.println(ls2);


        System.out.println(ls2.get(1));

        System.out.println(ls2.size());

        System.out.println(ls2.isEmpty());

        ls3.clear();
        System.out.println(ls3);

        ls2.remove(2);
        System.out.println(ls2);

        ls2.add(2, "marrr");
        System.out.println(ls2);

        ls2.remove("marrr");
        System.out.println(ls2);


        ls3.addAll(ls2);
        System.out.println(ls3);

        ls3.removeAll(ls1);
        System.out.println(ls3);


        System.out.println(ls2.contains("harish"));
        System.out.println(ls2.containsAll(ls1));

        ls2.add("harish");
        System.out.println(ls2.indexOf("harish"));
        System.out.println(ls2.lastIndexOf("harish"));

        System.out.println(ls2.subList(0,7));

        ls3.clear();

        ls3 = ls2.subList(0,7);

        ls3.set(0,"harishankar");
        System.out.println(ls3);

        System.out.println(ls2.get(0));


        String[] array = ls1.toArray(new String[0]);

    }



}
