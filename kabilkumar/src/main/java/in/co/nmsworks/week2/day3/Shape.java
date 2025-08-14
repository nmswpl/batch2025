package in.co.nmsworks.week2.day3;

public interface Shape {
     final  int A = 6;

    public  int peremeter();

    int area();

    default void printClassName() {
        System.out.println(getClass().getSimpleName());
    }


}
