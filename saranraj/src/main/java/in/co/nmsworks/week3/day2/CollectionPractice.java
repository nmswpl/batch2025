package in.co.nmsworks.week3.day2;

import java.util.*;
import java.util.stream.IntStream;

public class CollectionPractice  {
    public static void main(String[] args) {
       CollectionPractice collectionPractice = new CollectionPractice();

       collectionPractice.iterateAndDisplayCollections();
       collectionPractice.removeDuplicateAndPrintOriginalColor();
       collectionPractice.printColorsFromSpecificIndexRange();
       collectionPractice.findAndPrintLongestColorName();
       collectionPractice.printNoOfTimesColorPresentInCollection();
        System.out.println("------------------------------");

       collectionPractice.mergeAndDisplayTwoList();
       collectionPractice.reverseAllElementAndDisplay();
       collectionPractice.mergeTwoListIntoThirdList();
       collectionPractice.removeEvenNumberAndDisplay();
       collectionPractice.removeDuplicateAndValueInMap();
       collectionPractice.findAndDisplayTheIntersectionOfTwoSet();
       collectionPractice.findAndDisplayNameAndAge();
       collectionPractice.replaceNullValueAndDisplay();

     }

    private void replaceNullValueAndDisplay() {
        Map<String,String > names = new HashMap<>();
        names.put("saran",null);
        names.put("ashik",null);
        names.put("tharun",null);
        names.put("subash",null);
        names.put("kabil",null);

        Map<String,String> nullReplaced = getReplacedValue(names);
        System.out.println(nullReplaced);
    }

    private Map<String, String> getReplacedValue(Map<String, String> names) {
        Map<String,String > replacedValue = new HashMap<>();
        for (Map.Entry<String,String> v : names.entrySet()) {
             v.setValue("Unkown");
        }
        return names;
    }


    private void findAndDisplayNameAndAge() {

        List<String> nameAsList =new ArrayList<>(Arrays.asList("saran","ashik","tharun","subash","kabil"));
        Map<String,Integer> names = getNameAndAge(nameAsList);

        System.out.println("Display Name And Age :");
        for (Map.Entry<String,Integer> name : names.entrySet()) {
            System.out.println("Name : "+name.getKey()+" &  Age : "+name.getValue());
        }

    }

    private Map<String, Integer> getNameAndAge(List<String> nameAsList) {
        Map<String,Integer> names= new HashMap<>();
        for (String value : nameAsList) {
            names.put(value,value.length());
        }
        return names;
    }

    private void findAndDisplayTheIntersectionOfTwoSet() {
        Set<String> set1 = new HashSet<>(Arrays.asList("Red", "Green", "Blue","Black"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Red","Blue"));


        Set<String> intersectionOfBothSet = getResultOfIntersectionOfBothSet(set1, set2);
        System.out.println(set1);

    }

    private Set<String> getResultOfIntersectionOfBothSet(Set<String> set1, Set<String> set2) {

        set1.retainAll(set2);
        return set1;
    }


    private void removeDuplicateAndValueInMap() {

        List<String> colors = new ArrayList<>(Arrays.asList("saran","ashik","tharun","kabil","subash","saran","ashik"));
        Set<String> removeDuplicate = new HashSet<>();

        for (int i = 0; i < colors.size(); i++) {
            removeDuplicate.add(colors.get(i));
        }
        Map<String,Integer> uniqueNames = new HashMap<>();
        int index=0;
        for (String i : removeDuplicate) {
            uniqueNames.put(i,index++);
        }


        for (Map.Entry<String,Integer> value : uniqueNames.entrySet()) {
            System.out.println("key : "+value.getKey() +" "+"value : "+value.getValue());
        }
    }

    private void removeEvenNumberAndDisplay() {
        List<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> remainingNumbers =getRemoveEvenNumber(number);
        Collections.sort(remainingNumbers);
        System.out.println("The Removed number : " + remainingNumbers);
    }

    private List<Integer> getRemoveEvenNumber(List<Integer> number) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) %2 !=0) {
                oddNumbers.add(number.get(i));
            }
        }
        return oddNumbers;
    }

    private void mergeTwoListIntoThirdList() {
        List<String> list1 = Arrays.asList("Red", "Green", "Blue");
        List<String> list2 = Arrays.asList("Yellow", "Black", "White");
        List<String> result =new ArrayList<>(list1);

        result.addAll(list2);
        System.out.println("The Merged List are : "+result);

    }

    private void reverseAllElementAndDisplay() {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

        reverseColor(colors);

        System.out.println("The reverse Order of linkedList : "+colors);

    }

    private void reverseColor(LinkedList<String> colors) {
        int i=0; int j=colors.size()-1;
        while(i<j) {
            String temp = colors.get(i);
            colors.set(i,colors.get(j));
            colors.set(j,temp);
            i++;
            j--;
        }
    }

    private void mergeAndDisplayTwoList() {
        List<String> list1 =new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Yellow", "Black", "White"));
         list1.addAll(list2);
        System.out.println("The Merged List 2 in List 1 : "+list1);


    }

    private void printNoOfTimesColorPresentInCollection() {
        List<String> collection = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Green", "Blue"));

        Map<String,Integer> noOfColors = new HashMap<>();


        for (String color : collection) {
            noOfColors.put(color, noOfColors.getOrDefault(color, 0) + 1);
        }

        for (Map.Entry<String,Integer> color : noOfColors.entrySet()) {
            System.out.println("Color Name : "+ color.getKey() +" and "+ color.getValue()+" times ");
        }
    }

    private void findAndPrintLongestColorName() {
        List<String> color=new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));

        String longestColorName= "";
        for (String colors :color) {
            if (colors.length() >longestColorName.length()) {
                longestColorName =colors;
            }
        }
        System.out.println("The Longest Color Name : " +longestColorName);

    }

    private void printColorsFromSpecificIndexRange() {
        List<String> colors=new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));

        System.out.println(colors.subList(1,4));
    }

    private void removeDuplicateAndPrintOriginalColor() {
        String[] color = {"Red","Green","Blue", "Yellow", "Green","Blue"};

        Set<String> colors = new HashSet<>();
        for (int i = 0; i < color.length; i++) {
            colors.add(color[i]);
        }
        System.out.println("The Original Colors : ");
       for (String colorValue : colors) {
           System.out.println(colorValue);
       }


    }

    private void iterateAndDisplayCollections() {
        Map<String,Integer> collection = new HashMap<>();
        collection.put("Car",4);
        collection.put("Bike",2);
        collection.put("Cycle",2);
        collection.put("Plane",6);
        collection.put("Jeep",4);
        collection.put("Ship",0);
        collection.put("Auto",3);
        collection.put("Boat",0);
        collection.put("Helicopter",0);

        for (Map.Entry<String,Integer> vehicles : collection.entrySet()) {
            if (vehicles.getValue() == 2) {
                System.out.println(vehicles.getKey() +" is a Two Wheeler ");
            }
        }
    }
}
