package in.co.nmsworks.week1.day2.pattern;

/*Alphabet Pattern 1 :
A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G */

public class AlphabeticPattern {

    static void printPattern ( char letter, int limit){

        for(int i = 1; i <= limit; i++ ){
            for( int j = 1; j <= i; j++){
                System.out.print(letter + " ");
            }
            System.out.println();
            letter += 1;
        }
    }

    public static void main(String[] args) {

        char letter = 'A';
        int limit = 7;
        printPattern(letter, limit);
    }
}
