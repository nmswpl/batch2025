package in.co.nmsworks.week2.day1.day3;

public class Triangle implements Shape{
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle() {
    }

    @Override
    public int perimeter() {
        return base+height;
    }

    @Override
    public int area() {
        return base*(height/2);
    }
}
