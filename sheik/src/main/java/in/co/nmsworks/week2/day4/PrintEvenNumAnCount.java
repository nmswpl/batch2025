package in.co.nmsworks.week2.day4;

public class PrintEvenNumAnCount
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,8,10};
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+ " ");
                count++;
            }

        }
        System.out.println("count of even" +count);

    }
}
