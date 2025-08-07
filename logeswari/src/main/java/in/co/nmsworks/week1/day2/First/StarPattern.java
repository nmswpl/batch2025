package in.co.nmsworks.week1.day2.First;
//
public class StarPattern {


    static int n = 7;

    static void displayStar(){
        for (int i = 0; i <= 7; i++) {
            for (char j = 0; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        displayStar();

    }
}
