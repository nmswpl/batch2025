package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.Candidate;
import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;

public class Runner {

        private final float PI= 3.14f;
    public static void main(String[] args)
    {
        Teacher teacher1=new Teacher(1,"Subash");

        Teacher teacher2=new Teacher(2,"Tempo");

        System.out.println(teacher1);
        System.out.println(teacher2);

        FullTimeEmployee ft=new FullTimeEmployee();

        Subject maths=new Subject();
        maths.setCode("MA101");
        maths.setName("Maths");
        maths.setTeacher(teacher1);
        System.out.println(maths);

        Subject science=new Subject();
        science.setCode("SC102");
        science.setName("Science");
        science.setTeacher(teacher2);
        System.out.println(science);


        printTeacherName(science);
        printTeacherName(maths);

        Employee emp=new Employee();
        emp.calculateContractorSalary(4);


        Employee ptEmp=new Employee();
        ptEmp.calculateptSalary(4,30);


        Employee ftEmp=new Employee();
        ftEmp.calculateftSalary(8,30);

        Car car=new Car();
        car.setModel("Lambo");
        car.setYear(2019);
        car.setNoofdoors(10);
        System.out.println(car.printDetails());

        Bike bike=new Bike();
        bike.setHbtype(Bike.HANDLEBAR.RISED);
        bike.setModel("Hondo");
        bike.setYear(2020);
        System.out.println(bike.printDetails());
    }

    public static void printTeacherName(Subject subject)
    {
//        final float PI=5.55f;
        System.out.println(subject.getTeacher().getName());

    }




}
