
/*
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
*/
package in.co.nmsworks.week1.day2.pattern;


public class Alpabhetpattern {
    public static void main(String[] args) {
        int NoOfRows = 5;
        char[] arr={'A','B','C','D','E'};
        aLphabetPattern(arr,NoOfRows);

    }
    public static void aLphabetPattern(char[] arr,int NoOfRows){
        for(int i = 0;i < NoOfRows; i++){
            for(int j = 0;j <= i; j++){
                System.out.print(arr[i]);
            }
            System.out.println("");
        }
    }
}
