package in.co.nmsworks.week1.test;

public class FindDomainName {
    static void printDomainName(String input){
        String result = input.substring(input.indexOf("@")+1);
        System.out.println(result);
    }
    public static void main(String[] args) {
        String input="john@gmail.com";
        printDomainName(input);
    }
}
