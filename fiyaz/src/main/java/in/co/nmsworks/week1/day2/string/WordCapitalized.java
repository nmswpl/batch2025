
package in.co.nmsworks.week1.day2.string;


public class WordCapitalized {
    public static void main(String[] args) {

        String str = "the quick brown fox jumps over the lazy dog";
        String arrstr[] = str.split(" ");
        wordCapitalized(arrstr);
    }

    public static void wordCapitalized(String s[]) {

        for(int i=0; i<s.length; i++) {
            System.out.print(s[i].substring(0,1).toUpperCase() + s[i].substring(1) + " ");
        }
        System.out.println();

    }

}
