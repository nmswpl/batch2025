

package in.co.nmsworks.week1.day2.string;


public class LongestWord {
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";
        String arrstr[] = str.split(" ");
        longestWord(arrstr);
    }

    public static void longestWord(String s[]) {

        String temp = "";
        for(int i=0; i<s.length; i++) {
            if (s[i].length() > temp.length()) {
                temp = s[i];
            }
        }

        System.out.println(temp);

    }

}
