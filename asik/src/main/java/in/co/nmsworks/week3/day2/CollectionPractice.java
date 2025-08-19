package in.co.nmsworks.week3.day2;

import java.util.*;

public class CollectionPractice
{
    public static void main(String[] args)
    {
        CollectionPractice cp = new CollectionPractice();

        Map<String, Integer> vehicle = new HashMap<>();

        vehicle.put("Car", 4);
        vehicle.put("Bike", 2);
        vehicle.put("Bus", 4);
        vehicle.put("Cycle", 2);
        vehicle.put("Plane", 4);
        vehicle.put("Jeep", 4);
        vehicle.put("Ship", 0);
        vehicle.put("Auto", 3);
        vehicle.put("Boat", 0);
        vehicle.put("Helicopter", 0);
        // Q1
        cp.printTwoWheelers(vehicle);

        List<String> colors = new ArrayList<>();
        Collections.addAll(colors, "Red", "Green", "Blue", "Yellow", "Green", "Blue");
        // Q2
        cp.removeDuplicateAndPrintColors(colors);

        colors.clear();
        Collections.addAll(colors, "Red", "Green", "Blue", "Yellow", "Orange");
        // Q3
        cp.printColorsWithFromAndEndIndex(colors, 1, 3);
        // Q4
        System.out.println("Longest Color Name is " + cp.getLongestColorName(colors));
        // Q5
        cp.printFrequencyOfColors();

        List<String> list1 = Arrays.asList("Red", "Green", "Blue");
        List<String> list2 = Arrays.asList("Yellow", "Black", "White");
        // Q1
        List<String> result = cp.mergeTwoList(list1, list2);
        System.out.println("Merged List : " + result);

        List<String> linkedListReverse = new LinkedList<>();
        Collections.addAll(linkedListReverse, "Red", "Green", "Blue", "Yellow", "Black", "White");
        // Q2
        linkedListReverse = cp.reverseTheLinkedList(linkedListReverse);
        System.out.println("Reversed LinkedList : " + linkedListReverse);

        List<String> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList1, "Red", "Green", "Blue");
        Collections.addAll(arrayList2, "Yellow", "Black", "White");
        // Q3
        List<String> mergedArrayList = cp.mergeTwoArrayList(arrayList1, arrayList2);
        System.out.println(mergedArrayList);

        List<Integer> evenRemoved = new ArrayList<>();
        Collections.addAll(evenRemoved, 5,10,3,6,1);
        // Q4
        cp.evenRemoved(evenRemoved);
        Collections.sort(evenRemoved);
        System.out.println(evenRemoved);


        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Saran", "Sanjeev", "Harish", "Rajesh");
        // Q5
        cp.removeDuplicateUseMapAndPrint(names);

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Collections.addAll(set1, "Red", "Green", "Blue");
        Collections.addAll(set2, "Yellow", "Green", "Blue");
        // Q6
        Set<String> intersection = cp.getIntersectionOfSets(set1, set2);
        System.out.println(intersection);

        Map<String, Integer> nameAndLettersMap = new HashMap<>();
        nameAndLettersMap.put("Sanjay", 20);
        nameAndLettersMap.put("Saran", 22);
        nameAndLettersMap.put("Shatish", 21);
        nameAndLettersMap.put("Pratheep", 25);
        // Q7
        cp.nameAndAgeMap(nameAndLettersMap);
        for (Map.Entry<String, Integer> map : nameAndLettersMap.entrySet())
        {
            System.out.println("Name is " + map.getKey() + " And The No of Letters in the Name : " + map.getValue());
        }

        Map<String, String> unknownValueMap = new HashMap<>();
        unknownValueMap.put("Sanjay", null);
        unknownValueMap.put("Saran", null);
        unknownValueMap.put("Shatish", null);
        unknownValueMap.put("Pratheep", null);
        // Q8
        cp.makeNullUnknown(unknownValueMap);

