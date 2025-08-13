package in.co.nmsworks.week2.day3;

public class Square implements Shape {

    private int side;
    @Override
    public int perimeter() {
        return 4 * side;
    }

    @Override
    public int area() {
        return side * side;
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void printClassName() {
        System.out.println("SQUARE");
    }

    public String getDescrip() {
        return getDescrip();
    }
}
