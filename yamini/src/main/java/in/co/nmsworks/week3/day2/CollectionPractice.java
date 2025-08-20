package in.co.nmsworks.week3.day2;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        CollectionPractice cp = new CollectionPractice();
        Map<String, Integer> vehicles = new HashMap<>();
        vehicles.put("Car", 4);
        vehicles.put("Bike", 2);
        vehicles.put("Bus", 4);
        vehicles.put("Cycle", 2);
        vehicles.put("Plane", 0);
        vehicles.put("Jeep", 4);
        vehicles.put("Ship", 0);
        vehicles.put("Auto", 3);
        vehicles.put("Boat", 0);
        vehicles.put("Helicopter", 0);
        cp.printTwoWheeler(vehicles);

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        List<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Black");
        list2.add("White");

        LinkedList<String> inputList = new LinkedList<>();
        inputList.add("Mini");
        inputList.add("Heena");
        inputList.add("Fayas");
        inputList.add("Pavi");

        ArrayList<Integer> input1 = new ArrayList<>();
        input1.add(1);
        input1.add(2);
        input1.add(3);

        ArrayList<Integer> input2 = new ArrayList<>();
        input2.add(4);
        input2.add(5);
        input2.add(6);

        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);

        Set<String>set1=new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Mango");
        set1.add("Grapes");

        Set<String>set2=new HashSet<>();
        set2.add("Guava");
        set2.add("Apple");
        set2.add("Pine");
        set2.add("Mango");

        Map<String,String> exampleMap=new HashMap<>();
        exampleMap.put("Heenu",null);
        exampleMap.put("Yamini","abc");
        exampleMap.put("Pavi","cgh");
        exampleMap.put("mini",null);

        System.out.println("exampleMap" + exampleMap);




        cp.removeDuplicates(colors);
        cp.printSubList(colors, 1, 3);
        cp.longestColor(colors);
        cp.printCount(colors);
        cp.mergeLists(list1, list2);
        LinkedList<String> result = cp.reverseList(inputList);
        System.out.println(result);

        cp.mergeArrayList(input1, input2);
        cp.removeEven(integerList);
        cp.printName(colors);
        cp.intersectionOfSets(set1,set2);
        cp.result(vehicles);
        //cp.replaceNull(exampleMap);

    }

    public void printTwoWheeler(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() == 2) {
                System.out.println(stringIntegerEntry.getKey() + " is a Two Wheeler");
            }
        }

    }

    public void removeDuplicates(List<String> colors) {
        Set<String> setOfColors = new HashSet<>();
        setOfColors.addAll(colors);
        System.out.println("Without Duplicates: " + setOfColors);

    }

    public void printSubList(List<String> colors, int begin, int end) {
        System.out.println("Sublist: " + colors.subList(begin, end + 1));
    }

    public void longestColor(List<String> colors) {
        int maxLength = Integer.MIN_VALUE;
        int index = 0;
        for (String color : colors) {
            if (color.length() > maxLength) {
                maxLength = color.length();
                index++;
            }
        }
        System.out.println("Longest color: " + colors.get(index));

    }

    public void printCount(List<String> input) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < input.size() - 1; i++) {
            if (!result.contains(input.get(i))) {
                result.add(input.get(i));
                int count = 0;
                for (int j = 0; j < input.size(); j++) {
                    if (input.get(i).equals(input.get(j))) {
                        count++;
                    }
                }

                System.out.println(input.get(i) + ": " + count);
            }

        }
    }

    public void mergeLists(List<String> list1, List<String> list2) {
        List<String> merge = new ArrayList<>();
        merge.addAll(list1);
        merge.addAll(list2);
        System.out.println("Merged List: " + merge);

    }

    public LinkedList<String> reverseList(LinkedList<String> input) {
        input = input.reversed();
        return input;

    }

    public void mergeArrayList(ArrayList<Integer> obj1, ArrayList<Integer> obj2) {
        ArrayList<Integer> result = new ArrayList<>(obj1);
        result.addAll(obj2);
        System.out.println("Merged ArrayList: r" + result);
    }

    public void removeEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 != 0) {
                result.add(i);
            }

        }
        System.out.println(result);
    }

    public void printName(List<String>names){
       Set<String>nameSet=new HashSet<>(names);
       Map<String,Integer> nameMap=new HashMap<>();
       Integer index=1;
        for (String s : nameSet) {
            nameMap.put(s,index);
            index++;
        }
        System.out.println(nameMap);
    }

    public void intersectionOfSets(Set<String>set1,Set<String>set2){
        Set<String>resultset=new HashSet<>();
        for (String s : set1) {
            if(set2.contains(s)){
                resultset.add(s);
            }
        }
        System.out.println(resultset);
    }

    public void result(Map<String,Integer>input){
        Map<String,Integer>newMap=new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : input.entrySet()) {

        }
        System.out.println(newMap);

    }

    /*public void replaceNull(Map<String,String>inputMap){
        for (String keys : inputMap.keySet()) {
            if(){
                keys.
                values.getValue().replace(null,"Unknown");
        }
        }
        System.out.println(inputMap);

    }*/
}



