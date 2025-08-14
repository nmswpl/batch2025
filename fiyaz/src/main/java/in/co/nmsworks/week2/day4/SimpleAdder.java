package in.co.nmsworks.week2.day4;

public class SimpleAdder implements Sequence{

    int startingNumber = 1;
    int increasesBy = 3;


    @Override
    public int next() {
        int temp = startingNumber + increasesBy;
        startingNumber =  temp;
        return temp;
    }
}
