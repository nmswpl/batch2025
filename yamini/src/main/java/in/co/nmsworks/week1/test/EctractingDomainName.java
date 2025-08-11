package in.co.nmsworks.week1.test;

public class EctractingDomainName {
    public static void main(String[] args) {
        extractDomain("john.doe@gmail.com");
    }
    public static  void extractDomain(String input){
        int index=input.indexOf('@');
        String result=input.substring(index+1,input.length());
        System.out.println(result);

    }

}
