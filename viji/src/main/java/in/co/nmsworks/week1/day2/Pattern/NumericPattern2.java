/*
1111111
222222
33333
4444
555
66
7*/
package in.co.nmsworks.week1.day2.Pattern;

public class NumericPattern2 {

    public static void main(String[] args) {
        numericPattern2(8);
    }

    public static void numericPattern2(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
