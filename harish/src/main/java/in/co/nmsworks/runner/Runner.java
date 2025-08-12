package in.co.nmsworks.runner;

import in.co.nmsworks.week2.day1.Subject;
import in.co.nmsworks.week2.day1.Teacher;
import in.co.nmsworks.week2.day2.Contractor;
import in.co.nmsworks.week2.day2.Employee;
import in.co.nmsworks.week2.day2.FullTimeEmployee;
import in.co.nmsworks.week2.day2.PartTimeEmployee;

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




        //NEW FUNCTIONS

        FullTimeEmployee employee1 = new FullTimeEmployee();
        employee1.setEmployeeId(1);
        employee1.setEmployeeName("Harish");
        System.out.println("The employee name is  :" + employee1.getEmployeeName() + "\t AND employee id is : " + employee1.getEmployeeId() + " \tAND employee salary is :"+employee1.getSalary(30));


        PartTimeEmployee employee2= new PartTimeEmployee();
        employee2.setEmployeeName("Harry");
        employee2.setEmployeeId(2);
        System.out.println("The employee name is  :" + employee2.getEmployeeName() + "\t AND employee id is :" + employee2.getEmployeeId() + "\t AND employee salary is :"+employee2.getSalary(30));

        Contractor employee3 = new Contractor();
        employee3.setEmployeeId(5);
        employee3.setEmployeeName("Parthiban");
        System.out.println("The employee name is " + employee3.getEmployeeName() + "\t AND employee id is " + employee3.getEmployeeId() + "\t AND employee salary is"+employee3.getSalary(30));

    }

    public static void printTeacherName(Subject subject){
        System.out.println(subject.getTeacher().getName());
    }
}
