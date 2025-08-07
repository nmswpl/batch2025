package in.co.nmsworks.week1.day2.pattern;

public class NumericPattern2 {
    public void downsideRightAngleNumericPattern(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        NumericPattern2 np = new NumericPattern2();
        np.downsideRightAngleNumericPattern(8);
    }
}
