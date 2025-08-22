package in.co.nmsworks.week3.day5;

public class SecondLargestElement {
    public static void main(String[] args) {
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        secondLargestElement.findSecondLargestElementInArray();
    }

    private void findSecondLargestElementInArray() {
        int[] integerArray = new int[]{6,21,30,61,4,19};
        int firstMax = integerArray[0];
        int secondMax = 0;
        for (int iterate = 1 ; iterate < integerArray.length ; iterate++){
            if (integerArray[iterate] > firstMax){
                secondMax = firstMax;
                firstMax = integerArray[iterate];
            }
        }
        System.out.println("The Second Largest Element Present in the Array is : "+secondMax);
    }
}
