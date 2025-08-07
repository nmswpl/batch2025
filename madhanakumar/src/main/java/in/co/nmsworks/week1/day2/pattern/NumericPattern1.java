package in.co.nmsworks.week1.day2.pattern;

public class NumericPattern1 {
    public void rightAngleTrianglePattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        NumericPattern1 np = new NumericPattern1();
        np.rightAngleTrianglePattern(8);
    }
}
