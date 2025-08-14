package in.co.nmsworks.week1.day2.string;



public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbc";
        String newStr = removeDuplicate(str);
        System.out.print(newStr);
    }

    public static String removeDuplicate(String str) {
        StringBuffer str1 = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            boolean has = false;
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == a) {
                    has = true;
                    break;
                }
            }
            if (!has) {
                str1.append(a);
            }
        }
        return str1.toString();
    }
}
