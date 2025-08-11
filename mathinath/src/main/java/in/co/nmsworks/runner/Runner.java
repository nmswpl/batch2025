package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day1.StringProblems.Subject;
import in.co.nmsworks.week2.day1.StringProblems.Teacher;

public class Runner {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher(1,"mathi");
        Teacher teacher2=new Teacher(2,"madan");
        System.out.println(teacher1);
        System.out.println(teacher2);

        Subject maths=new Subject();
        maths.setCode("MA101");
        maths.setName("Maths");
        maths.setTeacher(teacher1);
        System.out.println(maths);

        Subject science=new Subject();
        science.setCode("SC101");
        science.setName("science");
        science.setTeacher(teacher2);
        System.out.println(science);

//        System.out.println(science.getName());
        printTeacherName(science);
    }

    public  static void printTeacherName(Subject subject) {
        System.out.println(subject.getTeacher().getName());

    }

}
