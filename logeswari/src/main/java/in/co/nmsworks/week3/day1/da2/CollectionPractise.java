package in.co.nmsworks.week3.day1.da2;

import java.util.*;

public class CollectionPractise {
    public static void main(String[] args) {
        CollectionPractise cp=new CollectionPractise();
        Map<String ,Integer> map2=new HashMap<>();


        List<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("green");
        list1.add("blue");

        List<String> list2 = new ArrayList<>();
        list1.add("yello");
        list1.add("black");
        list1.add("white");

        List<String> listlink = new LinkedList<>();
        listlink.add("green");
        listlink.add("blue");
        listlink.add("pink");
        printShuffle(listlink);

        System.out.println(list2.addAll(list1));
        System.out.println(list2);
        printConcat(list2,list1);


//        LinkedList<String> linklist = (LinkedList<String>) Arrays.asList("Red", "Green", "Blue","yello");
//        printShuffle(linklist);



        addValPrint(map2,"bike",2);
        addValPrint(map2,"car",4);
        addValPrint(map2,"cycle",2);
        addValPrint(map2,"plane",4);
        addValPrint(map2,"jeep",4);
        addValPrint(map2,"ship",2);
        addValPrint(map2,"auto",2);
        addValPrint(map2,"helicopter",2);

        printTwoWheel(map2,2);

        List<String> list=new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        printSameList(0,list);

        System.out.println(list);
        printOriginalValue(list);
       printIndeValue(list,1,4);
       printLargest(list);
       printNoOfTime(list);
//        Print();
        List<Integer> numList=new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);

        printOddList(numList,2);

        Map<String,Integer> details=new HashMap<>();
        details.put("logeswari",21);
        details.put("anuciya",19);
        details.put("maha",23);
        printUnique(details);
        numberOfLetters(details);

        Set <String> detail1=new HashSet<>();
        detail1.add("logeswari");
        detail1.add("anuciya");
        detail1.add("maha");

        Set <String> detail2=new HashSet<>();
        detail2.add("logeswari");
        detail2.add("anuciya");
        detail2.add("kavi");
        printListofIntersection(detail1,detail2);

        Map<String,String> detail3=new HashMap<>();
        detail3.put("logeswari",null);
        detail3.put("anuciya",null);
        detail3.put("maha",null);
        printUnique(details);
        numberOfLetters(details);
        nullReplceUnkown(detail3);

    }

    public static void addValPrint(Map<String,Integer> map2,String name, Integer Wcount) {
        map2.put(name,Wcount);
        System.out.println(map2);
    }
    public static void printTwoWheel(Map<String,Integer> map2,Integer val) {
        System.out.println("Original Adding two Vehicles  : "+map2.values());
        System.out.println("two Wheel Vehicles : "+map2);

    }
    public static void printOriginalValue(List<String> list) {
        List<String> res=new ArrayList<>();
        for (String color : res) {
            if(!res.contains(color)){
                res.add(color);
            }
            System.out.println("oridinal color : "+list);

        }
    }
    public static void printIndeValue(List<String> list, Integer from, Integer to){

        System.out.println(list.subList(from,to));

    }
    public static void printLargest(List<String> list){

        System.out.println(list.stream().max(String::compareTo));

    }
    public static void printNoOfTime(List<String> list){
        Map<String ,Integer> colorCount=new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : colorCount.entrySet()) {
            colorCount.put(String.valueOf(colorCount.getOrDefault(colorCount,0)),-1);
            System.out.println("re color : "+ stringIntegerEntry);
        }
        for (Map.Entry<String, Integer> entry : colorCount.entrySet()) {

            System.out.println("repetating color : "+colorCount.get(list));

        }
    }

    public static void printConcat(List <String> list1,List<String> list2){
        List newList=new ArrayList<>();
        System.out.println("merged List : "+newList.addAll(list1));
        System.out.println(list2);

    }

    public static void printShuffle(List <String> linklist){
        Collections.shuffle(linklist);
        System.out.println("Shuffle List : "+ linklist);

    }
    public static void printSameList(Integer index,List<String> list){
        List newList=new ArrayList<>();
        newList.addAll(index,list);
        System.out.println("new List : "+newList);
    }
    public static List[] printOddList(List<Integer> numlist, Integer index){
        List newList[]= new ArrayList[]{};
        int count=0;

        for (int i=0;i< newList.length;i++) {
            if (newList.length%2== 0) {

            }
        }
        System.out.println("Print odd place : "+numlist.indexOf(2)+" "+numlist.indexOf(4));
        return newList;
    }
    public static void printUnique(Map <String,Integer> maplist){
        System.out.println("Print unique value : "+maplist.keySet());

    }
    public static void printListofIntersection(Set<String> detail1,Set <String> details2){
        Set<String > intersection=new HashSet<>();
        String newdetail= String.valueOf(detail1.contains(details2));
        System.out.println("New Details : "+newdetail);

        intersection.addAll(detail1);
        if(detail1.contains(details2)){
            intersection.add(detail1.toString());
        }
        System.out.println("Intersection of Name : "+intersection);

    }
    public static void numberOfLetters(Map<String,Integer> details){
        for (Map.Entry<String, Integer> sEntry : details.entrySet()) {
            String name=sEntry.toString();
            System.out.println("length of name : "+ (name.length()-3));

        }

    }
    public static void nullReplceUnkown(Map<String,String> detail){
        for (Map.Entry<String, String> stringStringEntry : detail.entrySet()) {
            String replacing= detail.values().toString();
            if (replacing.equals("null")){

            }
        }


    }


















}
