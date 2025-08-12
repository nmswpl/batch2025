package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.Candidate;
import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;

import java.awt.image.SampleModel;

public class Runner {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(1, "kavi");
        Teacher teacher2 = new Teacher(2, "anu");
        System.out.println(teacher1);
        System.out.println(teacher2);

        Subject math = new Subject();
        math.setCode("me101");
        math.setName("maths");
        math.setTeacher(teacher1);


        Subject science = new Subject();
        science.setCode("se101");
        science.setName("science");
        science.setTeacher(teacher1);
        System.out.println(science);


    }
    public static void printTeacherName(Subject subject){
        Teacher t=Subject.getTeacher();
        System.out.println(t.getName());

    }








}
