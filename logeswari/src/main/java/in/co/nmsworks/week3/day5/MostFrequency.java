package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MostFrequency {

    public static void printMostFrequency(){
        List<Integer[]> list=new ArrayList<>();
        list.add(new Integer[]{4,7,7,7,1,1,8});
        for(Integer[] n:list)
        System.out.println(Collections.frequency(list,n));
        }

    public static void main(String[] args) {
        printMostFrequency();

    }
}
