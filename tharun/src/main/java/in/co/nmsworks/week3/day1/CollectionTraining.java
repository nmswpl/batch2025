package in.co.nmsworks.week3.day1;

import in.co.nmsworks.week1.day3.Candidate;

import java.util.*;

public class CollectionTraining {

    public static  void listExample(){

        List <String> e1 = new ArrayList<>();
        e1.add("Tharun");
        e1.add("Sathish");
        e1.add("Praveen");
        e1.add("Sathya");
        e1.add(1,"Thanatos");
        e1.add("Tharun");
        e1.set(2,"SathishKumar");
        System.out.println("List one : "+e1);

        List <String> e2 = new ArrayList<>();
        e2.addAll(e1);
        e2.add(0,"Subi");
        e2.add(3,"KP");
        System.out.println("List two : "+e2);
        System.out.println("e2 GET 1 index value  : "+e2.get(1));
        System.out.println("Size of e2 : "+e2.size());
        System.out.println("Empty : "+e2.isEmpty());
        System.out.println("Contains : "+e2.contains("KP"));
        System.out.println("Contains All e2 to e1 : "+e2.containsAll(e1));
        System.out.println("Contains All e1 to e2 : "+e1.containsAll(e2));
        System.out.println("Index of : "+e2.indexOf("Subi"));
        System.out.println("Last Index of Tharun from e1 : "+e1.lastIndexOf("Tharun"));


        e2.clear();
        System.out.println("After Clear : "+e2);

        String[] array = e1.toArray(new String[0]);


    }

    public static  void listColor(List listOfStringColors){

        for (Object color : listOfStringColors){
            System.out.print(color+"\t");
        }

    }

    public  static  List insertValue(List listOfStringColors,String value){
        listOfStringColors.add(0,value);
        return listOfStringColors;
    }

    public  static void getElement(List listOfStringColors,int index){
        System.out.println(listOfStringColors.get(index));
    }

    public  static void updateElement(List listOfStringColors,int index,String value){
        System.out.println("Before Update : "+listOfStringColors);
        listOfStringColors.set(index,value);
        System.out.println("After Update : "+listOfStringColors);
    }

    public static void serachElement(List listOfStringColors,String value){
        for (int i = 0 ; i<listOfStringColors.size();i++){
            if (listOfStringColors.get(i).equals(value)){
                System.out.println(value+" found at index "+i);
            }
        }

    }

    public static void printreverseElement(List listOfStringColors){

        for (int i = listOfStringColors.size()-1; i >=0 ; i--) {
            System.out.print(listOfStringColors.get(i)+"\t");
        }
        System.out.println();
    }

    public static void compareTwoList(List<String> listOfStringColors, List<String> l2) {
        if (listOfStringColors.containsAll(l2)){
            System.out.println("List a and List 2 are Equal");
            return;
        }
        System.out.println("List a and List 2 are not Equal");
    }

    public static void joinTwoString(List<String> listOfStringColors, List<String> l2) {
        List<String> newList = new ArrayList<>();
        newList.addAll(listOfStringColors);
        newList.addAll(l2);
        System.out.println("Concatation of Two String : "+l2);
    }


    public static void main(String[] args) {

        //listExample();
        List<String> listOfStringColors = new ArrayList<>();
        listOfStringColors.add("Blue");
        listOfStringColors.add("Red");
        listOfStringColors.add("Green");
        listOfStringColors.add("Black");
        listOfStringColors.add("White");

        System.out.println(listOfStringColors);

        listColor(listOfStringColors);

        insertValue(listOfStringColors,"Rose");
        System.out.println();

        System.out.println(listOfStringColors);

        getElement(listOfStringColors,3);

        updateElement(listOfStringColors,1,"Brown");

        //Remove 3 rd element of the array
        listOfStringColors.remove(2);
        System.out.println(listOfStringColors);

        serachElement(listOfStringColors,"White");

        List<String> l2 = new ArrayList<>();
        for (String color : listOfStringColors){
            l2.add(color);
        }
        System.out.println(l2);

        printreverseElement(listOfStringColors);

        compareTwoList(listOfStringColors,l2);

        joinTwoString(listOfStringColors,l2);

    }


}
