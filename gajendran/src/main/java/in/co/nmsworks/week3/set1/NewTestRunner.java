package in.co.nmsworks.week3.set1;

import in.co.nmsworks.week2.day2.exam.set2.Intern;
import in.co.nmsworks.week2.day4.Movie;

import java.util.List;

public class NewTestRunner
{

    public int[] fitchInternsInDept(InternNew[] interns, String dept)
    {
        int[] result = new int[5];
        int indexOfArray = 0;
        for (int i = 0; i < interns.length; i++) {
            if (interns[i].getDept().equals(dept)){
                result[indexOfArray] = i+1;
                indexOfArray++;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {

        NewTestRunner runner = new NewTestRunner();

        InternNew[] interns = new InternNew[] {
                new InternNew("Dev", "gajendran"),
                new InternNew("Dev", "Alwin"),
                new InternNew("Test", "hari"),
                new InternNew("Test", "Ayyappan"),
                new InternNew("Dev", "Santhosh"),
                new InternNew("Test", "Deva")};
        int[] indexOfDevIntern = runner.fitchInternsInDept(interns,"Dev");

        for (int i : indexOfDevIntern) {
            System.out.println(i);
        }
        runner.toTitleCase("gajeNdran iS deV.");

    }

    private void toTitleCase(String content)
    {
        String[] contentArray= content.toLowerCase().split(" ");
        for (String str : contentArray)
        {
            char c = str.charAt(0);

            System.out.print(Character.toTitleCase(str.charAt(0))+str.substring(1)+" ");


        }
    }
}
