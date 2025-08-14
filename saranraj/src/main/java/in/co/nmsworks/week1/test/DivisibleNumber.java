package in.co.nmsworks.week1.test;

public class DivisibleNumber {
    public static void main(String[] args) {
        printDivisibleNumber();
    }

    private static void printDivisibleNumber() {
        int divide = 3;
        System.out.println("print all divisible number between 300-400:");
        for(int i = 300; i <= 400; i++){
              if(i % divide == 0){
                  System.out.print(i + " ");
              }
        }
    }


}
