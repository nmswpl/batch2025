package in.co.nmsworks.week2.day3;

public interface Shape {
    public int perimeter();
    int area();
    int A = 5;
    default void printClassName(){
        System.out.println(getClass().getSimpleName());
    }
}

