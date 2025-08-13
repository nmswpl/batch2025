package in.co.nmsworks.week2.day3;

public class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int periMeter(){
        return base + height;
    }

    public int area(){
        return (base * height) / 2;
    }
}
