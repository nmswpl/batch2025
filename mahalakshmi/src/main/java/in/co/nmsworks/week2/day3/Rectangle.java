package in.co.nmsworks.week2.day3;

public class Rectangle implements Shape {
    private int breadth;
    private int length;


    public Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public int perimeter() {
        return (2 * (length+breadth));
    }

    @Override
    public int area() {
        return length * breadth;
    }



}
