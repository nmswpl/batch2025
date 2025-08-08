package in.co.nmsworks.week1.day2.string;
//Program to Print words which have even length in the given string
public class PrintEvenLengthOfTheString {
    public void printEvenLengthOfTheString(String s){
        String [] s1 = s.split(" ");
        for (int i = 0; i <s1.length ; i++) {
            if(s1[i].length() % 2 == 0){
                System.out.println(s1[i]);
            }
        }
    }
    public static void main(String[] args) {
        PrintEvenLengthOfTheString eve = new PrintEvenLengthOfTheString();
        eve.printEvenLengthOfTheString("This is a java language");
    }
}
