package in.co.nmsworks.week1.test;

public class NumberDivisible {

    public static void main(String[] args) {
      printNumberDivisible();
    }
    public static void printNumberDivisible(){
        System.out.println("Numbers divisible by 3 between 300 and 400:");
        for (int i = 301; i < 400; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}


