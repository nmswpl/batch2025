package in.co.nmsworks.week2.day3;


public class Square implements Shape{

    private int side;

    @Override
    public int perimeter() {
        return 4*side;
    }

    @Override
    public int area() {
        return side*side;
    }
    public Square(){

    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square";
    }

    @Override
    public void printClassName() {
        Shape.super.printClassName();
        System.out.println(getClass().getName());
        System.out.println();
    }

    public String getDescription(){
        return "this is the square";
    }
}
