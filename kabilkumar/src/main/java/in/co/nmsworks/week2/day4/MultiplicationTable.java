package in.co.nmsworks.week2.day4;

public class MultiplicationTable
{
    public static void main(String[] args) {
    int number = 10;
    generateMultiTable(number);
    }
    public static void generateMultiTable(int getNumber)
    {
        for (int i = 1; i < getNumber; i++)
        {
            System.out.println(getNumber + " * "+ i + " = " + (getNumber*i));

        }
    }
}
