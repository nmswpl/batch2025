package in.co.nmsworks.week2.day4;

public class FindMinMax {

    public int min(int[] arr){

        int min = 0;

        for (int i : arr){
            if (i <= min){
                min = i;
            }
        }
        return min;
    }

    public int max(int[] arr){

        int max = 0;

        for (int i : arr){
            if (i >= max){
                max = i;
            }
        }
        return max;

    }


}
