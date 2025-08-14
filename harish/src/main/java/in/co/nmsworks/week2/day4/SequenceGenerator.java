package in.co.nmsworks.week2.day4;

public class SequenceGenerator {
    public static void main(String[] args) {

        SimpleAdder add = new SimpleAdder();
        SimpleMultiplier multi = new SimpleMultiplier();
        printSequence(add,5,3);
        printSequence(multi,5,3);
    }
    public static void printSequence(Sequence s,int startnumber, int n){

        for(int i = 0 ; i < n; i++) {
            System.out.println(s.next(startnumber,n));
            startnumber = s.next(startnumber,n);
        }
    }
}
