package in.co.nmsworks.week1.day2.patterns;

public class NumberPattern2 {
    public static void main(String[] args) {
        numPattern2(7);
//        1 1 1 1 1 1 1
//        2 2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4
//        5 5 5
//        6 6
//        7
    }

    public static void numPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}

