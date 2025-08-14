package in.co.nmsworks.week2.day3;

public class Square implements Shape{

    private int side;

    public Square(){

    }

    Square(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int perimeter() {
        return 4*getSide();
    }

    @Override
    public int area() {
        return getSide()*getSide();
    }

    @Override
    public void printClassName() {
        System.out.println(getClass().getName());
    }

    public String getDescription(){
        return "This is a square ";
    }
}
