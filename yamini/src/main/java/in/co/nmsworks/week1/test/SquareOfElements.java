package in.co.nmsworks.week1.test;

public class SquareOfElements {
    public static void main(String[] args) {
        printSquaresOfNumbers();

    }

    public static void printSquaresOfNumbers() {
        int arr[] = {2, 4, 3, 5};
        for (int j : arr) {
            System.out.print(j * j + " ");
        }
    }
}
