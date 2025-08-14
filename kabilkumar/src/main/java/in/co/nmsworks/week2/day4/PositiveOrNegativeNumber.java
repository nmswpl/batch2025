package in.co.nmsworks.week2.day4;

public class PositiveOrNegativeNumber
{
    public static void main(String[] args) {
        int number = -3;
        findPOsOrNeg(number);
    }
    public static void  findPOsOrNeg(int getNumber)
    {
        if(getNumber < 0)
        {
            System.out.println("the number is negative " + getNumber);
        }
        else if (getNumber >0)
        {
            System.out.println("the number is positive "+ getNumber);
        }

    }
}
