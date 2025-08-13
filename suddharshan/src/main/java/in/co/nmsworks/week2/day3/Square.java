package in.co.nmsworks.week2.day3;

public class Square implements Shape{
    private int side;

    public Square() {
    }

    @Override
    public void printClassName() {
        System.out.println(getClass().getName());
    }
    public String getDescription(){
        return "This is a Square";
    }
    @Override
    public int perimeter() {
        return 4*side;
    }

    @Override
    public int area() {
        return side*side;
    }

    public Square(int side) {
        this.side = side;
    }

}
