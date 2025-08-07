package in.co.nmsworks.week1.day2.patterns;

public class NumberPattern1 {
    public static void main(String[] args) {
        numPattern1(7);
        //        1
        //        1 2
        //        1 2 3
        //        1 2 3 4
        //        1 2 3 4 5
        //        1 2 3 4 5 6
        //        1 2 3 4 5 6 7
    }

    public static void numPattern1(int n) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
