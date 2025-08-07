package in.co.nmsworks.week1.day2.patterns;
/*
A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G
 */
public class PatternFour {
    public static void main(String[] args) {
        int a = 6;
        findPattern(a);
    }
    public static void findPattern(int x){
        char lim = (char) (65 + x);
        for(char i = 65; i<=lim;i++){
            for(int j = 0;j < i-64; j++){
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }
}

