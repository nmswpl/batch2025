package in.co.nmsworks.week1.day2;

public class Patterns {
    public static void main(String[] args) {
        numericPattern1(7);
        System.out.println();
        numericPattern2(7);
        System.out.println();
        starPattern(7);
        System.out.println();
        alphabetPattern(7);
    }

    public  static  void numericPattern1(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i ; j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void numericPattern2(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = n ; j >= i ;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void starPattern(int n){
        for(int i = 0; i <= n ; i++){
            for(int j = 1; j <= i ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void alphabetPattern(int n){
        char ch = 'A';
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i ; j++ ){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}
