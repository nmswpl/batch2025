package in.co.nmsworks.week2.day4;

public class MinMaxInArray {

        public static void main(String[] args) {
            int [] arr = {1,2,4,6,13,8,10};
            printMaxAndMin(arr);
        }

        public  static void printMaxAndMin(int[] arr) {
           int minValue = arr[0];
           int maxValue = 0;
           for(int i : arr){
               if (i <= minValue){
                   minValue = i;
               }
               else if (i >= maxValue){
                   maxValue = i;
               }
           }
            System.out.println("Minimum Value :" + minValue);
            System.out.println("Maximum Value :" + maxValue);
        }

    }

