package in.co.nmsworks.weeks.day4;

public class SequenceGenerator
{
    public static void printSequence(Sequence seq, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(seq.next()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Sequence adderSequence = new SimpleAdder(1, 5);
        Sequence multiplierSequence = new SimpleMultifier(1, 4);

        System.out.print("SimpleAdder Sequence: ");
        printSequence(adderSequence, 5);
        System.out.print("SimpleMultiplier Sequence: ");
        printSequence(multiplierSequence, 5);
    }
}
