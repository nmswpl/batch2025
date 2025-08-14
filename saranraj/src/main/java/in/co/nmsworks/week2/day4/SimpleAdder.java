package in.co.nmsworks.week2.day4;

public class SimpleAdder implements Sequence{

    int startingNumber;
    int step;

    public int getStartingNumber() {
        return startingNumber;
    }


    public SimpleAdder(int startingNumber, int step) {
        this.startingNumber = startingNumber;
        this.step = step;
    }

    public void setStartingNumber(int startingNumber) {
        this.startingNumber = startingNumber;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    int next ;
    @Override
    public int next() {

        next += startingNumber + step;
        return next;
    }
}
