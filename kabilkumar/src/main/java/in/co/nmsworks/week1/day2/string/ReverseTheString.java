package in.co.nmsworks.week1.day2.string;
/*
Input : India is my country.
output country my is India.
 */
public class ReverseTheString {
    public static void main(String[] args) {
        String givenName= "India is my country";
        String reverse="";
        String[] words=givenName.split(" ");

        for(int i= words.length-1;i>=0;i--)
        {
              reverse=reverse+words[i]+ " ";

        }
        System.out.println("The Orginal String :"+givenName );
        System.out.print("After reversed the sentense :" +reverse);
    }
}
