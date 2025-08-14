package in.co.nmsworks.week2.day4;

public class SequenceGenerator {


    public static void printSequence(Sequence seq, int n){
        System.out.println(seq.getClass().getSimpleName()+"\n");
        for (int i = 0; i < n; i++){

            System.out.println(seq.next());

        }
        System.out.println();

    }


    public static void main(String[] args) {
        SimpleAdder adder = new SimpleAdder(10,2);
        SimpleMultiplier multiplier = new SimpleMultiplier(10,2);

        printSequence(adder,4);
        printSequence(multiplier,3);
    }


}
