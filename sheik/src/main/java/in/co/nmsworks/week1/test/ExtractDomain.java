package in.co.nmsworks.week1.test;

public class ExtractDomain
{
    public static void main(String[] args) {
        String email = "abc@gmail.com";
        printExtracted(email);
    }
    public static void printExtracted(String email)
    {
        int index = email.indexOf("@");
        System.out.println(email.substring(index+1));

    }
}
