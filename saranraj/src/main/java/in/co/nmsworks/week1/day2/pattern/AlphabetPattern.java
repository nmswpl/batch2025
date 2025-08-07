package in.co.nmsworks.week1.day2.pattern;

/*

A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G

 */

public class AlphabetPattern {
    public static void main(String[] args) {
        printAlphabetPattern();
    }
    public static void printAlphabetPattern(){
        for(int i=65;i<=71;i++){
            for(int j=65;j<=i;j++){
                char a=(char) i;
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
