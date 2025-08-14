package in.co.nmsworks.week2.day4;

public class SequenceGenerator {
    public static void main(String[] args) {

        SimpleAdder sd = new SimpleAdder(1,3);
        SequenceGenerator.printSequence(sd, 5);

         SimpleMultiplier sm = new SimpleMultiplier(1, 3);
        SequenceGenerator.printSequence(sm, 5 );
    }

    public static void printSequence(Sequence sq, int N ) {
        for(int i=1; i<= N ; i++)
        {
            System.out.print(sq.next()+ " ");
        }
        System.out.println();

    }
}
