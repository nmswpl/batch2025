package in.co.nmsworks.week2.day4;

public class SimpleAdder implements Sequence{

    private int startingNumber;
    private int step;
    private int addedValue;

    public SimpleAdder(){
        System.out.println("Adder Sequence");
    }

    public SimpleAdder(int startingNumber, int step){
        this.startingNumber = startingNumber;
        this.step = step;
        addedValue = startingNumber;
    }

    @Override
    public int next() {
        int temp = addedValue;
        addedValue += step;
        return temp;
    }
}
