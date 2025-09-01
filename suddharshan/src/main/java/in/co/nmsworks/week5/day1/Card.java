package in.co.nmsworks.week5.day1;

public class Card {
    private String shape;
    private int value;

    public Card() {
    }

    public Card(String shape, int value) {
        this.shape = shape;
        this.value = value;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
