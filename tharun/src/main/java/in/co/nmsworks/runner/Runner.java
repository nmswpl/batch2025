package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;
import in.co.nmsworks.week2.day2.Contractor;
import in.co.nmsworks.week2.day2.Dog;
import in.co.nmsworks.week2.day2.FullTImeEmployee;
import in.co.nmsworks.week2.day2.PartTimeEmployee;

public class Runner {
    private static int age;
    final float pi=3.14f;
    public void test1(){
        final String NAME = "Tharun";
        Double d = Double.valueOf(1.23);
        double d1 = d;
    }

    public static void printTeacher(Subject subject){
        System.out.println(subject.getTeacher().getName());
    }

    public static void main(String[] args) {
/**
        Teacher teacher1 = new Teacher(1,"Sanjeev");
        Teacher teacher2 = new Teacher(2,"Rajesh");

        System.out.println(teacher1);
        System.out.println(teacher2);

        Subject maths = new Subject();
        maths.setCode("MA101");
        maths.setName("Maths");
        maths.setTeacher(teacher1);

        System.out.println(maths);



        Subject science = new Subject();
        science.setCode("SE101");
        science.setName("Science");
        science.setTeacher(teacher2);
        System.out.println(science);
        printTeacher(science);


        **/


        Contractor contractor = new Contractor(3,2);
        contractor.calculateSalary();

        FullTImeEmployee fullTImeEmployee = new FullTImeEmployee(10,8);
        fullTImeEmployee.calculateSalary();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(5,4);
        partTimeEmployee.calculateSalary();


       // Dog doberMan = new Dog();
       // doberMan.makeSound();





    }
}
