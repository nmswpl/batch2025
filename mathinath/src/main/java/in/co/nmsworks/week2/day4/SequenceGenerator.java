package in.co.nmsworks.week2.day4;

public class SequenceGenerator {
    public static void main(String[] args) {

        SimpleAdder sa=new SimpleAdder(1,3);
        printSequence(sa,3);

        SimpleMultiplier sm=new SimpleMultiplier(1,2);
        printSequence(sm,3);
    }

    public  static void printSequence(Sequence seq,int N) {

        for(int i =0; i<N; i++)
        {
            System.out.println(seq.next());
        }
    }
}
