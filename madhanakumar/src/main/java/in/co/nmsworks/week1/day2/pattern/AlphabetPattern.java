package in.co.nmsworks.week1.day2.pattern;

public class AlphabetPattern {

    public void printAlphabetPattern(int n){
        for (int i = 0; i <= n; i++)
        {
            for (int j = 1; j <= i ; j++) {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        AlphabetPattern ap = new AlphabetPattern();
        ap.printAlphabetPattern(10);
    }

}
