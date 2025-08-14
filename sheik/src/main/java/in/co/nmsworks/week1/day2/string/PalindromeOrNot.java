package in.co.nmsworks.week1.day2.string;

import java.sql.SQLOutput;

public class PalindromeOrNot
{
    public static void main(String[] args)
    {
        String name1 = "MADAML";
        boolean check = checkPalin(name1);
        System.out.print(check);
    }
     public static boolean checkPalin(String name1)
     {
        int left =0;
        int right = name1.length()-1;
        while(left<right)
        {
            if(name1.charAt(left) == name1.charAt(right))
            {
                left++;
                right--;

            }
            else
            {
                return false;
            }
        }
        return true;
     }

}
