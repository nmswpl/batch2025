package in.co.nmsworks.week2.day4;

public class SimpleAdder implements Sequence
{
    private int startingNumber;
    private int step;
    private int next;
    SimpleAdder()
    {}

    SimpleAdder(int startingNumber, int step)
    {
        this.startingNumber = startingNumber;
        this.step = step;
        next = startingNumber;
    }

    public int getStartingNumber()
    {
        return startingNumber;
    }

    public void setStartingNumber(int startingNumber)
    {
        this.startingNumber = startingNumber;
    }

    public int getStep()
    {
        return step;
    }

    public void setStep(int step)
    {
        this.step = step;
    }

    @Override
    public int next()
    {
        int res;
        res = next;
        next = startingNumber + step;
        startingNumber = next;
        return res;
    }
}
