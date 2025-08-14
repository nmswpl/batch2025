package in.co.nmsworks.week2.day4;

public class CountNoOfEven {

    public static void main(String[] args) {
        int[] element = {11,12,13,14,15,16};
        printCountNoOfEvenElement(element);

    }

    private static void printCountNoOfEvenElement(int[] element) {
        int count = 0;
        for(int i : element) {
            if( i % 2 == 0) {
                count++;
            }
        }
        System.out.println("The Count Of Even Numbers : " + count);
    }
}
