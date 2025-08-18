package in.co.nmsworks.week2.test.set1;

public class TestRunner
{
    public static void main(String[] args) {

        String name = "this is java programming";
        firstLetterCaptial(name);

        String[] name1 = {"kabil","harish","kavi","kumar"};
        String[] department = {"developer" ,"Qa","developer", "qa"};
        findIndexOfDepartment(name1 , department);
    }
    public  static void firstLetterCaptial(String givenString)
    {
        String[] words = givenString.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++)
        {
            result = result+" " +words[i].substring(0,1).toUpperCase() + words[i].substring(1);

        }
        System.out.println("Before Captialized  :"+givenString );
        System.out.println("After Captialized : "+result);
    }


    // 2nd program.
    public  static void findIndexOfDepartment(String[] internName ,String[] interdepartment)
    {
        for (int i = 0; i < interdepartment.length; i++)
        {


        }

    }

}
