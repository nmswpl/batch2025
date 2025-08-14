package in.co.nmsworks.week2.day4;

public class SequenceGenerator {
    public static void main(String[] args) {
        SimpleAdder seq1 = new SimpleAdder(0,5);
        SimpleMultiplier seq2 = new SimpleMultiplier(1,3);

        printSequence(seq1,5);

        System.out.println();

        printSequence(seq2,10);
    }

    public static void printSequence(Sequence seq, int n){
        if(seq instanceof SimpleAdder){
            System.out.println("Addition Sequence: " );
            for(int i=1; i<=n; i++){
                System.out.println(seq.next());
            }
        }

        else if (seq instanceof SimpleMultiplier ){
            System.out.println("Multiplication Sequence: ");
            for(int i=1; i<=n; i++){
                System.out.println(seq.next());
            }
        }

    }
}
