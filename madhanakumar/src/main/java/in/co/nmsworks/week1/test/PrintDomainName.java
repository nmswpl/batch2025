package in.co.nmsworks.week1.test;

public class PrintDomainName {
    public void findDomainName(String s){
        String[] s1 = s.split("@");
        for (int i = 0; i < s1.length; i++) {
            if (i == 1) {
                System.out.println(s1[i]);
            }
        }
    }

    public static void main(String[] args) {
        PrintDomainName dn = new PrintDomainName();
        dn.findDomainName("john.doe@gmail.com");
    }
}
