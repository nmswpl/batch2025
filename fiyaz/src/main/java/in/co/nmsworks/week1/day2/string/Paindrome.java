
package in.co.nmsworks.week1.day2.string;


public class Paindrome {
    public static void main(String[] args) {

        String str = "MadaM";
        isPaindrome(str);
    }

    public static void isPaindrome(String s1) {

        boolean bool = false;
        int n = s1.length();

        for(int i=0; i<n/2; i++) {
            if(s1.charAt(i)==s1.charAt(n-1-i)) {
                bool = true;
            }

        }
           if(bool ==true) {
               System.out.println("Paindrome");
          }
           else {
               System.out.println("Not Paindrome");
           }



    }

}
