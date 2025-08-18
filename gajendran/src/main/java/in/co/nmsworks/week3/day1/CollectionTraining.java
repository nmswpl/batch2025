package in.co.nmsworks.week3.day1;


import java.util.*;

public class CollectionTraining {


    public static void listExample(){

        List<String> example = new ArrayList<>();

        example.add("gajendran");
        System.out.println(example.add("Alwin"));
        System.out.println(example);
        List<String> sample = new ArrayList<>();
        sample.add("abc");
        sample.add("dcba");
        System.out.println(sample);

        example.addAll(0,sample);

        System.out.println(example);

        example.set(0,"Alwin");
        System.out.println(example);

        System.out.println(example.size());

        System.out.println(example.isEmpty());

        example.remove(1);
        System.out.println(example.remove("Alwin"));

        System.out.println(example);
        example.addAll(0,sample);

        System.out.println(example);

        example.removeAll(sample);
        System.out.println(example);


        System.out.println(example.contains("gajendran"));


        example.addAll(0,sample);

        System.out.println(example.containsAll(sample));
        sample.remove(0);
        System.out.println(sample);
        System.out.println(example.containsAll(sample));
        sample.add("sss");
        System.out.println(sample);
        System.out.println(example.containsAll(sample));
        System.out.println(example.indexOf("gajendran"));

        System.out.println(example.lastIndexOf("gajendran"));
        System.out.println(example);

        System.out.println(example.toArray());
        String[] array = example.toArray(new String[0]);


    }


    public static List listPractice(){

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");
        colors.add("pink");
        colors.add("brown");
        colors.add("black");
        colors.add("gray");

        return colors;


    }


    public static void iterateElement(List temp){
        for (Object o : temp) {
            System.out.println(o);
        }
    }


    public static void insertElement(List temp, String color){
        temp.add(0,color);
    }

    public static void findElementThroughIndex(List temp, int index){
        System.out.println(temp.get(index));
    }

    public static void update(List org, List copy){
        org.addAll(copy);
    }

    public static void removeThroughIndex(List temp, int index){
        temp.remove(index);
    }

    public static void search(List temp, String element){
        System.out.println("Element is Present : "+temp.contains(element));
    }

    private static List copy(List temp){
        List copy = temp;
        return copy;
    }

    private static void printReverseOfElements(List temp){
        System.out.println(temp.reversed());
    }

    private static void compare(List l1, List l2){
        System.out.println("compare two List");
        System.out.println(l1.equals(l2));
    }




    public static void main(String[] args) {

        //listExample();
        List list = listPractice();

        System.out.println(list);

        iterateElement(list);

        System.out.println(list);

        insertElement(list, "White");

        System.out.println(list);

        findElementThroughIndex(list, 4);


        List<String> tempCopy = new ArrayList<>();
        tempCopy.add("color1");
        tempCopy.add(("color2"));

        update(list,tempCopy);

        removeThroughIndex(list, 5);

        search(list, "red");
        search(list,"gaja");


        List copy = copy(list);
        System.out.println("copy list");
        System.out.println(copy);

        System.out.println("reverse elements");
        printReverseOfElements(list);

        compare(list, tempCopy);
        compare(list,list);


        update(list, tempCopy);

        System.out.println(list);









    }



}
