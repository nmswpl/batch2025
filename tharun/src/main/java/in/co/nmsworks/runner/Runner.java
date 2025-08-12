package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;

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
    }
}
