package in.co.nmsworks.week1.test;

public class DomainName {
    public static void extractDomainName(String input){
       String[] input1 = input.split("@");
        System.out.println(input1[1]);


    }
    public static void main(String[] args) {
        String input = "john.doe@gmail.com";
        extractDomainName(input);
    }
}
