package in.co.nmsworks.week2.day4;

public class SequenceGenerator {
    public static void main(String[] args) {

        SimpleAdder add = new SimpleAdder();
        SimpleMultiplier multi = new SimpleMultiplier();
        printSequence(add,3);
        printSequence(multi,5);
    }
    public static void printSequence(Sequence s,int n){
        int startnumber = 1;
        System.out.println(startnumber);
        for(int i = 0 ; i < n; i++) {
            startnumber = s.next(startnumber,3);
            System.out.println(startnumber);

        }
    }
}
