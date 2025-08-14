package in.co.nmsworks.week2.day3;

public class Rectangle implements Shape{
    private int length;
    private int breath;

    public Rectangle(int breath, int length) {
        this.breath = breath;
        this.length = length;
    }

    @Override
    public int perimeter() {
        return 2 * (length + breath);
    }

    @Override
    public int area() {
        return length * breath;
    }
}
