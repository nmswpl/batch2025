package in.co.nmsworks.week2.day1.day3;

public class Square implements Shape{

    private int side;

    public int getSides() {
        return side;
    }

    @Override
    public String toString() {
        return "Square";
    }

    @Override
    public void printClassName() {
        System.out.println(getClass().getName());
    }

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public void setSides(int side) {
        this.side = side;
    }

    @Override
    public int perimeter() {
        return 4*side;
    }

    @Override
    public int area() {
        return side*side;
    }

    public String getDescription()
    {
        return "this is a Square";
    }
}
