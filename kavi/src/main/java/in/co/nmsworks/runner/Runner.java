package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.Candidate;
import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;
import in.co.nmsworks.week2.day2.*;

import java.awt.image.SampleModel;

import static in.co.nmsworks.week2.day2.Employee.calculateSalar;

public class Runner {

    public static void main(String[] args) {

        Employee employee=new Employee();

        Employee emp=new FullTimeEmployee();
        emp.setHours(8);
        emp.setDays(30);
        emp.setBasepay(10);
        calculateSalar(emp);

        PartTimeEmployee emp2=new PartTimeEmployee();
        emp2.setDays(30);
        emp2.setHours(4);
        emp2.setBasepay(5);
        calculateSalar(emp2);

        Constructor emp3=new Constructor();
        emp3.setHours(10);
        emp3.setBasepay(3);

        Dog dog=new Dog();
        Animal animal=new Animal() {
            @Override
            public String makeSound() {
                return "";
            }
        }






    }



}









