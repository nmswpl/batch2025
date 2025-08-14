package in.co.nmsworks.weeks.day4;

public class EventCount {

        public static void printEvenCount(int[] arr) {
            int count = 0;

            for (int num : arr) {
                if (num % 2 == 0) {
                    count++;
                }
            }

            System.out.println("Number of even elements: " + count);
        }

        public static void main(String[] args) {
            int[] numbers = {3, 6, 7, 10, 14, 21, 22};
            printEvenCount(numbers);
        }




}
