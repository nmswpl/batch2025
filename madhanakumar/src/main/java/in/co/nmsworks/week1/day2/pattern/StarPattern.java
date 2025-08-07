package in.co.nmsworks.week1.day2.pattern;

public class StarPattern {
    public void starPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StarPattern sp = new StarPattern();
        sp.starPattern(7);
    }
}
