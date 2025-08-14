package in.co.nmsworks.weeks.day4;

public class FindSecondLargest {

        public static int findSecondLargest(int[] arr) {
            if (arr.length < 2) {
                return -1;
            }

            int largest = arr[0];
            int secondLargest = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }

            if (largest == secondLargest) {
                return -1;
            }

            return secondLargest;
        }

        public static void main(String[] args) {
            int[] numbers = {12, 35, 1, 10, 34, 1};

            int result = findSecondLargest(numbers);

            if (result == -1) {
                System.out.println("There is no second largest element.");
            } else {
                System.out.println("The second largest element is: " + result);
            }
        }




}





