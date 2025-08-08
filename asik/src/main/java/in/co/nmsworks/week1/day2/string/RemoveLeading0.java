package in.co.nmsworks.week1.day2.string;

/*
4. Given a number as String, write a program that removes the leading 0
*/
class RemoveLeading0 {
    public static void main(String[] args)
    {
        String str = "0005640";
        removeLeading0(str);
    }
    public static void removeLeading0(String str)
    {
        for(int i = 0; i <= str.length(); i++)
        {
            if(str.charAt(i) != '0')
            {
                System.out.println(str.substring(i));
                break;
            }
        }
    }
}
