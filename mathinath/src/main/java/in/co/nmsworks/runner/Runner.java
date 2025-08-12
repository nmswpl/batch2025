package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day1.StringProblems.Subject;
import in.co.nmsworks.week2.day1.StringProblems.Teacher;
import in.co.nmsworks.week2.day2.*;

public class Runner {
    public static void main(String[] args) {
//        Teacher teacher1=new Teacher(1,"mathi");
//        Teacher teacher2=new Teacher(2,"madan");
//
//        System.out.println(teacher1);
//        System.out.println(teacher2);
//
//        Subject maths=new Subject();
//        maths.setCode("MA101");
//        maths.setName("Maths");
//        maths.setTeacher(teacher1);
//        System.out.println(maths);
//
//        Subject science=new Subject();
//        science.setCode("SC101");
//        science.setName("science");
//        science.setTeacher(teacher2);
//        System.out.println(science);
//
//        System.out.println(science.getName());
//        printTeacherName(science);
        Employee e1=new Employee();
        e1.calculateSalaray();
        Contractor c1=new Contractor(3,15);
        c1.calculateSalaray();
        System.out.println( c1.getHours());
        FullTimeEmployee f1=new FullTimeEmployee();
        f1.calculateSalaray();
        PartTimeEmployee p1=new PartTimeEmployee();
        p1.calculateSalaray();

//        Animal a = new Animal();

//        Dog d1 = new Dog();

//       bike b1 = new Bike();





    }

//    public  static void printTeacherName(Subject subject) {
//        System.out.println(subject.getTeacher().getName());
//    }

}
