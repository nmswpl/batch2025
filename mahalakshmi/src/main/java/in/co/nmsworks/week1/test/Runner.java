package in.co.nmsworks.week1.test;

import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;

public class Runner {
//    Book sql = new Book("Introduction to MySQL","John",1899,6);
//    Book java = new Book("OOPs Principles - Java","",1989,4);
//    Book c = new Book("C Basics" , "Dennis Ritchie",1889,2);
//    Book networks = new Book("Networks Essentials","Smith",1850,2);

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1,"Shanthi");
        Teacher teacher2 = new Teacher(2,"Renu");

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
//        System.out.println(science.getTeacher().getName());
        printTeacherName(science);
    }

    public static void printTeacherName(Subject sub) {
        System.out.println(sub.getTeacher().getName());
    }
}
