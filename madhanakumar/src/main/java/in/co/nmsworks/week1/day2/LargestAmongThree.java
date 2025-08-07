package in.co.nmsworks.week1.day2;

public class LargestAmongThree {
    //Find Largest Among Three Numbers
    public void findLarge(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("a is the Largest Number.....");
            }
        } else if (b > c) {
            System.out.println("b is the Largest Number.....");
        } else {
            System.out.println("c is the Largest Number.....");
        }
    }
    public static void main(String[] args) {
        LargestAmongThree la = new LargestAmongThree();
        la.findLarge(23,54,64);
    }
}
