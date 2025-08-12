package in.co.nmsworks.week2.day2;

public abstract class Animal {

    public abstract String Bark();

    public String canWalk()
    {
        return "yes";
    }

}
class Dog extends Animal
{
    public String Bark()
    {
        return "it can bark";
    }
    public String canWalk()
    {
        return "yes";
    }
}
