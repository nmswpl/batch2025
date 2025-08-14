package in.co.nmsworks.weeks.day4;

public class MinMaxFinder{
        public static int findMin(int[] arr) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }


        public static int findMax(int[] arr) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }


        public static void main(String[] args) {
            int[] numbers = {5, 3, 9, 1, 6, 8};

            int min = findMin(numbers);
            int max = findMax(numbers);

            System.out.println("Minimum element: " + min);
            System.out.println("Maximum element: " + max);
        }



}
