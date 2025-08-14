package in.co.nmsworks.week1.test;

public class ExtractDomainName {
    public static void main(String[] args) {
        String email="john.doe@gmail.com";
        String[] str=email.split("@");
        System.out.print(str[1]);
    }
}
