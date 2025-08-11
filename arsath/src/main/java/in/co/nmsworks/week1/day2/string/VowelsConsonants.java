package in.co.nmsworks.week1.day2.string;

public class VowelsConsonants {
    public static void printVowelsConsonants(String input){
        input = input.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        String[] vowels = new String[] {'a', 'e', ''}
        for(int i=0;i<=input.length();i++){
            if(input.contains("")){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants:" + consonants);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        printVowelsConsonants(input);
    }
}
