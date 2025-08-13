package in.co.nmsworks.week2.day3;

public interface Shape {
    public int periMeter();
    int area();

    default void printClassName(){
        System.out.println(getClass().getSimpleName());
    }

}
