package in.co.nmsworks.week2.day3;

public class Square implements Shape{
    private int side;
    @Override
    public int perimeter() {
        return  4*side;
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

    @Override
    public void printClassName() {
        System.out.println(getClass().getName());
    }

    public String getDescription(){
        return "This is a Square" ;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
