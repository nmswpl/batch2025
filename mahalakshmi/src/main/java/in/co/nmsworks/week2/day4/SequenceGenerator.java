package in.co.nmsworks.week2.day4;

public class SequenceGenerator {

    public static void printSequence (Sequence seq, int N) {
        for(int i = 0 ; i <= N ; i++) {
            System.out.print(seq.next() + "\t");
        }
    }

    public static void main(String[] args) {
        Sequence s1 = new SimpleAdder(1,3);
        printSequence(s1, 5);
        System.out.println();
        Sequence s2 = new SimpleMultiplier(1, 4);
        printSequence(s2, 5);
    }
}

