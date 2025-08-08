
package in.co.nmsworks.week1.day2.string;


public class DuplicateRemove {
    public static void main(String[] args) {

        String str = "aabbcc";
        duplicateRemove(str);
    }

    public static void duplicateRemove(String s) {

        String ans = "";

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(ans.indexOf(c)==-1 ) {
                ans += c;
            }
        }

        System.out.println(ans);
    }

}
