/* package in.co.nmsworks.week2.exam.set2;

 Question 2
Write a method that takes an array of Intern[] (where each intern has a name and a salary)
and calculates the average salary of all the interns.

import in.co.nmsworks.week2.exam.set2.Intern;

public class TestRunner {
    public static void main(String[] args) {



        Intern viji = new Intern("viji", 2000.00);
        Intern yamini = new Intern("yamini", 2000.00);
        Intern ashik = new Intern("ashik", 2000.00);
        Intern maha = new Intern("maha", 2000.00);
        Intern kavi = new Intern("kavi", 2000.00);

        Intern[] interns = new Intern[]{viji, yamini, ashik, maha, kavi};

        Intern intern = new Intern();
        TestRunner.calculateAverageSalary(interns);
    }
    public static void calculateAverageSalary(Intern[] interns){
        System.out.println(interns.getSalary() *12 );

    }

    String paragraph = "This is Vijayalakshmi from computer Science and engineering .";
    public static void intArray(String paragraph){
        String[] arr =paragraph.split(" ");
        for(int i =0 ; i< arr.length ; i++){
            System.out.println(arr+" ");
        }
        System.out.println("Total Number Of Letters : " + paragraph.length());

    }



    /* Question 3
Given a paragraph, write a method that returns an integer array (int[]) with the following
information:
• 0th position: The number of statements in the paragraph.
• 1st position: The total number of words in the paragraph.
• 2nd position: The total number of letters */






