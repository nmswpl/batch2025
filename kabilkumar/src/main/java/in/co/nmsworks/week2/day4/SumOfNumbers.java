package in.co.nmsworks.week2.day4;

public class SumOfNumbers
{
    public static void main(String[] args) {
        int num = 100;
        int result=0;
        for (int i=0;i<num;i++)
        {
             result=result+i;
             result++;
        }
        System.out.println("The of Natural numbers :"+ result);
    }
}
