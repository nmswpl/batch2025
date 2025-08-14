package in.co.nmsworks.week2.day4;

public class CheckVowelOrConosonants {
    public static void main(String[] args) {

        char ch = 'A';
        findTheAlph(ch);
    }

    public static void findTheAlph(char getcharacter)
    {
        if(getcharacter == 'A' || getcharacter == 'E' || getcharacter == 'I' ||getcharacter == 'O' || getcharacter == 'U' )
        {
            System.out.println(getcharacter +" is an Alphabet");
        }
        else
        {
            System.out.println(getcharacter +" is not an Alphabet");
        }
    }
}
