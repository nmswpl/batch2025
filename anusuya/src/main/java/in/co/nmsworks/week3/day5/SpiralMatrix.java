package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {

        SpiralMatrix sm = new SpiralMatrix();

        int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        sm.convertAndPrintMatrixToSpiral(array);
    }

    private void convertAndPrintMatrixToSpiral(int[][] array) {

        List<Integer> resultArray = new ArrayList<>();
        int left = 0;
        int right = array[0].length -1;
        int top = 0;
        int bottom = array[0].length-1;

        while (left <= right && top <= bottom){

            for (int i = left; i <= right; i++){
                resultArray.add(array[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++){
                resultArray.add(array[i][bottom]);
            }
            right--;

            for (int i = right; i >= left; i--){
                resultArray.add(array[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top; i--){
                resultArray.add(array[i][left]);
            }
            left++;
        }
        System.out.println("Spiral version of Array in terms of List is : " + resultArray);
    }
}
