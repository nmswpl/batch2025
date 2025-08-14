package in.co.nmsworks.week1.day2.string;

public class VowelsConsonants {
    public static void printVowelsConsonants(String input) {
        int vowels = 0, consonants = 0;
        String ref = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) >= 'A'
                    && input.charAt(i) <= 'Z')
                    || (input.charAt(i) >= 'a'
                    && input.charAt(i) <= 'z')) {
                if (ref.indexOf(input.charAt(i)) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Number of Vowels = " + vowels
                + "\nNumber of Consonants = "
                + consonants);
    }
    public static void main(String[] args) {
        String input = "Hello World";
        printVowelsConsonants(input);
    }
}