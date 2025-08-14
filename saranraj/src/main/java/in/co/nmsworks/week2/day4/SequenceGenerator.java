package in.co.nmsworks.week2.day4;

public class SequenceGenerator {



    public static void main(String[] args) {
        SimpleAdder add = new SimpleAdder(0,2);
        SimpleMultiplier mul = new SimpleMultiplier(1,3);
        SequenceGenerator generate = new SequenceGenerator();
        generate.printSequence(add, 5);
        System.out.println();
        generate.printSequence(mul,5);
        System.out.println();



    }

    private void printSequence(Sequence seq, int n) {

        for( int i = 1;i <= n; i++){
            System.out.print(seq.next()+" ");
        }
    }


}
