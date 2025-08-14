package in.co.nmsworks.week2.day4;

public class SequenceGenerator {
    public static void main(String[] args) {

//        SimpleAdder sa = new SimpleAdder();
//        printSequence(sa,5);

        SimpleMultiplier sm = new SimpleMultiplier();
        printSequence(sm,5);
    }

    public static void printSequence(Sequence seq, int nmu) {
        for (int i = 0; i < nmu; i++ ) {
            System.out.println(seq.next());
        }
    }

}
