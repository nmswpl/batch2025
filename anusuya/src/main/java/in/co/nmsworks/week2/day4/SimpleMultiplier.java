package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence{

    private int startingNumber;
    private int ratio;
    private int addedValue;

    public SimpleMultiplier(){
        System.out.println("Multiplier Sequence");
    }

    public SimpleMultiplier(int startingNumber, int step){
        this.startingNumber = startingNumber;
        this.ratio = step;
        addedValue = startingNumber;
    }

    @Override
    public int next() {
        int temp = addedValue;
        addedValue *= ratio;
        return temp;
    }

}
