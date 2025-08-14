package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence
{
    private int startingNumber;
    private int ratio;

    SimpleMultiplier()
    {}

    SimpleMultiplier(int startingNumber, int ratio)
    {
        this.startingNumber = startingNumber;
        this.ratio = ratio;
    }

    public int getStartingNumber()
    {
        return startingNumber;
    }

    public void setStartingNumber(int startingNumber)
    {
        this.startingNumber = startingNumber;
    }

    public int getRatio()
    {
        return ratio;
    }

    public void setRatio(int ratio)
    {
        this.ratio = ratio;
    }

    @Override
    public int next()
    {
        int next;
        next = startingNumber * ratio;
        startingNumber = next;
        return next;
    }

}
