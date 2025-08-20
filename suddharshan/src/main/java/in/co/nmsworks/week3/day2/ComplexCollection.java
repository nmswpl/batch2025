package in.co.nmsworks.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexCollection {

    private static Map<String, List<Integer[]>> tempList = new HashMap<>();

    public static void main(String[] args) {

        List<Integer[]> chnTempList = new ArrayList<>();
        chnTempList.add(new Integer[] {25,33});
        chnTempList.add(new Integer[] {24,32});
        chnTempList.add(new Integer[] {25,34});
        tempList.put("Chennai",chnTempList);

        List<Integer[]> vpmTempList = new ArrayList<>();
        vpmTempList.add(new Integer[] {22,30});
        vpmTempList.add(new Integer[] {21,29});
        vpmTempList.add(new Integer[] {20,29});
        tempList.put("Villupuram",vpmTempList);

        List<Integer[]> mduTempList = new ArrayList<>();
        mduTempList.add(new Integer[]{25,35});
        mduTempList.add(new Integer[]{27,35});
        mduTempList.add(new Integer[]{26,34});
        tempList.put("Madurai",mduTempList);

        List<Integer[]> triTempList = new ArrayList<>();
        triTempList.add(new Integer[]{28,35});
        triTempList.add(new Integer[]{26,33});
        triTempList.add(new Integer[]{27,34});
        tempList.put("Trichy",triTempList);
    }
}
