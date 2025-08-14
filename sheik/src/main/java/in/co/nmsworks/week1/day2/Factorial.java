package in.co.nmsworks.week1.day2;

public class Factorial {
    public static void main(String[] args) {
        int n = 8;
        int fact = getFact(n);
        System.out.print("Fact of 5 =" + fact);
    }
    public static int getFact(int n){
        int factof = 1;
        for(int i = n; i > 0; i--){
            factof = factof * i;
        }
        return factof;
    }
}
