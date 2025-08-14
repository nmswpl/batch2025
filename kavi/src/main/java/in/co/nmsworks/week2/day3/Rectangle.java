package in.co.nmsworks.week2.day3;

class Rectangle implements Shape {
    private int width;
    private int height;


    public Rectangle(){

    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int perimeter() {
        return 2*(width+height);
    }

    @Override
    public int area() {
        return width*height;
    }

    @Override
    public void printClassName() {
        Shape.super.printClassName();
    }
}
