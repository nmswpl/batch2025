//Write a Java program to count the number of vowels and consonants in a given string.

package in.co.nmsworks.week1.day2.string;

public class PrintingVowelsAndConsonants {
    public static void main(String[] args) {
        printVowelsAndConsonants("Hello World");

    }

    public static void printVowelsAndConsonants(String str){
        int vowels=0;
        int consonants=0;
        String input=str.toUpperCase();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowels++;
            }
            else if(ch !=' ') {
                consonants++;
            }

        }
        System.out.println("Vowels :"+vowels);
        System.out.println("Consonants :"+consonants);
    }
}
