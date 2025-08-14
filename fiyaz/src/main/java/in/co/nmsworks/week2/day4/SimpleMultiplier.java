package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence {

    int startingNumber = 1;
    int increasesBy = 4;

    @Override
    public int next() {
        int temp = startingNumber * increasesBy;
        startingNumber =  temp;
        return temp;
    }
}
