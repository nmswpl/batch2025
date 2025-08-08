package in.co.nmsworks.week1.day2.string.First;

public class CountVC {

    static void countWords(){
        String word="Hello World";
        int vowels=0;
        int consonents=0;
        word=word.toLowerCase();
        for(int i=0;i<word.length();i++){
            char ch =word.charAt(i);
            if(ch>='a'&&ch<='z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonents++;

                }
            }
        }
        System.out.println("vowels : "+vowels);
        System.out.println("consonants" + consonents);
    }
    public static void main(String[] args) {
        countWords();
    }
}