        for (Map.Entry<String, String> map : unknownValueMap.entrySet())
        {
            System.out.println("Name is " + map.getKey() + " and Age is " + map.getValue());
        }

    }

    private void makeNullUnknown(Map<String, String> unknownValueMap)
    {
       for (Map.Entry<String, String> map : unknownValueMap.entrySet())
       {
           if (map.getValue() == null)
           {
               map.setValue("Unknown");
           }
       }
    }

    private void nameAndAgeMap(Map<String, Integer> nameAndLettersMap)
    {
        for (Map.Entry<String, Integer> map : nameAndLettersMap.entrySet())
        {
            map.setValue(map.getKey().length());
        }
    }

    private Set<String> getIntersectionOfSets(Set<String> set1, Set<String> set2)
    {
        Set<String> intersectiion = new HashSet<>();
        intersectiion.addAll(set1);
        intersectiion.retainAll(set2);
        return intersectiion;
    }

    private void removeDuplicateUseMapAndPrint(List<String> names)
    {
        Map<String, Integer> nameAndIdMap = new HashMap<>();
        int id = 0;

        for (String name : names)
        {
            nameAndIdMap.put(name, id++);
        }

        for (Map.Entry<String, Integer> entry : nameAndIdMap.entrySet())
        {
            System.out.println("Name is " + entry.getKey() + " And ID is " + entry.getValue());
        }
    }

    private void evenRemoved(List<Integer> list)
    {
        int i = 0;
        while (i < list.size())
        {
            if (list.get(i) % 2 == 0)
            {
                list.remove(i);
                i--;
            }
            i++;
        }
    }

    private List<String> mergeTwoArrayList(List<String> arrayList1, List<String> arrayList2)
    {
        List<String> result = new ArrayList<>();
        result.addAll(arrayList1);
        result.addAll(arrayList2);
        return result;
    }

    private List<String> reverseTheLinkedList(List<String> linkedListReverse)
    {
        return linkedListReverse.reversed();
    }

    private ArrayList<String> mergeTwoList(List<String> list1, List<String> list2)
    {
        ArrayList<String> listArray1 = new ArrayList<>(list1);
        ArrayList<String> listArray2 = new ArrayList<>(list2);
        listArray1.addAll(listArray2);
        return listArray1;
    }


    private void printFrequencyOfColors()
    {
        Map<String, Integer> mapColors = new HashMap<>();

        mapColors.put("Red", mapColors.getOrDefault("Red" ,0) + 1);
        mapColors.put("Green", mapColors.getOrDefault("Green" ,0) + 1);
        mapColors.put("Blue", mapColors.getOrDefault("Blue" ,0) + 1);
        mapColors.put("Yellow", mapColors.getOrDefault("Yellow" ,0) + 1);
        mapColors.put("Green", mapColors.getOrDefault("Green" ,0) + 1);

        for (Map.Entry<String, Integer> color : mapColors.entrySet())
        {
            System.out.println("Frequency of Color " + color.getKey() + " is " + color.getValue());
        }
    }

    private String getLongestColorName(List<String> colors)
    {
        int max = 0;
        String longestColor = colors.get(0);
        for (String color : colors)
        {
            if (color.length() > max)
            {
                max = color.length();
                longestColor = color;
            }
        }
        return longestColor;
    }

    private void printColorsWithFromAndEndIndex(List<String> colors, int startIndex, int endIndex)
    {
        List<String> subList = colors.subList(startIndex, endIndex+1);
        System.out.print("Colors From the Index " + startIndex + " To " + endIndex + " are : ");

        for (String s : subList)
        {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private void removeDuplicateAndPrintColors(List<String> colors)
    {
        Set<String> set = new HashSet<>();
        int i = 0;
        while (i < colors.size())
        {
                if (!set.contains(colors.get(i)))
                {
                    set.add(colors.get(i));
                }
                else
                {
                    colors.remove(i);
                    i--;
                }
                i++;
        }
        System.out.print("Values After Deduplication : ");
        for (String color : colors)
        {
            System.out.print(color + " ");
        }
        System.out.println();
    }

    private void printTwoWheelers(Map<String, Integer> vehicle)
    {
        for (Map.Entry<String, Integer> map : vehicle.entrySet())
        {
            if (map.getValue() == 2)
            {
                System.out.println(map.getKey() + " is a 2 Wheeler");
            }
        }
    }
}
