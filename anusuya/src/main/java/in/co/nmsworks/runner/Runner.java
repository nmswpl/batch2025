package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;

public class Runner {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(1, "Anu");
        System.out.println(teacher1);

        Teacher teacher2 = new Teacher(2, "Kavi");
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

        printTeacherName(maths);

    }

    public static void printTeacherName(Subject subject){
        Teacher t = subject.getTeacher();
        String subName = t.getName();
        System.out.println(subName);
    }
}
