package in.co.nmsworks.week2.day3;

public class Square implements Shape{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int periMeter() {
        return 4 * side;
    }

    @Override
    public int area() {
        return side * side;
    }

    @Override
    public void printClassName() {
        System.out.println(getClass().getSimpleName());
    }

    public String getDescription(){
        return "This is a square";
    }
}
