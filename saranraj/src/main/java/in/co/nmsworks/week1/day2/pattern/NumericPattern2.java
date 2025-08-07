package in.co.nmsworks.week1.day2.pattern;

/*

1 1 1 1 1 1 1
2 2 2 2 2 2
3 3 3 3 3
4 4 4 4
5 5 5
6 6
7

 */

public class NumericPattern2 {

    public static void main(String[] args) {

        printPattern();
    }
    public static void printPattern(){

        for(int i = 1; i <= 7; i++){

            for(int j = i; j <= 7; j++){

                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
