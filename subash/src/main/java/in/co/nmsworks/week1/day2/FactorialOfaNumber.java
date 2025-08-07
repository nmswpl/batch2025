package in.co.nmsworks.week1.day2;

public class FactorialOfaNumber {

    public static void main(String[] args)
    {
        int num = 5;
        int sum = FactorialOfaNumber.factorialNumber(num);
        System.out.println(sum);
    }
    public static int factorialNumber(int num)
    {

        int sum=1;
        for(int i=1;i<=num;i++){
            sum=sum*i;
        }
        return sum;
    }
}
