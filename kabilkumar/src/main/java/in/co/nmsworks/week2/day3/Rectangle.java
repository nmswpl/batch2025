package in.co.nmsworks.week2.day3;

public class Rectangle implements  Shape
{
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    private int length;
    private  int breadth;

    @Override
    public int peremeter() {
        return 2 * (length+breadth);
    }

    @Override
    public int area() {
        return length*breadth;
    }
}
