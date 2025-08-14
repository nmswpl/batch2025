package in.co.nmsworks.week1.test;

public class DomainName {

    public static void main(String[] args) {
         String email = "harishankar2062004@gmail.com";
         getTheDomainName(email);
    }

    public static void getTheDomainName(String email){

        String[] splittedArray = email.split("@",2);
        System.out.println("The domain name is : " + splittedArray[1]);
    }
}
