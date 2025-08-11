//square of each element in a  array  2, 4, 3 ,5
package in.co.nmsworks.week1.test;

public class PrintElementSquare {
    public static void main(String[] args) {

        int[] arr={2,4,3,5};
        squareEachElement(arr);
    }

    public static void squareEachElement(int[] inputArray){
        for(int i=0 ; i<inputArray.length ; i++){
            System.out.print(inputArray[i]*inputArray[i]+" ");
        }
    }
}
