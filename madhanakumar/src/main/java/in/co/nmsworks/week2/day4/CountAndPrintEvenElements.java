package in.co.nmsworks.week2.day4;

public class CountAndPrintEvenElements {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;

        for (int i = 0; i < a.length ; i++){
            if(i % 2 == 0 && i != 0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("\nNumber of Even elements present in array : "+count);

    }
}
