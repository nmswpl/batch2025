package in.co.nmsworks.week2.day4;

public class SequenceGenerator
{
    public static void main(String[] args)
    {
        SimpleAdder add = new SimpleAdder(1, 3);
        SimpleMultiplier mul = new SimpleMultiplier(1, 5);

        printSequence(add, 10);
        printSequence(mul, 5);
    }

    public static void printSequence(Sequence seq, int N)
    {
        for( int i = 0; i < N; i++ )
        {
            System.out.print(seq.next() + " ");
        }
        System.out.println();
    }
}
