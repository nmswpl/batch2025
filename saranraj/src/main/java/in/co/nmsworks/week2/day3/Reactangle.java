package in.co.nmsworks.week2.day3;

public class Reactangle implements Shape {


    private int length;
    private int breadth;

    public Reactangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int perimeter() {

        return 2 * (length + breadth);
    }

    @Override
    public int area() {

        return length * breadth;
    }


}
