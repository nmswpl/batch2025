package in.co.nmsworks.week1.day2.pattern;


public class PatternOne {
    public static void main(String[] args) {

        int num = 7;
        patternOne(num);
    }

    public static void patternOne(int n) {
        for (int i=1; i<=n; i++) {
            for(int j=1; j<i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
