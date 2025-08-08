package in.co.nmsworks.week1.day2.string;

public class CountVowelsConsonants {
    // Program to print
    public void countVowelsandConsonants(String s){
        char ch[] = s.toLowerCase().toCharArray();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                vowels++;
            } else if (ch[i] == ' ') {
                continue;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels : "+vowels+", Consonants : "+consonants);
    }

    public static void main(String[] args) {
        CountVowelsConsonants vc = new CountVowelsConsonants();
        vc.countVowelsandConsonants("Hello World");
    }
}
