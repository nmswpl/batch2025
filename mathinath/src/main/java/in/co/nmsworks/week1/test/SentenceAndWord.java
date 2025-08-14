package in.co.nmsworks.week1.test;

public class SentenceAndWord {
    public static void main(String[] args) {
        String str1="Java is a popular programming language";
        String str2="Popular";
        if(str1.equalsIgnoreCase(str2))
        {
//            System.out.println("Word Found at index : "+);
            System.out.println("First character of the word: "+str2.charAt(0));
            System.out.println("Last character of the word: "+str2.charAt(str2.length()-1));
        }
    }
}
