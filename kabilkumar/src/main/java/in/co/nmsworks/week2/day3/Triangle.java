package in.co.nmsworks.week2.day3;

public class Triangle implements  Shape
{
    int base;
    int height;
    public Triangle(int base, int height)

    {
        this.base = base;
        this.height=height;
    }

    @Override
    public int peremeter() {
        return  base+height;
    }

    @Override
    public int area() {
        return base * (height/2);
    }
}
