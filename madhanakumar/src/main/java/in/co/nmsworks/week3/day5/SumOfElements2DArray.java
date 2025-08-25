package in.co.nmsworks.week3.day5;

public class SumOfElements2DArray {
    public static void main(String[] args) {
        SumOfElements2DArray sumOfElements2DArray = new SumOfElements2DArray();
        sumOfElements2DArray.getSum();
    }

    private void getSum() {
        int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println("The sum of all the elements in the array is : "+sum);
    }
}
