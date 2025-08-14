package in.co.nmsworks.week2.day4;

/**
 * Implement the algorithm to find the min and max elements in an array of integers.
 */
public class minAndMax {
    static void minAndMax(int [] input ){
        int min = input[0] , max = 0;
        for (int i = 0 ; i < input.length ;i++){
            if (min > input[i]){
                min = input[i];
            }
            if (max < input[i]){
                max = input[i];
            }
        }
        System.out.println("Minimum value : "+min);
        System.out.println("Maximum value : "+max);
    }
    public static void main(String[] args) {
        minAndMax(new int[]{13, 2, 99, 46, 33});
    }
}
