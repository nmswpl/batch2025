package in.co.nmsworks.week2.day4;

public class SequenceGenerator {
    public static void main(String[] args) {
        SimpleMultiplier simpleMultiplier=new SimpleMultiplier(1,3);
        SimpleAdder simpleAdder=new SimpleAdder(1,4);
        printSequence(simpleAdder,5);
        System.out.println();
        printSequence(simpleMultiplier,5);
    }

    public static void printSequence(Sequence seq,int N){
        for(int i=1;i<=N;i++){
            System.out.print(seq.next()+" ");
        }
    }
}
