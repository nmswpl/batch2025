// 4.
package in.co.nmsworks.week1.test;
public class ExtractDomainName {
    public static void main(String[] args) {
        String str = "john.doe@gmail.com";
        printDomainName(str);
    }

    public static void printDomainName(String str) {
        String res = "";
        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == '@') {
                res += str.substring(i+1,str.length());
            }
        }
        System.out.println(res);
    }
}
