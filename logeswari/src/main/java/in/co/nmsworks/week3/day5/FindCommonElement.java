package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class FindCommonElement {
    public static void printFindCommonElement(){

        List<Integer[]> element = new ArrayList<>();
        element.add(new Integer[]{1, 2, 3});
        element.add(new Integer[]{2, 3, 4});
        element.add(new Integer[]{2, 5, 6});

        Integer[] one=element.get(2);
        System.out.println("common element : "+element.subList(1,2));
        for(Integer[] o:element){
            if (element.contains(2)){
                System.out.println("2");
            }
        }


    }

    public static void main(String[] args) {
        printFindCommonElement();

    }
}
