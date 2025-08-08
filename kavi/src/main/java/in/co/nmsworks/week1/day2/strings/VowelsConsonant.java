package in.co.nmsworks.week1.day2.strings;
//6.Write a Java program to count the number of vowels and consonants in a given string.
public class VowelsConsonant {
    public static void main(String[] args) {
       printVowelsConsonant();
    }
    public static void printVowelsConsonant(){
        String input="Hello World ";
        int vowels=0;
        int consonant=0;
        input=input.toLowerCase();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if((ch>='a'&& ch<='z')){
                if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                    vowels++;

                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("vowels"+vowels);
        System.out.println("consonant"+consonant);

    }
}

