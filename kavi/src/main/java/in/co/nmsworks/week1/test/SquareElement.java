package in.co.nmsworks.week1.test;

public class SquareElement {

        public static void printSquareElement()
        {
            int[] numbers = {2, 4, 3, 5};

            System.out.println("Original Array Elements:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println("\n");

            System.out.println("Squares of Array Elements:");
            for (int i = 0; i < numbers.length; i++) {
                int square = numbers[i] * numbers[i];
                System.out.println("Square of " + numbers[i] + " is: " + square);
            }
        }

    public static void main(String[] args) {
        printSquareElement();
    }

}

