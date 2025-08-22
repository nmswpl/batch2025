package in.co.nmsworks.week3.day5;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printNumbers();
    }

    private void printNumbers() {
        for (int number = 1 ; number <= 100 ; number++){
            if (number % 3 == 0){
                if (number % 5 == 0){
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
