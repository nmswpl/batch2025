package in.co.nmsworks.week1.day2.string;


/**
 * Write a Java program to count the number of vowels and consonants in a given string.
 * Input: "Hello World"
 * Output: Vowels: 3, Consonants: 7
 */
public class VowelsAndConsonantsCount {
    static void counter(String value){
        //String [] vowelsArray={"a","e","i","o","u"};
        String vowels="aeiou";
        int vowelsCount=0 , consonantsCount ,spaceCounter=0;
        for(int i=0;i<value.length();i++){
            for(int j=0;j<vowels.length();j++){
                if(value.charAt(i)==vowels.charAt(j)){
                    vowelsCount++;
                }
            }
            if (value.charAt(i) == ' ') {
                spaceCounter++;
            }
        }
        consonantsCount=value.length()-vowelsCount-spaceCounter;
        System.out.println("Vowels : "+vowelsCount);
        System.out.println("Consonents : "+consonantsCount);
    }
    public static void main(String[] args) {
        counter("Hello World");
    }
}
