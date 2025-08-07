package in.co.nmsworks.week1.day2.Pattern;


public class PatternTwo {
    public static void main(String[] args) {

        int num = 8;
        patternTwo(num);
    }

    public static void patternTwo(int n) {
        for (int i=1; i<n; i++) {
            for(int j=n+1; j>i+1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
