package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;

public class Runner {
    final static float PI = 3.14f;
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1,"Rayleigh");
        Teacher teacher2 = new Teacher(2,"Jiraya");

        System.out.println(teacher1);
        System.out.println(teacher2);

        Subject maths = new Subject();
        maths.setCode("MA101");
        maths.setName("Maths");
        maths.setTeacher(teacher1);

        System.out.println(maths);

        Subject science = new Subject();
        science.setCode("SC101");
        science.setName("Science");
        science.setTeacher(teacher2);

        System.out.println(science);

        printTeacherName(science);
    }

    private static void printTeacherName(Subject s){
        System.out.println(s.getTeacher().getName());
    }
}
