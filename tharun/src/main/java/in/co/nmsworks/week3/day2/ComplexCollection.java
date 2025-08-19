package in.co.nmsworks.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexCollection
{
    Map<String, List<Integer[]>> cityToTempList = new HashMap<>();

    public static void main(String[] args) {
        ComplexCollection cc = new ComplexCollection();

        Integer [] day1 = {20,25};
        Integer [] day2 = {28,38};
        Integer [] day3 ={29,27};
        ArrayList<Integer[]> list1 = new ArrayList<>();
        list1.add(day1);
        list1.add(day2);
        list1.add(day3);
        List<Integer[]> list2 = new ArrayList<>();
        List<Integer[]> list3 = new ArrayList<>();
        List<Integer[]> list4 = new ArrayList<>();




        cc.cityToTempList.put("Chennai",list1);
        cc.cityToTempList.put("Trichy",  list2);
        cc.cityToTempList.put("Tindivanam", list3);
        cc.cityToTempList.put("Villupuram", list4);
    }

}
