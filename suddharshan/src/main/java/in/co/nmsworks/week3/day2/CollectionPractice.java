package in.co.nmsworks.week3.day2;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        CollectionPractice c = new CollectionPractice();
        Map<String, Integer> Vehicle = new HashMap<>();
        Vehicle.put("Bike", 2);
        Vehicle.put("Car", 4);
        Vehicle.put("Bus", 4);
        Vehicle.put("Cycle", 2);
        Vehicle.put("Plane", 3);
        Vehicle.put("Jeep", 4);
        Vehicle.put("Ship", 0);
        Vehicle.put("Auto", 3);
        Vehicle.put("Boat", 0);
        Vehicle.put("Helicopter", 3);

        c.printTwoWheeler(Vehicle);

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        c.removeDuplicates(colors);

        List<String> colorsnew = new ArrayList<>();
        colorsnew.add("Red");
        colorsnew.add("Green");
        colorsnew.add("Blue");
        colorsnew.add("Yellow");
        colorsnew.add("Orange");
        c.printSubList(colorsnew, 1, 3);

        System.out.println("Longest Color: " + c.getLongestColor(colorsnew));
        System.out.println();

        c.findFrequencyOfColors(colors);

        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");
        List<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Black");
        list2.add("White");

        System.out.println("Merged List: "+c.getMergedList(list1, list2));
        List<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        c.printReversedList(l);

        c.printMergedListNew(list1, list2);

        List<Integer> lnum = new LinkedList<>();
        lnum.add(10);
        lnum.add(20);
        lnum.add(30);
        lnum.add(99);
        lnum.add(59);
        c.printNewListWithEvenAndSortOthers(lnum);
        System.out.println(colors);
        c.listToMap(colors);
        Set<String> colorSet = new HashSet<>();
        colorSet.add("Red");
        colorSet.add("Green");
        colorSet.add("Violet");
        c.removeDuplicates(colors);
        Set<String> colorSetNew = new HashSet<>();
        colorSetNew.add("Red");
        colorSetNew.add("Green");
        colorSetNew.add("Blue");
        colorSetNew.add("Yellow");
        colorSetNew.add("White");
        System.out.println(colorSetNew);
        System.out.println(colorSet);
        System.out.println("Intersection of List: " + c.getIntersectionOfLists(colorSetNew, colorSet));
        Map<String, Integer> names = new HashMap<>();
        names.put("Hari", 25);
        names.put("Krishna", 28);
        names.put("Gokul", 29);
        System.out.println("Name and Length "+c.getNameLengthCount(names));

        Map<String, String> nullMap = new HashMap<>();
        nullMap.put("Hari", "Present");
        nullMap.put("Krishna", null);
        nullMap.put("Gokul", null);
        System.out.println("New Map after replacing Null: " + c.replaceNull(nullMap));

    }

    public void printTwoWheeler(Map<String, Integer> m) {
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey() + " is a Two Wheeler");
            }
        }
    }

    public void removeDuplicates(List<String> l) {
        Set<String> s = new HashSet<>();
        for (String color : l) {
            if (s.add(color)) {
                System.out.println(color);
            }
        }
        System.out.println();
    }

    public void printSubList(List<String> l, int start, int end) {
        for (String s : l.subList(start, end + 1)) {
            System.out.println(s);
        }
        System.out.println();
    }

    public String getLongestColor(List<String> l) {
        String longest = " ";
        for (String s : l) {
            if (s.length() >= longest.length()) {
                longest = s;
            }
        }
        return "Longest Color: " + longest;
    }

    public void findFrequencyOfColors(List<String> l) {
        Map<String, Integer> m = new HashMap<>();
        for (String s : l) {
            if (m.containsKey(s)) {
                m.replace(s, m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }
        System.out.println("Frequency Map: " + m);
    }

    public List<String> getMergedList(List<String> l1, List<String> l2) {
        l1.addAll(l2);
        return l1;
    }

    public void printReversedList(List<Integer> l) {
        int start = 0, end = l.size() - 1;
        while (start < end) {
            Integer temp1 = l.get(start);
            Integer temp2 = l.get(end);
            l.set(start, temp2);
            l.set(end, temp1);
            start++;
            end--;
        }
        System.out.println(l);
    }

    public void printMergedListNew(List<String> l1, List<String> l2) {
        List<String> lnew = new ArrayList<>();
        l1.addAll(l2);
        lnew.addAll(l1);
        System.out.println(lnew);
    }

    public void printNewListWithEvenAndSortOthers(List<Integer> l) {
        List<Integer> lnew = new ArrayList<>();
        List<Integer> toRemove = new ArrayList<>();
        for (Integer i : l) {
            if (i % 2 == 0) {
                lnew.add(i);
                toRemove.add(i);
            }
        }
        l.removeAll(toRemove);
        Collections.sort(l);
        lnew.addAll(l);
        System.out.println(lnew);
    }

    public void listToMap(List<String> l) {
        Set<String> s = new HashSet<>();
        for (int i = 0; i < l.size(); i++) {
            if (s.contains(l.get(i))) {
                l.remove(i);
            } else {
                s.add(l.get(i));
            }
        }
        Map<String, Integer> m = new HashMap<>();
        for (String string : s) {
            m.put(string, l.indexOf(string));
        }
        System.out.println(m);
    }

    public Set<String> getIntersectionOfLists(Set<String> s1, Set<String> s2) {
        Set<String> s3 = new HashSet<>();
        for (String s : s1) {
            if (s2.contains(s)) {
                s3.add(s);
            }
        }
        return s3;
    }

    public Map<String, Integer> getNameLengthCount(Map<String, Integer> m) {
        Map<String, Integer> nameLength = new HashMap<>();
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            String s = entry.getKey();
            Integer i = s.length();
            nameLength.put(s, i);
        }
        return nameLength;
    }

    public Map <String,String> replaceNull(Map<String, String> m) {
        Map<String, String> replaceNull = new HashMap<>();
        for (Map.Entry<String, String> entry : m.entrySet()) {
            String x = entry.getValue();
            if (x == null) {
                replaceNull.put(entry.getKey(), "Unknown");
            } else {
                replaceNull.put(entry.getKey(), x);
            }
        }
        return replaceNull;
    }
}
