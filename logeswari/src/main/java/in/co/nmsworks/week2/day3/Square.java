package in.co.nmsworks.week2.day3;

public class Square implements Shape {
    public Square(int side) {
        this.side = side;
    }

    private int side;

    @Override
    public int perimeter() {
        return 4*side;
    }

    @Override
    public int area() {
        return side*side;
    }

    @Override
    public void printClassName() {
        System.out.println("new square : "+getClass().getName());
    }
    public String getDescription() {
        System.out.println("new square : "+getClass().getName());
        return "square";
    }


}
