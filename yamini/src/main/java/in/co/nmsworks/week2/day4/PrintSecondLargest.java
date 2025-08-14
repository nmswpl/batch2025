package in.co.nmsworks.week2.day4;

public class PrintSecondLargest {
    public static void main(String[] args) {
        printSecondLargest();

    }
    public static void printSecondLargest(){
        int arr[]={23,12,16,34,22};
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        for(int i=1;i< arr.length;i++) {
            if (arr[i] > large) {
                large=arr[i];
                secondLarge=large;
            }
            if (arr[i]<large && arr[i]!=secondLarge) {
                secondLarge=arr[i];

            }
        }
        System.out.println(secondLarge);
    }
}
