package in.co.nmsworks.week1.day2.string;
public class CountVowelsConsonants {
    // 6. Write a Java program to count the number of vowels and consonants in a given string.
    public static void main(String[] args) {
        String str = "Hello World";
        String newString = str.replaceAll(" ","");
        printVowelsConsonantsCount(newString.toLowerCase());
    }

    public static void printVowelsConsonantsCount(String str) {
        int vowCount = 0;
        int conCount = 0;
        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowCount++;
            }
            else {
                conCount++;
            }
        }
        System.out.println("Vowels: " + vowCount + ",Consonants: " + conCount);
    }
}
