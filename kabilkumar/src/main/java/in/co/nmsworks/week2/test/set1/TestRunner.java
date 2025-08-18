package in.co.nmsworks.week2.test.set1;

public class TestRunner
{
    public static void main(String[] args) {

        String name = "this is java programming";
        firstLetterCaptial(name);
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
}
