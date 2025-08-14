package in.co.nmsworks.week2.day4;

public class FactorialUsingWhile {
    public static void main(String[] args) {

        int num = 5;
        findFactorialWhile(num);
    }
    public static void findFactorialWhile(int getNumber)
    {
        int result = 1;
        while (getNumber > 0)
        {

            result=result*getNumber;
            getNumber--;

        }
        System.out.println("The Factorial using While loop :"+ result);

    }
}
