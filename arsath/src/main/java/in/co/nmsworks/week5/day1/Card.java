package in.co.nmsworks.week5.day1;

public class Card {
    private String shape;
    private int number;

    public Card() {
    }

    public Card(String shape, int number) {
        this.shape = shape;
        this.number = number;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "shape='" + shape + '\'' +
                ", number=" + number +
                '}';
    }
}
