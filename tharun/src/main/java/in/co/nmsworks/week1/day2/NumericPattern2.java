package in.co.nmsworks.week1.day2;

/**
 * 1 1 1 1 1 1 1
 * 2 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4
 * 5 5 5
 * 6 6
 * 7
 */
public class NumericPattern2 {
    static void descendingPattern(int limit){
        for(int i=1;i<=limit;i++){
            for(int j=0;j<limit-i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        descendingPattern(7);
    }
}
