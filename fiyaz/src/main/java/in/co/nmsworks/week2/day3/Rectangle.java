package in.co.nmsworks.week2.day3;

public class Rectangle implements Shape{

    private int length;
    private int breadth;

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public int area() {
        return length * breadth;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void printClassName() {
        System.out.println("RECTANGLE");
    }
}
