package in.co.nmsworks.week2.day3;

public class Triangle implements Shape{
    private int base;
    private int height;

    public Triangle() {
    }

    @Override
    public int perimeter() {
        return base+height;
    }

    @Override
    public int area() {
        return (1/2) * base * height ;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
}
