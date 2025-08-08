package in.co.nmsworks.week1.day2.strings;
/*
Write a Java program to count the number of vowels and consonants in a given string.
Input: "Hello World"
Output: Vowels: 3, Consonants: 7
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
            String input = "Hello World";
            findVowAndCons(input);
    }
    public static void findVowAndCons (String s){
        int vow =0, cons=0;
        for(int i = 0; i <s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' ||
                    s.charAt(i) == 'E' ||  s.charAt(i) == 'I' || s.charAt(i) == 'U' || s.charAt(i) == 'O'){
                vow++;
            }
            else if(s.charAt(i) == ' '){
            }
            else{
                cons++;
            }
        }
        System.out.println("Vowels: " + vow + " Consonants: "+ cons);
    }
}
