package in.co.nmsworks.week1.day2.First;
//
public class NumberPattern {
    static int n=7;

    static void displayNumPattern(){
        for(int i=0; i<=7; i++){
            for(int j=1 ;j<=i; j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
    displayNumPattern();
    }


}




