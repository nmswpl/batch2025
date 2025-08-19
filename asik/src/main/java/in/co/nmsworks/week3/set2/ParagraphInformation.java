package in.co.nmsworks.week3.set2;

public class ParagraphInformation {
    public static void main(String[] args) {
        String str = "The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.";

        int[] paraInfo = getParagraphInfo(str);

        System.out.println("Total Statements in the String is : " + paraInfo[0]);
        System.out.println("Total Words in the String is : " + paraInfo[1]);
        System.out.println("Total Letters in the String is : " + paraInfo[2]);
    }

    private static int[] getParagraphInfo(String str)
    {
        int[] info = new int[3];
        info[0] = str.split("\\.").length;
        info[1] = str.split(" ").length;
        info[2] = str.length();

        return info;
    }

}
