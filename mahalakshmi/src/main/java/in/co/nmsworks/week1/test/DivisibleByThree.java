// 3. Write a programto print all numbers divisible by 3 greater than 300 and less than 400

package in.co.nmsworks.week1.test;
public class DivisibleByThree {
    public static void main(String[] args) {
        printNumbersDivisibleBy3(300,400);
    }

    public static void printNumbersDivisibleBy3(int beg, int end) {
        for(int i = beg+1; i < end ; i++) {
            if(i % 3 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
