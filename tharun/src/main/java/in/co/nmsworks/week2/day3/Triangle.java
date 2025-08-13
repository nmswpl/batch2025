package in.co.nmsworks.week2.day3;

public class Triangle implements Shape{

    private int base;
    private int height;

    public Triangle() {
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

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

    @Override
    public int perimeter() {
        return base + height ;
    }

    @Override
    public int area() {
        return ( base * height )/2;
    }
}
