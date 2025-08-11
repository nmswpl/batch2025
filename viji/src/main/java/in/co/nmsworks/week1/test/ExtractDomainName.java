/*4. Given an email address write a program to extract the domain name.  For e.g If the input is "john.doe@gmail.com", the expected output is gmail.com*/

package in.co.nmsworks.week1.test;

public class ExtractDomainName {
    public static void main(String[] args) {
        printDomainName("john.doe@gmail.com");
    }

    public static void printDomainName(String input){
        System.out.println(input.substring(9));
    }
}
