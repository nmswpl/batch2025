package in.co.nmsworks.week2.test.set1;

public class TestRunner
{
    public static void main(String[] args)
    {
        String str = "this is an example for title case";
        System.out.println(convertToTitleCase(str));

        Intern pratheep = new Intern("Pratheep", "Test");
        Intern ranjith = new Intern("Ranjith", "Dev");
        Intern kishore = new Intern("Kishore", "Dev");
        Intern nirmal = new Intern("Nirmal", "Test");
        Intern shiva = new Intern("Shiva", "Dev");

        Intern[] interns = {pratheep, ranjith, kishore, nirmal, shiva};

        int[] indices = getIndicesOnDept(interns, "Dev");

        System.out.println("The Matched Indices are");
        for (int index : indices)
        {
            System.out.print(index + " ");
        }
    }

    public static String convertToTitleCase(String str)
    {
        String[] arr = str.split(" ");
        String result = "";
        for (String s : arr)
        {
            result += s.toUpperCase().charAt(0) + s.toLowerCase().substring(1) + " ";
        }
        return result.trim();
    }

    public static int[] getIndicesOnDept(Intern[] interns, String dept)
    {
        int[] indices = new int[interns.length];
        int index = 0;
        for(int i = 0; i < interns.length; i++)
        {
            if(interns[i].getDept().equals(dept))
            {
                indices[index++] = i;
            }
        }
        return indices;
    }
}
