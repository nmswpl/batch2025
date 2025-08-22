package in.co.nmsworks.week3.day5;

public class SecondLargest {

    public static void main(String[] args) {

        SecondLargest sl = new SecondLargest();

        sl.printSecondLargestElement(new int[]{10,26,3,50,44});
    }

    private void printSecondLargestElement(int[] numbers) {

        int maxElement = numbers[0];
        int secondMaxElement = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if(numbers[i] > maxElement){
                secondMaxElement = maxElement;
                maxElement = numbers[i];
            }
            if((numbers[i] < maxElement) && (numbers[i] > secondMaxElement)){
                secondMaxElement = numbers[i];
            }
        }

        System.out.println("Second Maximum Element : " + secondMaxElement);
    }
}
