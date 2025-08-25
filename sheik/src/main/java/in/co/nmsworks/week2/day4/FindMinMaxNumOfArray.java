package in.co.nmsworks.week2.day4;

public class FindMinMaxNumOfArray
{
    public static void main(String[] args) {
        int [] arr = {1,3,5,0,7,11,9,4};
        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
