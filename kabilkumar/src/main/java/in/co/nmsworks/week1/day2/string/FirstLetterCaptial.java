package in.co.nmsworks.week1.day2.string;

public class FirstLetterCaptial {
    public static void main(String[] args) {
        String givenSentense="this is my name";
        startWithCaptial(givenSentense);
    }
    public  static void startWithCaptial(String name)
    {
        String result="";
     String[] words=name.split(" ");
     for(int i=0;i<words.length;i++)
     {
         result=result+words[i].substring(0,1).toUpperCase()+ words[i].substring(1 )+" ";
     }
     System.out.println("the Orginal string :  " + name);
     System.out.println("After the sentense first letter captial :  "+result);
    }
}
