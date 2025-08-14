package in.co.nmsworks.week2.day4;

public class SequenceGenerator {

    public static void main(String[] args) {

        SequenceGenerator sg = new SequenceGenerator();

        SimpleMultiplier sm = new SimpleMultiplier();
        SimpleMultiplier sm1 = new SimpleMultiplier(1,2);
        sg.printSequence(sm1, 5);

        SimpleAdder sa = new SimpleAdder();
        SimpleAdder sa1 = new SimpleAdder(1,5);
        sg.printSequence(sa1, 5);
    }

    public void printSequence(Sequence s, int N){

        for(int i = 1; i <= N; i++){
            System.out.print(s.next() + " ");
        }
        System.out.println();
    }
}
