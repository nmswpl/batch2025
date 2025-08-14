package in.co.nmsworks.week2.day4;

public class SequenceGenerator {
    public void printSequence(Sequence sq, int N){
        for(int i = 0; i < N; i++){
            System.out.print(sq.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleAdder sa = new SimpleAdder(5, 2);
        SimpleMultiplier sm = new SimpleMultiplier(7,2);

        SequenceGenerator sq = new SequenceGenerator();
        sq.printSequence(sa, 10);
        sq.printSequence(sm, 5);
    }
}
