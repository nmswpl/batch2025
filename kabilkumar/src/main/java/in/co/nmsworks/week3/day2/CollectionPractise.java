package in.co.nmsworks.week3.day2;

import java.util.*;

/*Add the Following Vehicles to a Collection.
	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".
 */
public class CollectionPractise
{
    public static void main(String[] args)
    {
        Map<String ,Integer> vechiles = new HashMap<>();
        vechiles.put("car",4);
        vechiles.put("Bike",2);
        vechiles.put("Bus",6);
        vechiles.put("Cycle",2);
        vechiles.put("Plane",6);
        vechiles.put("Ship",0);
        vechiles.put("Auto",3);
        vechiles.put("Boat",0);
        vechiles.put("Helicopter",0);

        CollectionPractise cp = new CollectionPractise();
        cp.noOfWheels(vechiles);

        List <String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        noOfcolorsDuplicate( colors);

        List<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Blue");
        colors1.add("Yellow");
        colors1.add("Orange");
        indexIncluAndExclu(colors1);
        longestColor(colors1);

       List<String > colors2 = new ArrayList<>();
        colors2.add("Red" );
        colors2.add("Green");
        colors2.add("Blue" );
        colors2.add("Yellow");
        colors2.add("Green" );
        colors2.add("Blue");
        noOfTimePresent(colors2);


        List<String> list1 = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        List<String> list2 = Arrays.asList("Yellow", "Black", "White");
        mergeTheTwoList(list1 , list2);

        List<String> reverseString = new LinkedList<>();
        reverseString.add("Red");
        reverseString.add("Green");
        reverseString.add("yellow");
        reverseString.add("Black");
        reverseWithoutAdditionalCon(reverseString);

        List<String> arrList1 = new ArrayList<>();
        arrList1.add("this");
        arrList1.add("is");
        arrList1.add("the");

        List<String> arrList2 = new ArrayList<>();
        arrList2.add("java");
        arrList2.add("program");
        arrList2.add("trainning");
        arrayList1(arrList1 , arrList2);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        removeEvenNumbers(numbers);

        List<String> names = new ArrayList<>();
        names.add("harish");
        names.add("kabil");
        names.add("Kumar");
        names.add("harish");
        names.add("Kumar");
        names.add("KK");

        Set<String> copyNames = new HashSet<>();
        copyNames.add("harish");
        copyNames.add("kabil");
        copyNames.add("kumar");
        positionValue(names);
        
    }
    public  static void  positionValue(List<String> names)
    {
        Map<String, Integer> positionValue = new HashMap<>();

        for (String name : names) {
            positionValue.put(name,names.indexOf(name));
        }
        System.out.println(positionValue);
    }
    public  static  void  removeEvenNumbers(List<Integer> numbers)
    {
        List<Integer> addNonEvens = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++)
        {
            if (numbers.get(i) %2 != 0)
            {
                    addNonEvens.add(numbers.get(i));
            }
        }
        System.out.println("non even numbers :"+addNonEvens);
    }

    public  static  void  arrayList1(List<String> arrList1 , List<String> arrList2)
    {
        List<String> combinedTwoArray = new ArrayList<>();
        combinedTwoArray.addAll(arrList1);
        combinedTwoArray.addAll(arrList2);
        System.out.println("C0mdined to array :" +combinedTwoArray);
    }
    public  static  void reverseWithoutAdditionalCon(List<String> reverseString)
    {
     List<String>  toPrintAnswer = new LinkedList<>();
        for (int i = reverseString.size() -1; i >= 0; i--)
        {
            toPrintAnswer.add(reverseString.get(i));
        }
        System.out.println("the Orginal String :" +reverseString);
        System.out.println("After reveresed String : "+toPrintAnswer);

    }
    public static void mergeTheTwoList(List<String> list1 ,List<String> list2)
    {
        List<String> printCompinedList = new ArrayList<>();
        list1.addAll(list2);
        printCompinedList.addAll(list1);
        System.out.println("The compined List1 and List2 :"+printCompinedList);
    }

    public  static void  noOfTimePresent(List<String> colors2)
    {
        List<String>  emptyCopy  = new ArrayList<>();
        for (int i = 0; i < colors2.size() -1; i++)
        {
            if (!emptyCopy.contains(colors2.get(i)))
            {
                emptyCopy.add(colors2.get(i));
                int count = 0;
                for (int j = 0; j < colors2.size() ; j++)
                {
                    if (colors2.get(i) == colors2.get(j)) {
                        count++;
                    }
                }
                System.out.println(colors2.get(i) +" "+count);
            }

        }
    }
    public static void longestColor(List<String> colors1)
    {
        int maximumLength = 0;
        int index = 0;
        for (String string : colors1)
        {
            if (string.length() > maximumLength)
            {
                maximumLength = string.length();
                index++;
            }
        }
        System.out.println("The colors Maximum length : "+colors1.get(index));
    }

    public  static  void indexIncluAndExclu(List<String> colors1)
    {
        System.out.println("Using SubList :" +colors1.subList(1,4));

    }
    public   static void  noOfcolorsDuplicate(List<String> colors)
    {
        List<String> emptyCopy = new ArrayList<>();
        for (int i = 0; i < colors.size(); i++)
        {
            if (!emptyCopy.contains(colors.get(i)))
            {
                emptyCopy.add(colors.get(i));
            }

        }
        System.out.println("After duplicates :"+emptyCopy);
        
    }
    public  void  noOfWheels(Map<String,Integer> vechiles)
    {
        for (Map.Entry<String, Integer> stringIntegerEntry : vechiles.entrySet())
        {
            if (stringIntegerEntry.getValue() == 2)
            {
                System.out.println("The Vechile has 2 vheels :"+stringIntegerEntry.getKey());
            }

        }
    }

}
