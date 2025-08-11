package in.co.nmsworks.week1.day2.string;

public class Palandrom {
    public static void main(String[] args) {
        String  givenString="madam";
        String reversed="";


        for(int i=givenString.length()-1;i>=0;i--)
        {
            reversed=reversed+givenString.charAt(i);
        }
        System.out.println("The Orginal String :"+givenString);
        System.out.println("After reversed String:" +reversed);
        if (givenString.equals(reversed))
        {
            System.out.println("it is palandrom");
        }
        else {
            System.out.println("no a Palandrom");
        }
    }
}
