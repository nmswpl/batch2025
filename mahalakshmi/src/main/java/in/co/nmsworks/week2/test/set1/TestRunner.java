package in.co.nmsworks.week2.test.set1;

public class TestRunner {
    public static String convertTitleCase(String str) {
        String res = "";
        String[] strArr = str.split(" ");
        for (String s : strArr) {
            res += s.substring(0,1).toUpperCase() + s.substring(1,s.length()).toLowerCase() + " ";

        }
        return res;
    }
    public static void main(String[] args) {
        String str = "This class should represent a drone device.";
        System.out.println(convertTitleCase(str));
    }
}
