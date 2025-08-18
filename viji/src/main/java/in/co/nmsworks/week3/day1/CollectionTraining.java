package in.co.nmsworks.week3.day1;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import in.co.nmsworks.week1.day3.Candidate;

import java.sql.ClientInfoStatus;
import java.util.*;

public class CollectionTraining {
    public static void main(String[] args) {
      listExample();
      createList();
    }

    private static void listExample() {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();

        l1.add("viji");
        l1.add("Yamini");
        l1.add("Maha");
        System.out.println(l1);

        l1.add(1,"Kavi");
        System.out.println(l1);

        System.out.println(l2.addAll(l1));;
        System.out.println(l2);

        l2.addAll(2,l1);
        System.out.println(l2);

        l1.set(2,"anushya");
        System.out.println(l1);


        System.out.println( l2.get(7));
        System.out.println(l1.get(3));

        System.out.println(l1.size());
        System.out.println(l2.size());

        System.out.println(l1.isEmpty());


        l1.remove("anushya");
        System.out.println(l1);
        System.out.println(l2.remove(7));
        System.out.println(l2);

        System.out.println(l1);
        System.out.println(l1.removeAll(l2));
        System.out.println(l1);
        System.out.println(l2);

        l1.add("viji");
        l1.add("Yamini");
        l1.add("Maha");
        System.out.println(l1);

        System.out.println(l1.contains("viji"));
        System.out.println(l2.containsAll(l1));
        System.out.println(l1.indexOf("viji"));
        System.out.println(l2.lastIndexOf("Yamini"));
        System.out.println(l1.subList(2,3));

        String[] array = l1.toArray(new String[0]);
        System.out.println(array);
    }

    public  static  void createList() {
        /* 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.*/
        List<String> colors = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.addAll(colors);
        colors.add("Red");
        colors.add("Grey");
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Yellow");


        iterateElements(colors);
        insertElements(colors);
        retrieveElement(colors);
        updateElement(colors);
        removeThirdElement(colors);
        searchElement(colors);
        copyListToAnotherList(colors);
        printReverseElements(colors);
        compareTwoArrayList(colors);
        joinTwoArrayList(colors ,list);

    }

    /* 2. Write a Java program to iterate through all elements in an array list.*/
    public static void iterateElements(List<String> colors) {
      for (String color : colors) {
          System.out.println(color);
      }
  }

        /*3. Write a Java program to insert an element into the array list at the first position.*/
    public static void insertElements(List<String> colors) {
        colors.add(1, "Black");
        System.out.println(colors);
    }

        /* 4. Write a Java program to retrieve an element (at a specified index) from a given array list.*/
        public static void retrieveElement(List<String> colors) {
            System.out.println(colors.get(5));
        }

        /* 5. Write a Java program to update an array element by the given element.*/
      public static void updateElement(List<String> colors) {
          colors.set(1, "White");
          System.out.println(colors);
      }

        /*6. Write a Java program to remove the third element from an array list. */
      public static void removeThirdElement(List<String> colors) {
        colors.remove(2);
        System.out.println(colors);
    }

        /* 7. Write a Java program to search for an element in an array list. */
      public static void searchElement(List<String> colors) {
        System.out.println(colors.contains("White"));
    }

        /* 8. Write a Java program to copy one array list into another. */
      public static void copyListToAnotherList(List<String> colors) {
        List<String> list = new ArrayList<>();
        list.addAll(colors);
        System.out.println(list);
    }

       /* 9. Write a Java program to print reverse elements in an array list */
       public static void printReverseElements(List<String> colors) {
           for (int i = colors.size() - 1; i >= 0; i--) {
               System.out.print(colors.get(i));
           }
       }

        /* 10. Write a Java program to compare two array lists */
    public static void compareTwoArrayList(List<String> colors) {
        List<String> list = new ArrayList<>();
        list.addAll(colors);
        if (list.equals(colors)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

         /* 11. Write a Java program to join two array lists. */
        public static void joinTwoArrayList(List<String> colors ,List<String> list) {
             colors.addAll(list);
             System.out.println(colors);
         }


    }



