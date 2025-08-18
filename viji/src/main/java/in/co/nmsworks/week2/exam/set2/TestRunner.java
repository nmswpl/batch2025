package in.co.nmsworks.week2.exam.set2;

/* Question 2
Write a method that takes an array of Intern[] (where each intern has a name and a salary)
and calculates the average salary of all the interns. */

public class TestRunner {
    public static void main(String[] args) {

        Intern viji = new Intern("viji", 2000.00);
        Intern yamini = new Intern("yamini", 2000.00);
        Intern ashik = new Intern("ashik", 2000.00);
        Intern maha = new Intern("maha", 2000.00);
        Intern kavi = new Intern("kavi", 2000.00);

        Intern[] interns = new Intern[]{viji, yamini, ashik, maha, kavi};

        Intern intern = new Intern();
        calculateAverageSalary(interns);
    }
       public static void calculateAverageSalary(Intern[] interns){
           System.out.println(interns.getSalary() *12 );


    }


    /* Question 3
Given a paragraph, write a method that returns an integer array (int[]) with the following
information:
• 0th position: The number of statements in the paragraph.
• 1st position: The total number of words in the paragraph.
• 2nd position: The total number of letters */


}
