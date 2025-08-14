package in.co.nmsworks.week1.day2.string;

public class CheckEvenLength
{
    public static void main(String[] args)
    {
        String str = " THIS IS A JAVA FILE ";

        getEvenLen(str.trim());
    }
    public static void getEvenLen(String str)
    {
        String[] zs = str.split(" ");
        for(int i =0 ; i < zs.length; i++){
            if(zs[i].length() % 2 == 0)
            {
                System.out.println(zs[i]);
            }

        }
    }
}
