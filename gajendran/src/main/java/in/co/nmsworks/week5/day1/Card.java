package in.co.nmsworks.week5.day1;

public class Card
{
    String value;
    String shape;

    public Card(String shape, String value)
    {
        this.shape = shape;
        this.value = value;
    }

    @Override
    public String toString() {
        return "value = " + value + ", shape = " + shape ;
    }
}
