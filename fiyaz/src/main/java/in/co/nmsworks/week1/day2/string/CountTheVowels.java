
package in.co.nmsworks.week1.day2.string;


import java.util.ArrayList;
import java.util.List;

public class CountTheVowels {
    public static void main(String[] args) {

        String str = "Hello World";
        countThevowels(str);
    }

    public static void countThevowels(String s) {

        int vowels = 0;
        int consonants = 0;

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("A");
        list.add("e");
        list.add("E");
        list.add("i");
        list.add("I");
        list.add("o");
        list.add("O");
        list.add("u");
        list.add("U");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                if (list.contains(String.valueOf(c))) {
                    vowels++;
                } else {
                    consonants++;
                }

            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
    }

}