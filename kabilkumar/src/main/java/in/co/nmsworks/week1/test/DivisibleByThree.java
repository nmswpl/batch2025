package in.co.nmsworks.week1.test;

public class DivisibleByThree {
    public static void main(String[] args) {
        int number=3;
        threeDivisible(number);
    }
    public  static void threeDivisible( int getData)
    {
        for(int i=300%getData;i<400;i++)
        {
            System.out.println(i);
        }
    }
}
