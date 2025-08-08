package in.co.nmsworks.week1.day2.String;

//6. Write a Java program to count the number of vowels and consonants in a given string.
//Input: "Hello World"
//Output: Vowels: 3, Consonants: 7


public class CountVowelsAndConsonants {

    public static void printCountOFVowelsAndConsonants(String words){

        char[] vowels = {'a','e','i','o','u'};
        String consonants = "bcdfghjklmnpqrstvwxxyz";
        int vowelsCount = 0, consonantsCount = 0;
        String[] wordsToFind = words.split(" ");

        for (String i : wordsToFind){
            String temp = i.toLowerCase();
            for (int j = 0; j < temp.length(); j++){

                if (temp.charAt(j) == 'a' || temp.charAt(j) == 'e' || temp.charAt(j) == 'i' || temp.charAt(j) == 'u' || temp.charAt(j) == 'o'){
                    vowelsCount++;
                } else if (consonants.contains(""+temp.charAt(j))) {
                    consonantsCount++;
                }
            }
        }

        System.out.println("Count of Vowels : " + vowelsCount);
        System.out.println("Count of Consonants : " + consonantsCount);

    }

    public static void main(String[] args) {
        String str = "qwertyuioplkjhgfdsazxcvbnm123#$";
        printCountOFVowelsAndConsonants(str);
    }

}
