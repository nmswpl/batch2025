package in.co.nmsworks.week2.day3;

public class Rectangle implements Shape{
    private int l;
    private int b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public int perimeter() {
        return (2*(l+b));
    }

    @Override
    public int area() {
        return l*b;
    }

    @Override
    public void printClassName() {
        System.out.println("new :"+getClass().getSimpleName());
    }
}
