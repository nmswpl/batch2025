package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;

public class Runner {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1,"sanjeevsir");
        Teacher teacher2 = new Teacher(2,"rajeshsir");


        System.out.println(teacher1);
        System.out.println(teacher2);

        Subject maths = new Subject();
        maths.setCode("ma101");
        maths.setName("Maths");
        maths.setTeacher(teacher1);
        System.out.println(maths);

        Subject science = new Subject();
        science.setCode("sce001");
        science.setName("Science");
        science.setTeacher(teacher2);
        System.out.println(science);
        printTeacherName(science);

    }

    public static void printTeacherName(Subject subject){
        System.out.println(subject.getTeacher().getName());
    }
}
