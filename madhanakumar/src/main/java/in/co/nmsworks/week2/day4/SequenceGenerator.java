package in.co.nmsworks.week2.day4;

public class SequenceGenerator {
    public static void main(String[] args) {
        SimpleAdder s = new SimpleAdder(1,5);
        SimpleMultiplier m = new SimpleMultiplier(2,1);
        printSequence(s,5);
        System.out.println();
        printSequence(m, 5);
    }

    private static void printSequence(Sequence sq, int N) {
            for (int i = 0; i <= N ; i ++){
                System.out.print(sq.next()+ "\t");
            }
        System.out.println();
    }
}
