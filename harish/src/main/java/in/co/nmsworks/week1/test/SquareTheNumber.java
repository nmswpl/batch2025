package in.co.nmsworks.week1.test;

public class SquareTheNumber {
    public static void main(String[] args) {
        int[] numberArray = {2,4,3,5};
        squareOf(numberArray);
    }
    public static void squareOf(int[] numberArray){

        for(int i = 0; i < numberArray.length ; i++){
            System.out.print(numberArray[i] * numberArray[i] + " ");
        }
    }

}
