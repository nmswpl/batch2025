/*
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
*/
package in.co.nmsworks.week1.day2.Pattern;

public class AlphabetPattern{

    public static void main(String[] args){
        alphabetPattern(7);
    }

    public static void alphabetPattern(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }

    }
}
