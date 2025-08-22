package in.co.nmsworks.week3.day5.set2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 9. Tracking Employee Hours
 * Problem: You are building an employee attendance system. Each employee has a name and a list of hours they worked each day. Write a program that:
 * Has the employee name and a list of hours worked each day.
 * Calculates the total hours worked by each employee.
 * Returns the name of the employee with the highest total hours.
 * Example:
 * "John" -> [8, 9, 7, 8],
 * "Alice" -> [9, 9, 8, 9],
 * "Bob" -> [7, 8, 7, 7]
 * Output: "Alice worked the most hours: 35 hours"
 */

public class TrackingEmployeeHour {
    public static void main(String[] args) {
        TrackingEmployeeHour trackingEmployeeHour = new TrackingEmployeeHour();

        Map<String, List<Integer>> employee = trackingEmployeeHour.employeeCreation();

        String [] employeeNameAndWorkingHour = trackingEmployeeHour.calculateEmployeeHours(employee);
        System.out.println(employeeNameAndWorkingHour[0] + " worked the most hours: " + employeeNameAndWorkingHour[1] + " hours");

    }

    private String[] calculateEmployeeHours(Map<String, List<Integer>> employee) {
        String [] employeeArray = new String[2];
        Map<String,Integer> employeeTotalWorkingHour = new HashMap<>();

        for (Map.Entry<String, List<Integer>> employeeEntry : employee.entrySet()) {
            int count = 0;
            for (Integer eachDayhour : employeeEntry.getValue()) {
                count += eachDayhour;
            }
            employeeTotalWorkingHour.put(employeeEntry.getKey(),count);
        }
        String employeeName = "";
        int maxWorkingHour = 0;
        for (Map.Entry<String, Integer> entry : employeeTotalWorkingHour.entrySet()) {
            if (entry.getValue() > maxWorkingHour ){
                maxWorkingHour = entry.getValue();
                employeeName = entry.getKey();
            }
        }

        employeeArray[0] = employeeName;
        employeeArray[1] = String.valueOf(maxWorkingHour);


        return employeeArray;
    }

    private Map<String, List<Integer>> employeeCreation() {

        Map<String, List<Integer>> employee = new HashMap<>();

        List<Integer> workingHour1 = new ArrayList<>();
        workingHour1.add(8);
        workingHour1.add(9);
        workingHour1.add(7);
        workingHour1.add(8);

        List<Integer> workingHour2 = new ArrayList<>();
        workingHour2.add(9);
        workingHour2.add(9);
        workingHour2.add(8);
        workingHour2.add(9);

        List<Integer> workingHour3 = new ArrayList<>();
        workingHour3.add(7);
        workingHour3.add(8);
        workingHour3.add(7);
        workingHour3.add(7);

        employee.put("John",workingHour1);
        employee.put("Alice",workingHour2);
        employee.put("Bob",workingHour3);

        return employee;
    }
}
