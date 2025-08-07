package in.co.nmsworks.week1.day2.string;
/*
Input : India is my country.
output country my is India.
 */
public class ReverseTheword {
    public static void main(String[] args) {
        String name= "India is my country";
        for(int i=name.length()-1;i< 0;i--)
        {

            char ch= name.charAt(i);

            System.out.println(i);
        }
    }
}
