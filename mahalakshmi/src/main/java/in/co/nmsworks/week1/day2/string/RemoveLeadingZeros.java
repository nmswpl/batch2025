package in.co.nmsworks.week1.day2.string;
public class RemoveLeadingZeros {
    // 4. Given a number as String, write a program that removes the leading 0
    public static void main(String[] args) {
        String str = "0005640";
        System.out.println(removeLeadingZeros(str));

    }

    public static String removeLeadingZeros(String str) {
        int index = 0;
        while(index < str.length() && str.charAt(index) == '0') {
            index++;
        }
        return str.substring(index);
    }
}
