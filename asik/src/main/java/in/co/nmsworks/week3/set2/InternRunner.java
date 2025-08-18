package in.co.nmsworks.week3.set2;

import in.co.nmsworks.week2.test.set1.Intern;

public class InternRunner
{
    public static void main(String[] args)
    {
        Intern pratheep = new Intern("Pratheep", "Test", 20000);
        Intern ranjith = new Intern("Ranjith", "Dev", 25000);
        Intern kishore = new Intern("Kishore", "Dev", 35000);
        Intern nirmal = new Intern("Nirmal", "Test", 15000);
        Intern shiva = new Intern("Shiva", "Dev", 30000);

        Intern[] interns = {pratheep, ranjith, kishore, nirmal, shiva};

        int avgSalary = calculateAvgSalary(interns);
        System.out.println("Average Salary of All Interns : " + avgSalary);
    }

    public static int calculateAvgSalary(Intern[] interns)
    {
        int totalSalaryAmount = 0;
        for (Intern i : interns)
        {
            totalSalaryAmount += i.getSalary();
        }
        return totalSalaryAmount/interns.length;
    }
}
