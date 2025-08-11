//Print all numbers divisible by 3 greater than 300 less than 400

package in.co.nmsworks.week1.test;

public class DivisibleByThree {
    public static void main(String[] args) {
        printDivisibleByThree(3);
    }

    public static void printDivisibleByThree(int n){
        for(int i=300 ; i<400 ; i++){
            if(i % 3 == 0){
                System.out.print(i+" ");
            }
        }

    }
}
