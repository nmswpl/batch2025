package in.co.nmsworks.week2.day3;

public class Triangle {

    private int base;
    private int height;

    public int perimeter() {
        return base + height ;
    }

    public int area() {
        return (base * height / 2);
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }


    public void printClassName() {
        System.out.println("TRIANGLE");
    }
}
