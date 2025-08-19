package in.co.nmsworks.week3.day2;

import java.util.*;

public class ComplexCollection {

    public static Map<String ,List<Integer[]>> cityTOTempList = new HashMap<>();


    public static void main(String[] args) {

        List<Integer[]> list1 = new ArrayList<>();
        List<Integer[]> list2 = new ArrayList<>();
        List<Integer[]> list3 = new ArrayList<>();
        List<Integer[]> list4 = new ArrayList<>();

        list1.add(new Integer[]{60,40});
        list1.add(new Integer[]{55,30});
        list1.add(new Integer[]{44,41});

        list2.add(new Integer[]{69,46});
        list2.add(new Integer[]{56,32});
        list2.add(new Integer[]{34,43});

        list3.add(new Integer[]{66,48});
        list3.add(new Integer[]{57,32});
        list3.add(new Integer[]{41,21});

        list4.add(new Integer[]{66,43});
        list4.add(new Integer[]{67,30});
        list4.add(new Integer[]{61,21});

        cityTOTempList.put("Chennai", list1);
        cityTOTempList.put("Madurai",list2);
        cityTOTempList.put("Trichy",list3);
        cityTOTempList.put("Villupuram",list4);
    }
}
