package in.co.nmsworks.week2.day4;

public class CombineProgram {
    public static void main(String[] args) {

        String name = "this website is aw3som3";
        String[] word = name.split(" ");
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            count++;
        }
        System.out.println("words " + count);


        int count1 = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '3') {
                count1++;
            }
        }
        System.out.println("Digits " + count1);

        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'o' || name.charAt(i) == 'i' || name.charAt(i) == 'u') {
                count2++;

            } else {
                count3++;

            }
        }
        System.out.println("V :" + count2);
        System.out.println("C :" + count3);
    }
}
