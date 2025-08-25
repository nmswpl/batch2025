package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence
{
    private int startingNumber;
    private int ratio;
    private int next;

    SimpleMultiplier()
    {}

    SimpleMultiplier(int startingNumber, int ratio)
    {
        this.startingNumber = startingNumber;
        this.ratio = ratio;
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
        int res;
        res = next;
        next = startingNumber * ratio;
        startingNumber = next;
        return res;
    }

}
