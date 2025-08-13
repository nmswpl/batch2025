package in.co.nmsworks.week2.day3;

public class Triangle implements Shape{
    public Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    private int b;
    private int h;

    @Override
    public int perimeter() {
        return b+h;
    }

    @Override
    public int area() {
        return ((b*h)/2);
    }

    @Override
    public void printClassName() {
        System.out.println("Triangle of : "+getClass().getName());
    }
}
