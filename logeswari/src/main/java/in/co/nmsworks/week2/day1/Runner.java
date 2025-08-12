package in.co.nmsworks.week2.day1;

import org.w3c.dom.ls.LSOutput;

public class Runner {
    public static void main(String[] args) {


        Teacher teacher1 = new Teacher();
        System.out.println(teacher1);
        teacher1.setName("xxxx");
        Teacher teacher2 = new Teacher();
        System.out.println(teacher2);

        teacher2.setName("abcd");


        Subject subject1=new Subject();
        subject1.setCode("m3");
        subject1.setName("maths");
        subject1.setTeacher(teacher1);
        System.out.println(subject1.getCode());
        System.out.println(subject1.getName());
        System.out.println(subject1.getTeacher());



        System.out.println(subject1);
        Subject subject2=new Subject();
//        System.out.println(subject2);
        subject2.setCode("j1");
        subject2.setName("java");
        subject2.setTeacher(teacher2);


        System.out.println(subject2.getCode());
        System.out.println(subject2.getName());
        System.out.println(subject2.getTeacher());


        Subject subject3=new Subject();
//        System.out.println(subject2);
        subject3.setCode("s1");
        subject3.setName("java");
        subject3.setTeacher(teacher2);


        System.out.println(subject3.getCode());
        System.out.println(subject3.getName());
        System.out.println(subject3.getTeacher());


    }

    public static void printTeacherName(Subject subject)
    {
        Teacher t=subject.getTeacher();
        String namet=t.getName();
        System.out.println(namet);

    }

}

