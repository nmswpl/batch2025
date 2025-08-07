package in.co.nmsworks.week1.day2;
//8,Alphabet Pattern 1
public class AlphabetPattern {
    public static void main(String[] args) {

        printPattern();
    }
    public static void printPattern(){
        int n= 5;
        char alph='A';
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(alph +"");
            }
            alph=(char)('A'+i);


            System.out.println();
        }
    }
}

