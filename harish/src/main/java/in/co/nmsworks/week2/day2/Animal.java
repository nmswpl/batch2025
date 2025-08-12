package in.co.nmsworks.week2.day2;

public abstract class Animal
{
    public abstract void makeSound();

    String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal {

    String barkOrNot;

    @Override
    public void makeSound() {
        System.out.println("yes barging");
    }

    public String getBarkOrNot() {
        return barkOrNot;
    }

    public void setBarkOrNot(String barkOrNot) {
        this.barkOrNot = barkOrNot;
    }
}

