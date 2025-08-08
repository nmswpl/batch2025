
package in.co.nmsworks.week1.day2.string;


public class ReverseSentence {
    public static void main(String[] args) {

        String str = "India is my country";
        String arrstr[] = str.split(" ");
        reverseSentence(arrstr);
    }

    public static void reverseSentence(String s[]) {

        for(int i=s.length-1; i>=0; i--) {
            System.out.print(s[i] + " ");
        }


    }

}
