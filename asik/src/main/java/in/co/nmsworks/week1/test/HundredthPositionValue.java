package in.co.nmsworks.week1.test;

public class HundredthPositionValue
{
    public static void main(String[] args) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int num = 542;
        String result = getHundredthPositionValue(arr, num);
        System.out.println(result);
    }

    public static String getHundredthPositionValue(String[] arr, int num)
    {
        for(int i = 0; i < 2; i++)
        {
            num = num / 10;
        }

        return arr[num];
    }
}
