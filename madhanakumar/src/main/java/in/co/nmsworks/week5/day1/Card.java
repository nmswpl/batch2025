package in.co.nmsworks.week5.day1;

public class Card {
    private int value;
    private String shape;

    public Card(String shape, int value) {
        this.shape = shape;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return "shape='" + shape + '\'' +
                ", value=" + value+";";
    }
}
