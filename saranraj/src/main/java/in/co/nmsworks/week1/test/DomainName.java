package in.co.nmsworks.week1.test;

public class DomainName {
    public static void main(String[] args) {
        String domainName = "john.doe@gmail.com";
        printDomainName(domainName);
    }

    private static void printDomainName(String domainName) {
        String[] separate = domainName.split("@");
        for(String word : separate){
            if(word.contains("gmail.com")){
                System.out.println(word);
            }
        }
    }
}
