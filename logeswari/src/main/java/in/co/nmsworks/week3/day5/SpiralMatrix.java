package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void printSpiralMatrix(){
        List<Integer[]> spiralmat = new ArrayList<>();
        spiralmat.add(new Integer[]{1, 2, 3});
        spiralmat.add(new Integer[]{4, 5, 6});
        spiralmat.add(new Integer[]{7, 8, 9});


        Integer [] singleSpiral1= spiralmat.get(0);
        Integer [] singleSpiral2= spiralmat.get(1);
        Integer [] singleSpiral3= spiralmat.get(2);
        for (Integer i : singleSpiral1) {
            int store=i;
            System.out.print(+store +" ");

        }
        for (Integer i : singleSpiral2) {
            int store=i;
            System.out.print(store +" ");
        }
        for (Integer i : singleSpiral3) {
            int store=i;
            System.out.print(store+" ");
        }
    }

    public static void main(String[] args) {
        printSpiralMatrix();

    }

    }

