package in.co.nmsworks.week1.day2;

public class LargestOfThree {
    public static void main(String[] args) {

        //Largest of Three
        int a = 2;
        int b = 5;
        int c = 3;
        largeOfThree(a, b, c);
    }
    public static void largeOfThree(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.print("a is large");
            }
            else {
                System.out.print("c is large");
            }
        }
        else {
            System.out.print("b is large");
        }

    }

}
