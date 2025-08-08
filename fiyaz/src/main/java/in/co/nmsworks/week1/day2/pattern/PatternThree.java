package in.co.nmsworks.week1.day2.pattern;


public class PatternThree {
    public static void main(String[] args) {

        int num = 7;
        patternThree(num);
    }

    public static void patternThree(int n) {
        for (int i=1; i<=n; i++) {
            for(int j=1; j<i+1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}
