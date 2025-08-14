package in.co.nmsworks.week2.day4.sequence;

public class SequenceGenerator {
    public void printSequence(Sequence seq, int n){
        if (seq instanceof SimpleAdder){
            System.out.print("Addition Sequence : \t");
            SimpleAdder add = (SimpleAdder) seq;
            for (int i=1; i <= n ; i++){
                System.out.print(add.next()+"\t");
            }
            System.out.println();
        }
        else if (seq instanceof SimpleMultiplier) {
            System.out.print("Multiplication Sequence : \t");
            SimpleMultiplier mul = (SimpleMultiplier) seq;
            for (int i=1 ; i <= n ;i++){
                System.out.print(mul.next()+"\t");
            }
            System.out.println();
            
        }


    }
}
