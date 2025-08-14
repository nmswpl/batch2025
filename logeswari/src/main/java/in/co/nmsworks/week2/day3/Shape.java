package in.co.nmsworks.week2.day3;

public interface Shape {
//    public void printShape();
    int A=7;
    public int perimeter();

    public int area();

    default void printClassName(){
        System.out.println(getClass().getSimpleName());

    }

}
