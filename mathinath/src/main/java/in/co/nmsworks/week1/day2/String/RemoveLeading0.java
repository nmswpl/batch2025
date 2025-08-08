package in.co.nmsworks.week1.day2.String;
//4. Given a number as String, write a program that removes the leading 0
//        Input :0005640
//        output: 5640
public class RemoveLeading0 {
    public static void main(String[] args)
    {
        new RemoveLeading0().removeLeading("0005640");
    }
    public void removeLeading(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='0')
            {
                System.out.print(str.substring(i));
                break;
            }
        }
    }
}
