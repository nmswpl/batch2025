package in.co.nmsworks.week3.day5;


/* 2. Tracking Students' Grades
Problem: You are building a gradebook for a school. Implement a program that:
Takes a list of students with their grades.
Calculates the average grade for each student.
Finds the highest average grade among all students.
Example:
Students = {
    "John" -> [85, 90, 88],
    "Alice" -> [90, 91, 92],
    "Bob" -> [70, 75, 80]
}
Output:
- John: Average = 87.67
- Alice: Average = 91.00
- Bob: Average = 75.00
- Highest Average: Alice (91.00) */

import java.util.*;

public class StudentsGrade {
    public static void main(String[] args) {

        Map<String , List<Integer> >  studentsInfo = new HashMap<>();

        studentsInfo.put("John" , Arrays.asList(85,90,88) );
        studentsInfo.put("Alice" , Arrays.asList(90,91,92));
        studentsInfo.put("Bob" , Arrays.asList(70,75,80));



    }
}
