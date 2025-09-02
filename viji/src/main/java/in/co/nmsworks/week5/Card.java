package in.co.nmsworks.week5;

public class Card {

    private String numbers;
    private String shape ;

    public Card(String numbers, String shape) {
        this.numbers = numbers;
        this.shape = shape;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "{" +
                "numbers='" + numbers + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
