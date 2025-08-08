package in.co.nmsworks.week1.day2.pattern;

public class AlphabetPattern {
    public static void main(String[] args) {
        int rows = 7;
        for(int i = 1; i<= rows; i++){
            char a = (char) (i + 64);
            for(int j=1;j<=i;j++){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
