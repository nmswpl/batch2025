package in.co.nmsworks.week2.day3;

import java.util.GregorianCalendar;

public class Square implements Shape{
    private int side;

    @Override
    public int perimeter() {
        return side * 4;
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }


    @Override
    public void printClassName() {
        System.out.println(getClass().getName());
    }

    public String getDescription(){
        System.out.println("this is");
        return "This is Square";
    }
}
