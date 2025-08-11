
package in.co.nmsworks.week1.test;

public class EmailExtraction {
    public static void main(String[] args) {

        String str = "fiyazmohamed@nmsworks.co.in";
        emailExtraction(str);
    }

    public static void emailExtraction(String s) {

        String[] tempstr = s.split("@");
        System.out.println(tempstr[1]);

    }
}
