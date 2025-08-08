package in.co.nmsworks.week1.day2.String;

public class RemoveLeadingZero {

    public static void main(String[] args)
    {
        String number = "0005460";
                RemoveLeadingZero.removeZeros(number);
    }
    public static void removeZeros(String number)
    {

        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i)!='0')
            {
                System.out.println(number.substring(i));
                break;
            }
        }
    }
}
