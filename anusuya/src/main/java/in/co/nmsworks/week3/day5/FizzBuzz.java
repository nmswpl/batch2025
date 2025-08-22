package in.co.nmsworks.week3.day5;

public class FizzBuzz {

    public static void main(String[] args) {

        FizzBuzz fb = new FizzBuzz();

        fb.printWordBasedOnDivisor(1,100);
    }

    private void printWordBasedOnDivisor(int start, int end) {

        for (int i = start; i <= end; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Fizz Buzz");
                continue;
            }
            if (i % 3 == 0){
                System.out.println("Fizz");
            }
            if (i % 5 == 0){
                System.out.println("Buzz");
            }
        }
    }
}
