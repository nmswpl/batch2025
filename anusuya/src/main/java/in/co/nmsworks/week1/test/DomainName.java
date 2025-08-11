package in.co.nmsworks.week1.test;

public class DomainName {

    public static void printDomainName(String emailAddress){

        String[] splittedEmailAddress = emailAddress.split("@");

        System.out.println(" Input: " + emailAddress);
        System.out.println(" Output: " + splittedEmailAddress[1]);
    }

    public static void main(String[] args) {

        String emailAddress = "anusuya@gmail.com";
        printDomainName(emailAddress);
    }
}
