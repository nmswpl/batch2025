package in.co.nmsworks.week2.day3;

public interface Shape
{
    //final int AGE = 0;
    //final int ID= 8;
    public int perimeter();

    int area();


    default void printClassName(){
        System.out.println(getClass().getSimpleName());
    }
}
