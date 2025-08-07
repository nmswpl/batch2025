package in.co.nmsworks.week1.day2;

public class StarPattern {
    static void starPattern(int value){
        for(int i=1;i<=value;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        starPattern(7);
    }
}
