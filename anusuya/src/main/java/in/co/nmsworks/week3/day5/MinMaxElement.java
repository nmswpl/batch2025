package in.co.nmsworks.week3.day5;

public class MinMaxElement {

    public static void main(String[] args) {

        MinMaxElement mme = new MinMaxElement();

        mme.findAndPrintMinMaxElementInArray(new int[]{23,10,46,3,34});
    }

    private void findAndPrintMinMaxElementInArray(int[] numbers) {

        int minElement = numbers[0];
        int maxElement = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if(numbers[i] < minElement){
                minElement = numbers[i];
            }
            if(numbers[i] > maxElement){
                maxElement = numbers[i];
            }
        }

        System.out.println("Minimum Element is : " + minElement);
        System.out.println("Maximum Element is : " + maxElement);
    }
}
