package in.co.nmsworks.week1.day2.pattern;

public class NumericPattern2 {
    public static void main(String[] args) {
        int rows =7;
        for(int i = 1; i<= rows; i++){
            for(int j=7;j>=i;j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
