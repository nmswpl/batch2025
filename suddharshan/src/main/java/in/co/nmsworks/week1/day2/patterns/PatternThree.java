package in.co.nmsworks.week1.day2.patterns;
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 */
public class PatternThree {
    public static void main(String[] args) {
        int a = 7;
        findPattern(a);
    }
    public static void findPattern(int x){
        for(int i = 1; i<=x;i++){
            for(int j =1; j<i+1; j++){
                System.out.print ("* ");
            }
            System.out.println("\n");
        }
    }
}


