package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;
import in.co.nmsworks.week2.day2.*;

public class Runner {

    public static void main(String[] args) {

        Teacher t1 = new Teacher(1,"qwerty");
        Teacher t2 = new Teacher(2,"hello");

        System.out.println(t1);
        System.out.println(t2);

        Subject maths = new Subject();
        maths.setCode("MA101");
        maths.setName("Maths");
        maths.setTeacher(t1);

        System.out.println(maths);

        Subject science = new Subject();
        science.setCode("SE101");
        science.setName("Science");
        science.setTeacher(t2);
        System.out.println(science);
        printTeacher(science);
        //====================================


        FullTime fullTime = new FullTime(10,8,30);
        PartTime partTime = new PartTime(5,4,30);
        ContractTime contractTime = new ContractTime(3,7);

        System.out.println("===============================");
        fullTime.Calculatesalary();
        partTime.Calculatesalary();
        contractTime.Calculatesalary();
        System.out.println("===============================");


        Dog dog=new Dog();
        dog.makeSound();








    }
    public static void printTeacher(Subject science){
        System.out.println(science.getTeacher().getName());
    }

}
