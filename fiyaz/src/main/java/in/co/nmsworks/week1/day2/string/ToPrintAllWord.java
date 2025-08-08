
package in.co.nmsworks.week1.day2.string;


public class ToPrintAllWord {
    public static void main(String[] args) {

        String str = "This is a java language";
        String arrstr[] = str.split(" ");
        toPrintallwword(arrstr);
    }

    public static void toPrintallwword(String s[]) {

        for(int i=0; i<s.length; i++) {
            if(s[i].length()/2 != 0) {
                System.out.println(s[i]);
            }
        }


    }

}
