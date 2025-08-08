package in.co.nmsworks.week1.day2;
//8.Star Pattern 1 :
public class Starpattern {
        public static void main(String[] args) {
            printStarPattern();
        }
        public static void printStarPattern(){
            int n = 5;


            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

}

