
package in.co.nmsworks.week1.Test;

public class DivisbleNum {
    public static void main(String[] args) {

        int n = 3;
        findDivisblenum(3);
    }

    public static void findDivisblenum(int num) {

        int i = 300;
        while (i <= 400) {
            if (i%num == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
