package in.co.nmsworks.week1.day2.string;

public class RemoveLeading0 {
    public static void main(String[] args)
    {
        String given="000540";
        removeZeros(given);
    }

    public static void removeZeros(String give)
    {
        int i=0;
        while(give.charAt(i)=='0')
        {
            i++;
        }
        System.out.println(give.substring(i));
    }
}
