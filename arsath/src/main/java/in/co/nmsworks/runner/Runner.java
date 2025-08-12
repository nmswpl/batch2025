package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day1.Teacher;
import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day2.*;

public class Runner {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee();
        Employee partTime = new PartTimeEmployee();
        Employee contractorEmp = new Contractor();

        fullTime.calculateSalary();
        partTime.calculateSalary();
        contractorEmp.calculateSalary();

        Dog a = new Dog();
    }
}
