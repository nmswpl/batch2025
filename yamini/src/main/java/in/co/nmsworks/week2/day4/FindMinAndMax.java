package in.co.nmsworks.week2.day4;

public class FindMinAndMax {
    public static void main(String[] args) {
        printMinAndMax();
    }
    public static void printMinAndMax(){
        int arr[]={2,4,1,6,8,3,9};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
