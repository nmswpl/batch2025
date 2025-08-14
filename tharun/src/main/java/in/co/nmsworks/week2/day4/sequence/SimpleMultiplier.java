package in.co.nmsworks.week2.day4.sequence;

public class SimpleMultiplier implements Sequence{
    int StartingValue , multipleBy , currentValue ;

    public SimpleMultiplier(int startingValue, int multipleBy) {
        this.StartingValue = startingValue;
        this.multipleBy = multipleBy;
    }

    @Override
    public int next() {
        this.StartingValue *= multipleBy;
        return this.StartingValue;
    }
}
