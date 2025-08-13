package in.co.nmsworks.week2.day3;

public class Triangle implements Shape{

    private int base;
    private int high;

    @Override
    public int perimeter() {
        return 0;
    }

    public Triangle(int base, int high) {
        this.base = base;
        this.high = high;
    }

    @Override
    public int area() {
        return base * (high/2);
    }
}
