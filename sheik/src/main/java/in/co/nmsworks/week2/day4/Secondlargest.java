package in.co.nmsworks.week2.day4;

public class Secondlargest
{
    public static void main(String[] args) {
        int[] arr ={1,4,2,6,3,8};
        int large = Integer.MIN_VALUE;
        int secondLarge = 0;

        for(int i=0;i<arr.length;i++){
                 if(large<arr[i]){
                     secondLarge = large;
                     large = arr[i];
                 }
                 else if(secondLarge<arr[i]){
                     secondLarge = arr[i];
                 }
        }
       // return secondLarge;
    }
}
