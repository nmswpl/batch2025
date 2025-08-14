package in.co.nmsworks.week2.day4;

public class NaturalFactors
{
    public static void main(String[] args) {
        int num = 60;
        for (int i = 1; i <= num; i++) {
            if(num%i == 0)

                System.out.println(i);
        }
    }
}
