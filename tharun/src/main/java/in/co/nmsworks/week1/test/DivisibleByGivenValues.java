package in.co.nmsworks.week1.test;

public class DivisibleByGivenValues {
    static void printDivisibleByInput(int divisor,int fromRange,int toRange){
        for(int i=fromRange+1;i<toRange;i++){
            if(i%divisor==0) {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        int divisor=3,startsFrom=300,endsTo=400;
        printDivisibleByInput(divisor,startsFrom,endsTo);
    }
}
