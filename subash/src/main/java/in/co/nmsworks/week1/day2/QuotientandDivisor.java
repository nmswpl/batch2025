package in.co.nmsworks.week1.day2;

public class QuotientandDivisor {

    public static  void main(String[] args)
    {
        int number1 = 50;
        int number2 = 7;
        int num = new QuotientandDivisor().checkQuotient(number1,number2);
        int num2 = new QuotientandDivisor().checkReminder(number1,number2);
        System.out.println("Quotient = "+ num);
        System.out.println("Reminder = "+ num2);
    }

    public int checkQuotient(int number1,int number2)
    {
        int quotient;
        quotient = number1/number2;
        return quotient;
    }
    public int checkReminder(int number1,int number2)
    {
        int reminder;
        reminder = number1%number2;
        return reminder;
    }
}
