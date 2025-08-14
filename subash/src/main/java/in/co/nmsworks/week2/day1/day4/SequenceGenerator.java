package in.co.nmsworks.week2.day1.day4;

public class SequenceGenerator {
    public Sequence getSq() {
        return sq;
    }

    public void setSq(Sequence sq) {
        this.sq = sq;
    }

    private Sequence sq;


    public static void main(String[] args) {

        SimpleAdder simpAdd=new SimpleAdder(20,30);
        System.out.println(simpAdd.next());

        SimpleMultiplier simpMul=new SimpleMultiplier(20,30);
        System.out.println(simpMul.next());

        SequenceGenerator sq=new SequenceGenerator();
        printSequence(simpMul,5);

        SequenceGenerator sq1=new SequenceGenerator();
        printSequence(simpAdd,10);


    }

    public static void printSequence(Sequence seq,int n)
    {
        for (int i=0;i<n;i++)
        {
            System.out.println(seq.next());
            System.out.println();
        }

    }
}
