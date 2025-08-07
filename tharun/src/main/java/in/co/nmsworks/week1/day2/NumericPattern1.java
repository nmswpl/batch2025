package in.co.nmsworks.week1.day2;

/**
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4 5 6
 * 1 2 3 4 5 6 7
 */
public class NumericPattern1 {
    static void ascendingPattern(int value){
        for(int i=1;i<=value;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ascendingPattern(7);
    }
}
