package in.co.nmsworks.week2.day3;

public class Triangle implements Shape{
   private int base;
    private int height;

    @Override
    public int perimeter() {
        return base+height;
    }

    @Override
    public int area() {
        return base*(height/2);
    }

    public Triangle(int base,int height) {
        this.base = base;
        this.height=height;
    }
}
