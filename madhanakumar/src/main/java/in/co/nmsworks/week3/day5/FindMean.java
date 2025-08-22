package in.co.nmsworks.week3.day5;

public class FindMean {
    public static void main(String[] args) {
        FindMean findMean = new FindMean();
        findMean.getMean();
    }

    private void getMean() {
        int[] array = new int[]{6,21,30,61,4,19};
        float sum = 0;
        for (int i = 0 ; i < array.length ; i++){
            sum += array[i];
        }
        System.out.println("Mean of The Given array is : "+sum / array.length);
    }
}
