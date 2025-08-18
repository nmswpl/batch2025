package in.co.nmsworks.week2.test.set2;

import javax.swing.*;

public class TestRunner {

    public static void main(String[] args) {

        printAndCalculateAverageSalaryOfIntern();


    }

    private static void printAndCalculateAverageSalaryOfIntern() {
        Intern[] intern = {new Intern("Saran", 10000),
                new Intern("Ashik", 13000),
                new Intern("Tharun", 11000),
                new Intern("subash",12000),
                new Intern("raj",14000)
        };

        double averageSalary;
        int total=0;
        for (Intern value : intern) {
            total += value.getSalary();
        }

        averageSalary = (double) total / intern.length;
        System.out.println("The Average Salary of All Intern : "+ averageSalary);
    }
}
