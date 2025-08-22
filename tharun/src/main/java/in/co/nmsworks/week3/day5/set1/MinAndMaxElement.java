package in.co.nmsworks.week3.day5.set1;

public class MinAndMaxElement {
    public static void main(String[] args) {
        MinAndMaxElement minAndMaxElement = new MinAndMaxElement();
        int [] inputArray = {3,5,7,1,6,8,2};
        minAndMaxElement.printMinAndMaxElement(inputArray);
    }

    private void printMinAndMaxElement(int[] inputArray) {
        int minElement = inputArray[0];
        int maxElement = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < minElement){
                minElement = inputArray[i];
            }
            if (inputArray[i] > maxElement){
                maxElement = inputArray[i];
            }
        }
        System.out.println("Array : "+inputArray+" \n Minimum Element : "+minElement+" \n Maximum Element : "+maxElement);
    }
}
