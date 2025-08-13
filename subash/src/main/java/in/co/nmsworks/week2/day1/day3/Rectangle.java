package in.co.nmsworks.week2.day1.day3;

public class Rectangle implements Shape{

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public Rectangle() {
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    private int length;
    private int breadth;


    @Override
    public int perimeter() {
        return 2*(length+breadth);
    }

    @Override
    public int area() {
        return length*breadth;
    }
}
