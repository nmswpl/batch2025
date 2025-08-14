package in.co.nmsworks.week2.day3;

public interface Shape
{

    int perimeter();

    int area();

    default void printClassName()
    {
        System.out.println(getClass().getSimpleName());
    }

}
