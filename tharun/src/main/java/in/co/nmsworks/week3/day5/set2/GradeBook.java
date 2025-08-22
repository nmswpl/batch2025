package in.co.nmsworks.week3.day5.set2;

import java.util.*;

/**
 * 2. Tracking Students' Grades
 * Problem: You are building a gradebook for a school. Implement a program that:
 * Takes a list of students with their grades.
 * Calculates the average grade for each student.
 * Finds the highest average grade among all students.
 * Example:
 * Students = {
 *     "John" -> [85, 90, 88],
 *     "Alice" -> [90, 91, 92],
 *     "Bob" -> [70, 75, 80]
 * }
 * Output:
 * - John: Average = 87.67
 * - Alice: Average = 91.00
 * - Bob: Average = 75.00
 * - Highest Average: Alice (91.00)
 */

public class GradeBook {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        Map<String , List<Integer>> students = gradeBook.studentsMarkCreation();
        System.out.println(students);
        gradeBook.AverageMark(students);
    }

    private Map<String, List<Integer>> studentsMarkCreation() {
        Map<String , List<Integer>> students = new HashMap<>();
        List<Integer> johnMark = new ArrayList<>();
        johnMark.add(85);
        johnMark.add(90);
        johnMark.add(88);
        students.put("John",johnMark);

        List<Integer> aliceMark = new ArrayList<>();
        aliceMark.add(90);
        aliceMark.add(91);
        aliceMark.add(92);
        students.put("Alice",aliceMark);

        List<Integer> bobMark = new ArrayList<>();
        bobMark.add(70);
        bobMark.add(75);
        bobMark.add(80);
        students.put("Bob",bobMark);
        return students;
    }

    private void AverageMark(Map<String, List<Integer>> students) {
        Map<String,Float> studentAverage = new HashMap<>();
        for (Map.Entry<String, List<Integer>> studentEntry : students.entrySet()) {
            float totalMark = 0f;
            int subjectCount =0;
            for (Integer mark : studentEntry.getValue()) {
                totalMark += mark;
                subjectCount++;
            }
            float average = totalMark / subjectCount;
            studentAverage.put(studentEntry.getKey(),average);
        }
        System.out.println(studentAverage);
        String name = null;
        float highestAverageMark = 0f;
        for (Map.Entry<String, Float> studentAndMark : studentAverage.entrySet()) {
            if (studentAndMark.getValue() > highestAverageMark){
                name = studentAndMark.getKey();
                highestAverageMark = studentAndMark.getValue();
            }
        }
        System.out.println("Highest Average : "+ name +" (" + highestAverageMark +")");
    }
}
