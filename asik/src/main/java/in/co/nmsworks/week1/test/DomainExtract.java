package in.co.nmsworks.week1.test;

public class DomainExtract
{
    public static void main(String[] args) {
        String email = "john.doe@gmail.com";
        String domain = getDomain(email);
        if(domain != null)
        {
            System.out.println(domain);
        }
        else
        {
            System.out.println("Invalid email");
        }
    }

    public static String getDomain(String email)
    {
        for(int i = 0; i < email.length(); i++)
        {
            if(email.charAt(i) == '@')
            {
                return email.substring(i+1);
            }
        }
        return null;
    }
}
