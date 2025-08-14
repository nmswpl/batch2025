package in.co.nmsworks.week2.day4;

public class SequenceGenerator {

    public static void main(String[] args) {
        Sequence adder=new SimpleAdder();
        adder.sequence(3);
        printSequence(adder,2);

        Sequence multiply=new SimpleMultiplier();
        multiply.sequence(3);
        printSequence(multiply,3);
    }

    public static void printSequence(Sequence seq, int N){
        System.out.println("*******");
    }

}
