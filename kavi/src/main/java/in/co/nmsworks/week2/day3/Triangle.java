package in.co.nmsworks.week2.day3;

public class Triangle implements Shape {
    private int base;
    private int height;

    @Override
    public int perimeter() {
        return base*height;
    }

    @Override
    public int area() {
        return base*(height/2);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public Triangle(){

    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }


    @Override
    public void printClassName() {
        Shape.super.printClassName();
        System.out.println(getClass().getName());
    }
}
