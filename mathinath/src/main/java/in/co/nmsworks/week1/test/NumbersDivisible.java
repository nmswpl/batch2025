package in.co.nmsworks.week1.test;

public class NumbersDivisible {
    public static void main(String[] args) {
        int num=309;
        if(num>300 && num<400)
        {
            for(int i=num;i<400;i++)
            {
                if(i%3 == 0)
                {
                    System.out.print(i+" ");
                }
            }
        }
        else
        {
            System.out.println("Given number is less than 300 or greater than 400 ");
        }
    }
}
