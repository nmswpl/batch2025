package in.co.nmsworks.week1.day2.string;

public class RemoveFirstZeros
{
    public static void main(String[] args) {
        String str = "00056320";
        afterRemove(str);
    }
    public static void afterRemove(String str)
    {

           int i = 0;
            while(str.charAt(i) == '0'){
                //System.out.print(str.charAt(i));
                i++;
            }
            System.out.print(str.substring(i));


    }
}
