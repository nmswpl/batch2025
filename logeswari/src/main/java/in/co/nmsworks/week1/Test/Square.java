package in.co.nmsworks.week1.Test;
import java.util.Arrays;

public class Square {
    static void displaySqare(){
        int[] arr=new int[4];

        arr[0]=2;
        arr[1]=4;
         arr[2]=3;
         arr[3]=5;
        for(int i=0;i<arr.length;i++){
//            arr =i^i;
            System.out.println(arr.toString());

         }

        System.out.println(arr.toString());
    }

    public static void main(String[] args) {
        displaySqare();
    }
}
