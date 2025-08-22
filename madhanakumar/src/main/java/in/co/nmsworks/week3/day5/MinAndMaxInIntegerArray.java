package in.co.nmsworks.week3.day5;

public class MinAndMaxInIntegerArray {
        public static void main(String[] args) {
        MinAndMaxInIntegerArray minAndMaxInIntegerArray = new MinAndMaxInIntegerArray();
        minAndMaxInIntegerArray.findMinAndMax();
    }

    private void findMinAndMax() {
        int[] number = new int[]{6,21,30,61,4,19};
        int max = number[0];
        int min = number[0];
        for (int iterate = 1 ; iterate < number.length ; iterate++){
            if (number[iterate] > max){
                max = number[iterate];
            }
            if (number[iterate] < min){
                min = number[iterate];
            }
        }
        System.out.println("The Maximum element present in the Array of Integer is : "+max);
        System.out.println("The Minimum element present in the Array of Integer is : "+min);
    }
}
