package in.co.nmsworks.week2.day4;

public class FindNoOfDigitsPresent
{
    public static void main(String[] args) {
        int numbers = 1234;
        findNoOfDigitd(numbers);

    }
    public  static void findNoOfDigitd(int digits)
    {
        System.out.println("Enter number: "+digits );
        int count =0;
       while (digits != 0)
       {
           digits=digits/10;
           count ++;
       }
        System.out.println("No Of Digits :" + count);

    }
}
