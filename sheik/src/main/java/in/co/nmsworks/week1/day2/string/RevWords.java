package in.co.nmsworks.week1.day2.string;
//import java.util.Arrays;
public class RevWords
{
    public static void main(String[] args)
    {
        String statement = "INDIA IS MY COUNTRY";
        String[] zs = statement.split(" ");
        for(int i = zs.length-1;i>=0;i--){
            System.out.print(zs[i] + " ");
        }
    }


}
