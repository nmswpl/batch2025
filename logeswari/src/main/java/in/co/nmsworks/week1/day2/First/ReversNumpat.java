package in.co.nmsworks.week1.day2.First;

public class ReversNumpat {

    static int n=7;
    static void reverseNum(){
        for(int i=7; i>=1; i--){
            for(int j=1 ;j<=i; j++){
                System.out.print(i);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        reverseNum();
    }
}
