package in.co.nmsworks.week1.day2.pattern;


public class PatternFour {
    public static void main(String[] args) {

        int num = 71;
        patternFour (num);
    }

    public static void patternFour(int n) {
        for (int i=65; i<=n; i++) {
            for(int j=65; j<i+1; j++) {
                System.out.print((char)i + " ");
            }
            System.out.println();
        }

    }

}
