package in.co.nmsworks.week1.test;

public class NumberDivisibleBy3 {

    public static void main(String[] args) {

        divisibleByThree();

    }
    public static void divisibleByThree()
    {
        for(int i=300;i<400;i++)
        {
            if(i%3==0)
                System.out.println(i);
        }
    }
}
