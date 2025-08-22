package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentceGrade {

    public static void printStudentGrade() {
        Map<String, Integer[]> grade = new HashMap<>();
        int sumj = 0;
        int suma = 0;
        int sumb = 0;
        grade.put(new String("john"), new Integer[]{85, 90, 88});
        grade.put(new String("alice"), new Integer[]{90, 91, 92});
        grade.put(new String("bob"), new Integer[]{70, 75, 80});
        Integer[] integers1 = grade.get("john");
        Integer[] integers2 = grade.get("alice");
        Integer[] integers3 = grade.get("bob");

        for (int markj : integers1) {
            sumj += markj;
        }
        for (float marka : integers2) {
            suma += marka;
        }
        for (int markb : integers3) {
            sumb += markb;
        }

        System.out.println("john sum of mark : " + (sumj/3));
        System.out.println("alice sum of mark : " + (suma/3));
        System.out.println("bob sum of mark : " + (sumb/3));

        System.out.println("Highest Average: Alice "+suma);


    }

    public static void main(String[] args) {
        printStudentGrade();

    }

}
