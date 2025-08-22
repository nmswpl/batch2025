package in.co.nmsworks.week3.day5;

public class ModeOfArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 7, 7, 1, 1, 8};
        int mode = arr[0];
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        System.out.println("mode of the array is" + mode);
    }
}
