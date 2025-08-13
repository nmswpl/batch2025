package in.co.nmsworks.week2.day3;

public interface Shape {
    public int perimeter();
    int area();
    default void printShape(){
        System.out.println(getClass().getSimpleName());
    }


}
