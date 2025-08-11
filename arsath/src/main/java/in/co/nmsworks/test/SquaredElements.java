package in.co.nmsworks.test;

public class SquaredElements {
    public static void squareOfElementsInAnArray(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            arr[i]*=arr[i];
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,5};
        squareOfElementsInAnArray(arr);
    }
}
